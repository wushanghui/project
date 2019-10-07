package com.wsh.pattern.flyweight;

import java.util.HashMap;

/**
 * 网站工程类
 * @author wsh
 * @date 2019-10-05 15:39
 */
public class WebSiteFactory {

    /**
     * 集合，充当池的作用
     */
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //创建一个网站，放入池中
            pool.put(type, new ConcreteWebSite(type));
        }

        return (WebSite)pool.get(type);
    }

    /**
     * 获取网站分类的总数 （池中有多少个网站类型）
     * @return
     */
    public int getWebSiteCount() {
        return pool.size();
    }
}
