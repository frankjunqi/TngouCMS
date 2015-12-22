package net.tngou.pojo;

import net.tngou.util.JsoupUtil;

import java.sql.Timestamp;
import java.util.Date;


/**
 * @author kjh
 */
public class Page extends POJO {


    private String title;    //
    private String message;    //

    public String getIsshowindex() {
        return isshowindex;
    }

    public void setIsshowindex(String isshowindex) {
        this.isshowindex = isshowindex;
    }

    private String isshowindex;// 是否显示在首页

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String desc;// 描述信息
    private int menu;
    private int count;
    private String img;
    private Timestamp time = new Timestamp(new Date().getTime());


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public Timestamp getTime() {
        return time;
    }


    public void setTime(Timestamp time) {
        this.time = time;
    }


    @Override
    protected boolean isObjectCachedByID() {
        // TODO Auto-generated method stub
        return true;
    }


    public int getMenu() {
        return menu;
    }


    public void setMenu(int menu) {
        this.menu = menu;
    }


    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public String getImg() {
        return img;
    }


    public void setImg(String img) {
        this.img = img;
    }


    public String Img() {
        return JsoupUtil.Image(message);
    }

}
