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
 * create on 2019/1/28 23:04 
 */
public class CameraImpl implements Camera {
    @Override
    public void photo(String iso, String shutter, String aperture) {
        System.out.println("正在拍照");
    }
}
