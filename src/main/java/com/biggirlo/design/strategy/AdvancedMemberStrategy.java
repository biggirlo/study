/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.strategy;

/**
 *
 * @author 王雁欣
 * create on 2019/1/29 12:09 
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("高级会员8折");
        return booksPrice * 0.8;
    }
}
