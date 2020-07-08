package com.xiaogang.learn.javaBasics.o_Multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-07-07 10:59
 */
public class testThread34 {

    public static String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        final Object someObject= new Object();

        Thread t1 = new Thread(()->{
            try {
                System.out.println( now() +" t1 线程已经运行");
                System.out.println( now() + Thread.currentThread().getName() + " 试图占有对象：someObject");
                synchronized (someObject) {
                    System.out.println( now() + Thread.currentThread().getName() + " 占有对象：someObject");
                    Thread.sleep(2000);
                    System.out.println( now() + Thread.currentThread().getName() + " 释放对象：someObject");
                }
                System.out.println(now()+" t1 线程结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(()->{
            try {
                System.out.println( now() +" t2 线程已经运行");
                System.out.println( now() + Thread.currentThread().getName() + " 试图占有对象：someObject");
                synchronized (someObject) {
                    System.out.println( now() + Thread.currentThread().getName() + " 占有对象：someObject");
                    Thread.sleep(2000);
                    System.out.println( now() + Thread.currentThread().getName() + " 释放对象：someObject");
                }
                System.out.println(now()+" t2 线程结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.setName("t2");
        t2.start();

    }

}
