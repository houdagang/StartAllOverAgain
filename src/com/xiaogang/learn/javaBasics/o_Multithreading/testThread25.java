package com.xiaogang.learn.javaBasics.o_Multithreading;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-28 17:09
 */
public class testThread25 {

    public static void main(String[] args) {

        Thread t1= new Thread(){
            @Override
            public void run(){
                int seconds =0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                }
            }
        };
        t1.setDaemon(true);
        t1.start();
    }

}
