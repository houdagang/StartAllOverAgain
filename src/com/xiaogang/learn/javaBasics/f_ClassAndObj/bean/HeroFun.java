package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 类方法
 * @创建日期 : 2020/5/12 22:51
 */
public class HeroFun {

    public String name;
    protected float hp;
    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
    public void die(){
        hp = 0;
    }
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin() {
        System.out.println("battle");
    }

    public static void main(String[] args) {
        HeroFun garen =  new HeroFun();
        garen.name = "盖伦";
        //必须有一个对象才能调用
        garen.die();
        HeroFun teemo =  new HeroFun();
        teemo.name = "提莫";
        //和访问类属性一样，调用类方法也有两种方式
        //1. 对象.类方法
        garen.die();
        //2. 类.类方法
        //无需对象，直接通过类调用
        HeroFun.battleWin();

        /**
         * 什么时候用类方法，什么时候用对象方法
         * name属性是对象属性，只有存在一个具体对象的时候，name才有意义。
         * 如果方法里访问了对象属性，那么这个方法，就必须设计为对象方法
         *
         * 如果一个方法，没有调用任何对象属性，那么就可以考虑设计为类方法
         */

    }
}
