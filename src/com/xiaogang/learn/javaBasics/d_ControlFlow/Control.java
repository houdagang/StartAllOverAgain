package com.xiaogang.learn.javaBasics.d_ControlFlow;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 控制流程
 * @创建日期 : 2020/5/5 22:36
 */
public class Control {

    public static void main(String[] args) {

        /**
         * if
         * 如果有多个表达式，则需要用{}括起来，如果表达式只有一个，可以不用
         */
        if(true) {
            System.out.println("正确1");
            System.out.println("正确2");
        }

        //虽然是false，但是还是会打印正确4
        if(false)
            System.out.println("正确3");
            System.out.println("正确4");


        //无论如何都会执行yes，因为后面有一个; 也算是一个表达式
        if(false);
            System.out.println("yes");

        if (false)
            System.out.println("yes");
        else if(false)
            System.out.println("no");
        else
            System.out.println("1");
    }
}
