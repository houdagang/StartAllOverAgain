package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean;

import com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.interf.AD;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/14 22:43
 */
public class AdHero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
