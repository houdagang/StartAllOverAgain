package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.interf;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/14 22:39
 */
public interface AD {

    public void physicAttack();

    public static final int hp = 0;

    /**
     * 默认方法是JDK8新特性，指的是接口也可以提供具体方法了，而不像以前，只能提供抽象方法
     */
    default public void revive() {

    }

    /**
     * 其实接口的属性默认被public static final修饰
     */
    String name = null;


}
