package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 类属性
 * @创建日期 : 2020/5/12 22:17
 */
public class HeroPro {

    /**
     * 类属性： 又叫做静态属性
     * 对象属性： 又叫实例属性，非静态属性
     * 如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
     */
    //实例属性，对象属性，非静态属性
    public String name;
    protected float hp;
    //静态属性
    static String copyright;

    public static void main(String[] args) {
        HeroPro garen =  new HeroPro();
        garen.name = "盖伦";
        HeroPro.copyright = "版权由Riot Games公司所有";
        System.out.println(garen.name);
        System.out.println(garen.copyright);

        HeroPro teemo =  new HeroPro();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        //访问类属性有两种方式
        //1. 对象.类属性
        System.out.println(teemo.copyright);
        //2. 类.类属性
        System.out.println(HeroPro.copyright);

        teemo.copyright = "12345";
        //共享
        System.out.println(teemo.copyright);
        System.out.println(garen.copyright);
        System.out.println(HeroPro.copyright);

        /**
         * 什么时候使用类属性，什么时候使用对象属性？
         * 如果一个属性，每个英雄都不一样，比如name，
         * 这样的属性就应该设计为对象属性，因为它是跟着对象走的，每个对象的name都是不同的
         *
         * 如果一个属性，所有的英雄都共享，都是一样的，那么就应该设计为类属性。比如血量上限，
         * 所有的英雄的血量上限都是 9999，不会因为英雄不同，而取不同的值。 这样的属性，就适合设计为类属性
         */


    }

}
