/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.prototype.service.impl;

import com.biggirlo.design.prototype.service.WxConfigService;

/**
 * 服务号配置
 * @author 王雁欣
 * create on 2019/1/26 14:55 
 */
public class WxCpService implements WxConfigService {

    private String appId;

    private String name;


    @Override
    public WxConfigService clone() {
        return null;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
