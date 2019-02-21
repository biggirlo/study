/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.proxy.staticProxy;

/**
 *
 * @author 王雁欣
 * create on 2019/1/28 22:12 
 */
public class Client {

    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.login("1");
    }

}
