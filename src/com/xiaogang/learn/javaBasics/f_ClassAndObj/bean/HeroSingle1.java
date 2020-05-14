package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 懒汉式单例模式
 * @创建日期 : 2020/5/14 20:47
 */
public class HeroSingle1 {

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private HeroSingle1(){
    }

    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static HeroSingle1 instance;

    //public static 方法，返回实例对象
    public static HeroSingle1 getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance){
            instance = new HeroSingle1();
        }
        //返回 instance指向的对象
        return instance;
    }

}
