package com.xiaogang.learn.javaBasics.f_ClassAndObj.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/10 22:25
 */
public class Hero {

    public String name = "亚索";
    //如果不写public,在包外就不能通过对象调用该属性
    public float hp;
    float mp;
    //该属性子类不能继承
    private float armor;
    protected int moveSpeed;

    /**
     * 构造方法
     * 1.和类名同名
     * 2.没有返回类型
     * 3.实例化对象，必然调用其构造方法
     * 4.如果不写，就会默认提供一个无参的构造方法
     * 5.如果被子类继承，则实例化子类的时候，也调用父类的构造方法
     */
    public Hero() {
        //如果只有一个有参的构造方法，则被继承的时候，子类需要重新该方法，super
        System.out.println("实例化Hero");
    }

    public Hero(String name,int hp) {
        this.name = name;
        this.hp = hp;
    }


    /**
     * 攻击方法
     * @return
     */
    public void attack(Hero hero,int demage){
        hero.hp = hero.hp - demage;
    }

    /**
     * 攻击方法
     * @return
     */
    public void attack1(Hero hero,int demage){
        hero.hp = this.hp - demage;
    }

    /**
     * 攻击方法
     * @return
     */
    public void attack2(Hero hero,int demage){
        System.out.println(this);
        System.out.println(hero);
        this.hp = hero.hp - demage;
    }

    public void revive(Hero h) {
        h = new Hero("提莫",400);
        System.out.println(h);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }
}
