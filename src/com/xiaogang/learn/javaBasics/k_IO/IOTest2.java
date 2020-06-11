package com.xiaogang.learn.javaBasics.k_IO;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 字符流
 * @创建日期 : 2020-06-08 16:45
 */
public class IOTest2 {
    /**
     * Reader字符输入流
     * Writer字符输出流
     */
    public static void main(String[] args) {
        //FileReader 是Reader子类，以FileReader 为例进行文件读取
        File f = new File("E:\\xiaogang\\LOLFolder\\LOL.txt");

        /**
         * ()中的代码一般放的是对资源的申请，如果{}中的代码出项了异常，
         * （）中的资源就会被关闭，这在inputstream和outputstream的使用中会很方便
         */
        try(FileReader fr = new FileReader(f)){
            char[] all = new char[(int) f.length()];
            fr.read(all);
            for (char b : all) {
                //打印出来是A B
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        File f1 = new File("E:\\xiaogang\\LOLFolder\\LOL2.txt");
        try(FileWriter fr = new FileWriter(f1)) {
            String data = "abcdefg123456一二三";
            char[] c = data.toCharArray();
            fr.write(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f3 = new File("E:\\xiaogang\\LOLFolder\\LOL2.txt");
        try(FileInputStream fis = new FileInputStream(f3)){
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            //文件中读出来的数据是
            System.out.println("文件中读出来的数据是：");
            for (byte b : all) {
                int i = b&0x000000ff;
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在GBK的棋盘上去：");
            String str = new String(all,"GBK");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //读取中文
        File f4 = new File("E:\\xiaogang\\LOLFolder\\LOL2.txt");
        System.out.println("默认编码方式：" + Charset.defaultCharset());
        //FileReader得到的是字符，所以一定是已经吧字节根据某种编码识别成了字符了
        //而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GBK
        try(FileReader fr = new FileReader(f4)) {
            char[] cs = new char[(int) f4.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s,识别出来的字符是：%n",Charset.defaultCharset());
            System.out.println(new String(cs));

        } catch (Exception e) {
            e.printStackTrace();
        }
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f4),Charset.forName("GBK"))) {
            char[] cs = new char[(int) f4.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            System.out.println(new String(cs));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
