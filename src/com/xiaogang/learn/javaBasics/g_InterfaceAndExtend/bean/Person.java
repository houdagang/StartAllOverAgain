package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend.bean;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/17 14:39
 */
public class Person extends Animal{

    public static void move() {
        System.out.println("双腿走路");
    }

    @Override
    public void attack(String a) {

    }


    public static void main(String[] args) {
        Person.move();
        Animal.move();

        Animal a = new Person();
        a.move();
        Person p = (Person)a;
        p.move();
    }

}
