package net.tngou.action.client;

import net.tngou.pojo.Info;
import net.tngou.pojo.User;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginAction extends BaseAction {

    @Override
    public void execute() throws ServletException, IOException {

        // test
        if (!request.isSubmit()) {
            Info info = _getInfo();
            root.put("title", info.getName() + "_登录");
            printFreemarker("default/login.ftl", root);
        } else {
            String account = request.getParameter("account");
            String password = request.getParameter("password");

            User bean = new User();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("account", account);
            map.put("password", password);
//			map.put("password", DigestMD.MD5(password));
            User user = bean.get(map);
            if (user != null) {
                session.setAttribute("user", user);
                sendRedirect(getDomain().getBase() + "/manage");
            } else {
                Info info = _getInfo();
                root.put("message", "登录失败：请确认账户或者密码的准确性！");
                root.put("title", info.getName() + "_登录");
                printFreemarker("default/login.ftl", root);
            }

        }
    }

    public void exit() {
        session.removeAttribute("user");
        sendRedirect(getDomain().getBase() + "/client" + "/login");
    }
}
