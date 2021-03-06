package net.tngou.pojo;

/**
 * Created by kjh08490 on 2015/12/31.
 * 项目的实体
 */
public class Urlrule extends POJO {

    private String projectname;//项目名称；
    private String projectid;//项目id；
    private String urlfunctionname;//规则设计的页面，或者功能；
    private String urldesc;//规则的描述信息；
    private String urlroletips;// 规则版本支持；如：1.0~2.0
    private String androidactivity;//规则对应的Android的activity的名称；
    private String ioscontrolname;// 规则对应的ios的control页面的名称；
    private String urlprotocol;//规则的协议前缀；
    private String urlparameter;//规则的参数列表Json list字符串；
    private String urlinterceptor;//规则的拦截器说明 josn list字符串；（拦截器table显示并且高亮）
    private String urlshow;//规则是否对外开放；
    private String urldemo;//规则的默认链接示例；
    private String urlremark;//规则的备注信息；
    private String urlupdatetime;//规则上次修改时间；-- 字段废弃


    private String createtime;// 创建时间
    private String createauthor;// 创建人
    private String updatetime;// 修改时间
    private String updateauthor;// 修改人

    public String getCreatetime() {
        return createtime;
    }

    public String getCreateauthor() {
        return createauthor;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public String getUpdateauthor() {
        return updateauthor;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public void setCreateauthor(String createauthor) {
        this.createauthor = createauthor;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public void setUpdateauthor(String updateauthor) {
        this.updateauthor = updateauthor;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public void setUrlfunctionname(String urlfunctionname) {
        this.urlfunctionname = urlfunctionname;
    }

    public void setUrlroletips(String urlroletips) {
        this.urlroletips = urlroletips;
    }

    public void setAndroidactivity(String androidactivity) {
        this.androidactivity = androidactivity;
    }

    public void setIoscontrolname(String ioscontrolname) {
        this.ioscontrolname = ioscontrolname;
    }

    public void setUrldesc(String urldesc) {
        this.urldesc = urldesc;
    }

    public void setUrlprotocol(String urlprotocol) {
        this.urlprotocol = urlprotocol;
    }

    public void setUrlparameter(String urlparameter) {
        this.urlparameter = urlparameter;
    }

    public void setUrlinterceptor(String urlinterceptor) {
        this.urlinterceptor = urlinterceptor;
    }

    public void setUrlshow(String urlshow) {
        this.urlshow = urlshow;
    }

    public void setUrldemo(String urldemo) {
        this.urldemo = urldemo;
    }

    public void setUrlremark(String urlremark) {
        this.urlremark = urlremark;
    }

    public void setUrlupdatetime(String urlupdatetime) {
        this.urlupdatetime = urlupdatetime;
    }

    public String getProjectid() {
        return projectid;
    }

    public String getUrlfunctionname() {
        return urlfunctionname;
    }

    public String getUrlroletips() {
        return urlroletips;
    }

    public String getAndroidactivity() {
        return androidactivity;
    }

    public String getIoscontrolname() {
        return ioscontrolname;
    }

    public String getUrldesc() {
        return urldesc;
    }

    public String getUrlprotocol() {
        return urlprotocol;
    }

    public String getUrlparameter() {
        return urlparameter;
    }

    public String getUrlinterceptor() {
        return urlinterceptor;
    }

    public String getUrlshow() {
        return urlshow;
    }

    public String getUrldemo() {
        return urldemo;
    }

    public String getUrlremark() {
        return urlremark;
    }

    public String getUrlupdatetime() {
        return urlupdatetime;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
}
