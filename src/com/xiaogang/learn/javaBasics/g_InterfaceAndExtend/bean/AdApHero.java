package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean;

import com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.interf.AD;
import com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.interf.AP;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/14 22:45
 */
public class AdApHero implements AD, AP {

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
