package com.xiaogang.learn.javaBasics.k_IO;

import java.io.*;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 数据流
 * @创建日期 : 2020-06-10 17:12
 */
public class IOTest4 {

    /**
     * DataInputStream 数据输入流
     * DataOutputStream 数据输出流
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，
         * 否则会出现EOFException，因为DataOutputStream 在写出的时候会做一些特殊标记，
         * 只有DataInputStream 才能成功的读取。
         */
        write();
        read();
    }

    private static void read() {
        File f = new File("E:\\xiaogang\\LOLFolder\\LOL7.txt");
        try(
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
        ) {
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();

            System.out.println("读取到布尔值：" + b);
            System.out.println("读取到整数：" + i);
            System.out.println("读取到字符串：" + str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        File f = new File("E:\\xiaogang\\LOLFolder\\LOL7.txt");
        try (
                FileOutputStream fos  = new FileOutputStream(f);
                DataOutputStream dos =new DataOutputStream(fos);
        ){
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this is gareen");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
