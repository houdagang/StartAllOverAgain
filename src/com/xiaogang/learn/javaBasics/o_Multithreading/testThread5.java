package com.xiaogang.learn.javaBasics.o_Multithreading;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 死锁
 * @创建日期 : 2020-07-16 11:00
 */
public class testThread5 {

    public static void main(String[] args) {
        Hero a = new Hero("亚索");
        Hero b = new Hero("亚瑟");
        Thread thread1 = new Thread(()->{
            //占有a
            synchronized (a) {
                System.out.println(Thread.currentThread().getName() + "占用" + a.name);
                try{
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("试图占用" + b.name);
                synchronized(b) {
                    System.out.println("试图占用" + b.name + "中");
                }
            }
            System.out.println("结束a");
        },"线程1");
        Thread thread2 = new Thread(()->{
            //占有a
            synchronized (b) {
                System.out.println(Thread.currentThread().getName() + "占用" + b.name);
                try{
                    Thread.sleep(1000);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("试图占用" + a.name);
                synchronized(a) {
                    System.out.println("试图占用" + a.name + "中");
                }
            }
            System.out.println("结束b");
        },"线程2");
        thread1.start();
        thread2.start();
    }

}

class Hero {
    public String name;
    public int hp;

    Hero(String name) {
        this.name = name;
    }
}