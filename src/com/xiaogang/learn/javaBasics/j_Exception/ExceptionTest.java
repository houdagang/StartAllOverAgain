package com.xiaogang.learn.javaBasics.j_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-05-27 15:23
 */
public class ExceptionTest {

    public static int test() {
        Exception e1 = new Exception();
        try{
            throw e1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {

        /**
         * 异常处理
         * try{}catch(Exception e){} finally{}
         * throws
         * 1. throws 出现在方法声明上，而throw通常都出现在方法体内。
         * 2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；
         * throw则是抛出了异常，执行throw则一定抛出了某个异常对象。
         *
         *
         * Throwable是类，Exception和Error都继承了该类
         * 所以在捕捉的时候，也可以使用Throwable进行捕捉
         */

        File f = new File("d://LOL.exe");
        int i = 0;
        try{
            System.out.println("试图打开 d:/LOL.exe");
            i++;
            new FileInputStream(f);
            i++;
            System.out.println(i);
            System.out.println("成功打开");
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            System.out.println("关闭");
            System.out.println("f:" + i);
        }

        int a = test();
        System.out.println(a);

    }

}
