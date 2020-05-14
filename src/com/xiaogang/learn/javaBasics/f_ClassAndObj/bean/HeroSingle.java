package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 单例模式
 * @创建日期 : 2020/5/14 20:41
 */
public class HeroSingle {

    /**
     * 单例模式又叫做 Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在。
     */

    //饿汉式单例模式
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private HeroSingle(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个

    private static HeroSingle heroSingle = new HeroSingle();

    //public static 方法，提供给调用者获取定义的对象
    public static HeroSingle getHeroSingle(){
        return heroSingle;
    }


}
