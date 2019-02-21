/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.proxy.codeGenerationLibrary;

/**
 *
 * @author 王雁欣
 * create on 2019/1/29 0:33 
 */
public class Client {

    public static void main(String[] args) {
        CameraCglib cglib=new CameraCglib();
        Camera bookCglib=(Camera)cglib.getInstance(new Camera());
        bookCglib.photo("2000","200","3f");
    }
}
