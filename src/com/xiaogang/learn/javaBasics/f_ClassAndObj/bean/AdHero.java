package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/11 20:20
 */
public class AdHero extends Hero {
    //上面继承Hero没有import ，是因为在同一包下

    protected String lx;

    public AdHero(int i) {
        System.out.println("AdHero的构造方法");
        //this.hp指的是父类或者自身的hp参数，后面是传的值
        //this指的是当前对象
    }

    /**
     * 以下两个方法，继承Hero，方法名相同但是参数不同，叫做方法的重载
     */

    public void attack() {
        System.out.println("攻击未命中");
    }

    //当参数为两个的时候，优先匹配这个而不是下面那个，如果没有这个的话，会匹配下面那个
    public void attack(Hero hero1,Hero hero2) {
        System.out.println("攻击" + hero1.getName());
        System.out.println("同时攻击" + hero2.getName());
    }

    //可变的方法参数
    public void attack(Hero... heros) {
        for(int i = 0; i < heros.length;i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);
        }
    }

    public static void main(String[] args) {
        AdHero adHero = new AdHero(1);
        //可以访问
        adHero.moveSpeed = 1;
        //报错
        //adHero.armor = 1.0f;
    }

}
