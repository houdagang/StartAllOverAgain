package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/17 14:38
 */
public abstract class Animal extends Object{

    public Animal() {
    }

    public static void move() {
        System.out.println("可以移动");
    }

    /**
     * 当用final修饰类的时候，该类不能被继承
     * final 修饰方法的时候，方法不能被重写,可以被重载
     * final 修饰变量，只有一次赋值机会
     * final 修饰引用，只有一次指向对象的机会。
     */

    /**
     * 当用abstract 修饰类的时候，该类为抽象类
     * abstrack 修饰方法的时候，子类必须重写该方法。（抽象方法在抽象类里面，但是抽象类可以没有抽象方法）
     */

    /**
     * 抽象类和接口的区别
     * 区别1：
     *      子类只能继承一个抽象类，不能继承多个
     *      子类可以实现多个接口
     * 区别2：
     *      抽象类可以定义
     *          public,protected,package,private
     *          静态和非静态属性
     *          final和非final属性
     *      但是接口中声明的属性，只能是
     *          public
     *          静态
     *          final的
     * 即便没有显式的声明
     */

    public final void Alive() {

    }

    public abstract void attack(String a);

    ;


}
