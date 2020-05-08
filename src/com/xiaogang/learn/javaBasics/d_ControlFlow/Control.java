package com.xiaogang.learn.javaBasics.d_ControlFlow;

import java.util.Scanner;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 控制流程
 * @创建日期 : 2020/5/5 22:36
 */
public class Control {

    public void checkSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("没有这个月份");
        }
        scanner.close();
    }

    public static void main(String[] args) {

        /**
         * if
         * 如果有多个表达式，则需要用{}括起来，如果表达式只有一个，可以不用
         */
        if (true) {
            System.out.println("正确1");
            System.out.println("正确2");
        }

        //虽然是false，但是还是会打印正确4
        if (false)
            System.out.println("正确3");
        System.out.println("正确4");


        //无论如何都会执行yes，因为后面有一个; 也算是一个表达式
        if (false) ;
        System.out.println("yes");

        if (false)
            System.out.println("yes");
        else if (false)
            System.out.println("no");
        else
            System.out.println("1");


        /**
         * switch 可以使用byte,short,int,char,String,enum
         * 注：在jdk1.7之前，String还是不被支持的，1.7之后将String编译成hash，其实还是整数
         * enum是枚举类型
         */
        //如果使用switch
        String day = "2";
        switch (day) {
            case "1":
                System.out.println("星期一");
                break;
            case "2":
                System.out.println("星期二");
                break;
            case "3":
                System.out.println("星期三");
                break;
            case "4":
                System.out.println("星期四");
                break;
            case "5":
                System.out.println("星期五");
                break;
            case "6":
                System.out.println("星期六");
                break;
            case "7":
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }
        new Control().checkSeason();
    }
}