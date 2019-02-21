/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.proxy.staticProxy;

/**
 * 静态代理
 * @author 王雁欣
 * create on 2019/1/28 22:10 
 */
public class UserServiceProxy  implements UserService{

    private UserServiceImpl userService ;

    UserServiceProxy(UserServiceImpl userServiceImpl){
        this.userService = userServiceImpl;
    }

    @Override
    public void login(String userId) {
        System.out.println("登录前校验");
        userService.login(userId);
        System.out.println("登录成功");
    }
}
