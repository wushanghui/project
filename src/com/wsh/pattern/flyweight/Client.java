package com.wsh.pattern.flyweight;

/**
 * @author wsh
 * @date 2019-10-05 15:37
 */
public class Client {

    public static void main(String[] args) {
        //1. 创建工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //2. 客户以新闻形式发布网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));

        //3. 客户以博客形式发布网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("Jerry"));

        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("King"));

        System.out.println("网站的分类一共："+webSiteFactory.getWebSiteCount()+" 个");
    }
}
