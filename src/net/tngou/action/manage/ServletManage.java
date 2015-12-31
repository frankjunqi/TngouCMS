package net.tngou.action.manage;

import net.tngou.action.client.BaseAction;
import net.tngou.http.HttpRequest;
import net.tngou.http.HttpResponse;
import net.tngou.http.RequestContext;
import net.tngou.http.ResponseContext;
import net.tngou.jdbc.DBManager;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/manage/*", "/manage"},
        initParams = {@WebInitParam(name = "package", value = "net.tngou.action.manage")})
public class ServletManage extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final static Logger log = LoggerFactory.getLogger(ServletManage.class);
    private static String packages;//action的路径包


    /**
     * 初始化,主要是完成module的内存加载<br>
     * 从配置文件中读取module对于类
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        packages = config.getInitParameter("package");
        super.init();
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpRequest request = new RequestContext(req);
        HttpResponse response = new ResponseContext(resp);

        String module = request.getModule();//取得调用类
        String action = request.getAction();  //取得调方法
        BaseAction baseAction = _retrieveModule(module); //初始调用类
        if (baseAction == null) {
            //没有找到Module 返回404
            response.sendError(HttpServletResponse.SC_NOT_FOUND);//返回404
            return;
        }
        baseAction.init(request, response); //初始化baseAction
        if (StringUtils.isNotEmpty(action)) {
            baseAction.run(); //执行
        } else //默认执行
        {
            try {
                baseAction.execute();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                DBManager.closeConnection(); //释放数据库连接到连接池中
            }
        }
    }


    /**
     * 销毁
     */
    @Override
    public void destroy() {
        log.debug("destroy");
        super.destroy();
    }


    /**
     * 通过类的名称 ，返回名称对于的对象。如果没有找到该对象，返回NULL
     *
     * @param module 类的名称 如：test.action.TestAction
     * @return 返回 Object对象
     */
    private BaseAction _retrieveModule(String module) {
        if (module == null) module = "index";
        module = StringUtils.capitalize(module + "Action");//module后添加Action 并且把第一个字母转为大写
        String moduleClass = packages + "." + module;
        //com.mykaoyan.action.TestAction
        try {
            BaseAction baseAction;
            baseAction = (BaseAction) Class.forName(moduleClass).newInstance();
            return baseAction;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            log.error("没有对用的{}类", moduleClass);
            e.printStackTrace();
        }
        return null;
    }

}
