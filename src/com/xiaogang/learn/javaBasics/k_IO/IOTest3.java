package com.xiaogang.learn.javaBasics.k_IO;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 缓存流
 * @创建日期 : 2020-06-08 19:07
 */
public class IOTest3 {

    /**
     * 以介质是硬盘为例，字节流和字符流的弊端：
     * 在每一次读写的时候，都会访问硬盘。 如果读写的频率比较高的时候，其性能表现不佳。
     *
     * 为了解决以上弊端，采用缓存流。
     * 缓存流在读取的时候，会一次性读较多的数据到缓存中，以后每一次的读取，都是在缓存中访问，
     * 直到缓存中的数据读取完毕，再到硬盘中读取。
     *
     * 就好比吃饭，不用缓存就是每吃一口都到锅里去铲。用缓存就是先把饭盛到碗里，
     * 碗里的吃完了，再到锅里去铲
     *
     * 缓存流在写入数据的时候，会先把数据写入到缓存区，直到缓存区达到一定的量，才把这些数据，一起写入到硬盘中去。
     * 按照这种操作模式，就不会像字节流，字符流那样每写一个字节都访问硬盘，从而减少了IO操作
     */
    public static void main(String[] args) {

        /**
         * 缓存字符输入流，可以一次读取一行
         */
        File f = new File("E:\\xiaogang\\LOLFolder\\LOL3.txt");
        try(
                // 创建文件字符流
                FileReader fr = new FileReader(f);
                // 缓存流必须建立在一个存在的流的基础上
                BufferedReader br = new BufferedReader(fr);
           ){
            while (true) {
                //一次读一行
                String line = br.readLine();
                if (null == line) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * PrintWriter 缓存字符输出流， 可以一次写出一行数据
         */
        // 向文件lol2.txt中写入三行语句
        File f1 = new File("E:\\xiaogang\\LOLFolder\\LOL4.txt");
        try (
                // 创建文件字符流
                FileWriter fw = new FileWriter(f1);
                // 缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * 有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 这时候就需要用到flush
         */

        //向文件lol2.txt中写入三行语句
        File f2 =new File("E:\\xiaogang\\LOLFolder\\LOL4.txt");
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
        try(
                FileWriter fr = new FileWriter(f2);
                PrintWriter pw = new PrintWriter(fr);
                ) {
            pw.println("garen kill teemo1");
            //强制把缓存中的数据写入硬盘，无论缓存是否已满
            pw.flush();
            pw.println("teemo revive after 1 minutes");
            pw.flush();
            pw.println("teemo try to garen, but killed again");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //删除注释
        //https://blog.csdn.net/ai_bao_zi/article/details/81097898
        File f3 = new File("E:\\xiaogang\\LOLFolder\\LOL5.txt");
        File f4 = new File("E:\\xiaogang\\LOLFolder\\LOL6.txt");
        try(FileReader fr = new FileReader(f3);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f4);
            PrintWriter pw = new PrintWriter(fw)
        ) {
            while (true){
                String line = br.readLine();
                if(null == line) {
                    break;
                }
                if(line.startsWith("//")) {
                    continue;
                }
                System.out.println("从文件读取的内容："+line);
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
