package com.xiaogang.learn.javaBasics.l_ArrayList.OtherList;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-12 10:59
 */
public class LinkedListTest {

    /**
     * 序列分先进先出FIFO,先进后出FILO
     * FIFO在Java中又叫Queue 队列
     * FILO在Java中又叫Stack 栈
     */
    public static void main(String[] args) {

        /**
         * 实现了List，（链表）Deque
         */
        LinkedList list = new LinkedList();

        //可以在头部和尾部插入数据
        list.addLast("8");
        list.addLast("9");
        System.out.println(list);

        //在最前面插入
        list.addFirst("1");
        list.addFirst("0");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        System.out.println(list);

        /**
         * 队列的常用方法
         * offer 在最后添加元素
         * poll 取出第一个元素
         * peek 查看第一个元素
         */
        Queue<String> q = new LinkedList<>();

        //加在队列的最后面
        System.out.println("初始化队列：\t");
        q.offer("1");
        q.offer("2");
        q.offer("3");
        q.offer("4");
        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //FIFO 先进先出
        System.out.println(q.poll());
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);

        //把第一个拿出来看一看，但是不取出来
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(q.peek());
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);

    }


}
