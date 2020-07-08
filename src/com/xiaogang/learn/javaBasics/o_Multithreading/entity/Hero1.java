package com.xiaogang.learn.javaBasics.o_Multithreading.entity;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-29 17:11
 */
public class Hero1 {

    public String name;
    public float hp;

    public int damage;

    //回血
    public void recover(){
        hp=hp+1;
    }

    //掉血
    public void hurt(){
        hp=hp-1;
    }

    public void attackHero(Hero h) {
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead()) {
            System.out.println(h.name +"死了！");
        }
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

}
