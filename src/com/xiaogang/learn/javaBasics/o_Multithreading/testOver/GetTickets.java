package com.xiaogang.learn.javaBasics.o_Multithreading.testOver;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 线程安全与不安全的买票测试
 * @创建日期 : 2020-07-08 9:36
 */
public class GetTickets {

    public static void main(String[] args) {
        TicketMachine t1 = new TicketMachine();

        Thread thread1 = new Thread(t1,"小明");
        Thread thread2 = new Thread(t1,"小红");
        Thread thread3 = new Thread(t1,"小志");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class TicketMachine implements Runnable{

    private int ticketNum = 50;
    private boolean flag = true;

    @Override
    public void run() {
        try{
            while (flag) {
                buy();
            }
        }catch (Exception e){
            System.out.println("买票出错了");
        }
    }

    private void buy() throws InterruptedException {
        if(ticketNum <= 0) {
            this.flag = false;
            System.out.println("票已经卖光了");
        } else {
            System.out.println(Thread.currentThread().getName() + "买了第" + ticketNum-- + "张票");
        }
    }

}
