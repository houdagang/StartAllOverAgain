package com.xiaogang.learn.javaBasics.d_ControlFlow;

import java.util.Scanner;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/6 21:48
 */
public class Control1 {

    /**
     * 计算阶乘
     */
    public void CalculationFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数，吾将计算其阶乘");
        int a = scanner.nextInt();
        int b = a;
        while (a > 1) {
            b = b * (a - 1);
            a--;
        }
        System.out.println(b);
        scanner.close();
    }

    public static void main(String[] args) {
        /**
         * while中的条件只要正确，就会一直执行
         */
        int i = 0;
        while (i < 6) {
            i++;
            System.out.println(i);
        }

        /**
         * do while 与while的区别是，无论是否成立，先执行一次，再进行判断
         */
        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while (j < 6);

        //计算阶乘
        new Control1().CalculationFactorial();

        /**
         * for循环
         * continue 跳过，进行下一次循环
         * break 结束 当前 循环，多层循环的时候，只能结束当前层
         */
        for(int k = 0 ; k < 8 ;k++) {
            if(k == 2) {
                continue;
            } else if(k == 7){
                System.out.println("跳出循环");
                break;
            }else{
                System.out.println("k=" + k);
            }
        }

        /**
         * 标签跳出循环
         * 标签随便定义
         */
        out1:
        while (true) {
            for(int h = 1; h <= 8; h++) {
                if(h == 5) {
                    System.out.println("跳出外循环");
                    break out1;
                } else {
                    System.out.println("h=" + h);
                }
            }
        }

    }

}
