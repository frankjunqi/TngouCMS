package net.tngou.action.client;

import net.tngou.entity.PageUtil;
import net.tngou.pojo.Info;
import net.tngou.service.PageService;

import javax.servlet.ServletException;
import java.io.IOException;

public class IndexAction extends BaseAction {

    @Override
    public void execute() throws ServletException, IOException {

        Info info = _getInfo();
        PageService pageService = new PageService();
        PageUtil newsPage = pageService.getPageWith(1, 5, 2, "1");//新闻资讯
        root.put("newsPage", newsPage);
        PageUtil productsPage = pageService.getPageWith(1, 6, 3, "1");//产品资讯
        root.put("productsPage", productsPage);
        PageUtil productsErPage = pageService.getPageWith(1, 6, 3, "2");//产品副标题二处
        root.put("productsErPage", productsErPage);
        root.put("title", info.getName() + "-首页");
        root.put("keywords", info.getName() + "官方网站");
        root.put("description", info.getName() + "地址：" + info.getAddress() + "," + info.getName() + "联系电话：" + info.getTel());
        root.put("type", 0);
        printFreemarker("default/index.ftl", root);
    }
}
