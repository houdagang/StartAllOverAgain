package com.xiaogang.learn.javaBasics.f_ClassAndObj;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.AdHero;
import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.Hero;
import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.Weapon;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 继承
 * @创建日期 : 2020/5/10 22:49
 */
public class ClassAndObj1 {

    public static void main(String[] args) {
        Weapon w = new Weapon();
        //weapon继承的Item的属性
        w.name = "无尽之刃";

        //方法重载
        AdHero bh = new AdHero(5);
        bh.name = "赏金猎人";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        bh.attack();
        bh.attack(h1);
        bh.attack(h1, h2);
    }

}
