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
 * create on 2019/1/28 22:05 
 */
public class UserServiceImpl implements UserService {

    @Override
    public void login(String userId) {
         System.out.println("登录id：" + userId +"登录中...");
    }
}
