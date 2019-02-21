/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.prototype;

import com.biggirlo.design.prototype.entity.AppModel;
import com.biggirlo.design.prototype.entity.WxConfig;

/**
 * 客户端
 * @author 王雁欣
 * create on 2019/1/26 14:52 
 */
public class Client {

    public static void main(String[] args) throws Exception {
        WxConfig s = new WxConfig();
        s.setAppModel(new AppModel());


        WxConfig a = s.clone();
        WxConfig b = s.deepClone();
        System.out.println("Complate s and a : " + (s.equals(a)));
        System.out.println("Complate s and b : " + (s.equals(b)));
        System.out.println("Complate s and a : " + (s.getAppModel() == a.getAppModel()));
        System.out.println("Complate s and b : " + (s.getAppModel() == b.getAppModel()));
    }
}
