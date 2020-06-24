package com.xiaogang.learn.javaBasics.n_Lambda.testObj;

import com.xiaogang.learn.javaBasics.k_IO.Test5Bean.Hero;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-24 9:21
 */
public class HeBean implements Comparable<HeBean>{

    public String name;
    public float hp;
    public int damage;

    public HeBean() {

    }

    public HeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //初始化name,hp,damage的构造方法
    public HeBean(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public int compareTo(HeBean anotherHero) {
        if(damage < anotherHero.damage) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

}
