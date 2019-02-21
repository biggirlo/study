/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.proxy.invocation;

/**
 *
 * @author 王雁欣
 * create on 2019/1/28 23:34 
 */
public class Client {

    public static void main(String[] args){
        CameraProxy proxy = new CameraProxy();
        Camera bookProxy = (Camera) proxy.bind(new CameraImpl());
        bookProxy.photo("2000","200","3f");
    }

}
