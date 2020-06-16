package com.xiaogang.learn.javaBasics.l_ArrayList.Other;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-16 11:27
 */
public class HeroTest {

    public String name;

    public float hp;

    public int damage;

    public HeroTest (String s) {
        name = s;
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    public HeroTest(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

}
