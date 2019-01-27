/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.prototype;

import com.biggirlo.design.prototype.service.WxConfigService;
import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务管理
 * 这里用来登记克隆对象
 * @author 王雁欣
 * create on 2019/1/26 14:53 
 */
public class ServiceManage {

    /**
     * 登记
     */
    private static Map<String,WxConfigService> map = new HashMap();

    /**
     * 注册
     * @param appId
     * @param wxConfigService
     */
    public static void setPrototype(String appId,WxConfigService wxConfigService){
        map.put(appId,wxConfigService);
    }

    public static WxConfigService getPrototype(String appId){
        return map.get(appId);
    }
}
