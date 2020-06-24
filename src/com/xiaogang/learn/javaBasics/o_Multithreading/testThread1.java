package com.xiaogang.learn.javaBasics.o_Multithreading;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-24 14:28
 */
public class testThread1 {

    /**
     * Thread.sleep(1000); 表示当前线程暂停1000毫秒 ，其他线程不受影响
     * Thread.sleep(1000); 会抛出InterruptedException 中断异常，
     *  因为当前线程sleep的时候，有可能被停止，这时就会抛出 InterruptedException
     * @param args
     */
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                int seconds =0;
                while(true){
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                }
            }
        };
        t1.start();
    }

}
