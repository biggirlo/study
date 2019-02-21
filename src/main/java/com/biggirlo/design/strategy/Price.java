/**
 * **********************************************************
 * 该项目仅用于学习
 * 有任何疑问或者建议请致邮件于 email:645614025@qq.com
 * **********************************************************
 * **********************************************************
 */
package com.biggirlo.design.strategy;

/**
 * 价格计算
 * @author 王雁欣
 * create on 2019/1/29 11:40 
 */
public class Price {

    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy){
        this.memberStrategy = memberStrategy;
    }

    public double quote(double booksPrice){
        return memberStrategy.calcPrice(booksPrice);
    }

}
