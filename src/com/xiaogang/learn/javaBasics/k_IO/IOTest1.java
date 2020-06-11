package com.xiaogang.learn.javaBasics.k_IO;

import java.io.*;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-02 11:13
 */
public class IOTest1 {

    /**
     * 以字节流的形式向文件写入数据,不存在文件夹的话自动创建文件夹
     */
    public static void writeTest(String filepath) throws Exception {
        File f = new File(filepath);
        if(!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        FileOutputStream fis = new FileOutputStream(f);
        byte[] all = {65,67};
        fis.write(all);
        fis.close();
    }

    /**
     * 所有的数据存放在计算机中都是以数字的形式存放的。 所以字母就需要转换为数字才能够存放。
     * @param args
     */
    public static void main(String[] args) {
        try{
            File f = new File("E:\\xiaogang\\LOLFolder\\LOL.txt");
            //字节输入流
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int)f.length()];
            fis.read(all);
            for(byte b : all) {
                System.out.println(b);
            }
            //使用完流应该关闭
            fis.close();
            //字节输出流
            /**
             * OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现
             * FileOutoutStream 是OutputStream子类，以FileOutoutStream为例向文件写出数据
             *
             * 注：如果文件不存在，会自动创建改文件。
             * 但是文件存在，所在的文件夹目录不存在，会抛出异常
             */
            File f1 = new File("E:\\xiaogang\\LOLFolder\\LOL2.txt");
            byte data[] = {88,89};
            FileOutputStream fos = new FileOutputStream(f1);
            fos.write(data);
            fos.close();


            /**
             * 练习1
             */
            String path = "E:\\xiaogang\\LOLFolder\\lol\\LOL1.txt";
            writeTest(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
