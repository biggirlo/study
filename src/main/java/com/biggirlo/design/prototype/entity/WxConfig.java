/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.prototype.entity;

import java.io.*;

/**
 *
 * @author 王雁欣
 * create on 2019/2/21 16:14 
 */
public class WxConfig implements Cloneable ,Serializable {

    private AppModel appModel;

    public void setAppModel(AppModel appModel){
        this.appModel = appModel;
    }

    public AppModel getAppModel(){
        return appModel;
    }

    //浅克隆
    @Override
    public WxConfig clone(){
        WxConfig stu = null;
        try {
            stu = (WxConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }

    //深克隆
    public WxConfig deepClone() throws Exception {
        WxConfig stu = null;
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bo);
        oos.writeObject(this);
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        stu = (WxConfig) oi.readObject();
        return stu;
    }
}
