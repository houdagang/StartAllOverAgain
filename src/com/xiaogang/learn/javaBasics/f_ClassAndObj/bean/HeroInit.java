package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 属性初始化
 * @创建日期 : 2020/5/14 20:31
 */
public class HeroInit {

    public String name = "some hero"; //声明该属性的时候初始化
    protected float hp;
    float maxHP;
    //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化

    static{
        itemCapacity = 6;//静态初始化块 初始化
    }

    {
        maxHP = 200; //初始化块
    }

    public HeroInit(){
        hp = 100; //构造方法中初始化
    }

    /**
     * 属性初始化顺序
     * 属性声明
     * 初始化块
     * 构造方法
     */

}
