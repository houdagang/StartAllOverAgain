package com.xiaogang.learn.javaBasics.k_IO;

import com.xiaogang.learn.javaBasics.k_IO.Test5Bean.Hero;

import java.io.*;
import java.util.Scanner;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 对象流
 * @创建日期 : 2020-06-11 10:38
 */
public class IOTest5 {

    /**
     * 对象流指的是可以直接把一个对象以流的形式传输给其他的介质，比如硬盘
     * 一个对象以流的形式进行传输，叫做序列化。 该对象所对应的类，必须是实现Serializable接口
     */
    public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        //准备一个文件用于保存该对象
        File f = new File("E:\\xiaogang\\LOLFolder\\garen.txt");

        try(
            //创建对象输出流
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //创建对象输入流
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            oos.writeObject(h);
            Hero h2 = (Hero) ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*try(InputStream is = System.in;) {
            while (true) {
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97是a的ASCII码
                // 13 10分别对应回车换行
                int i = is.read();
                System.out.println(i);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Scanner s = new Scanner(System.in);
        while(true){
            String line = s.nextLine();
            System.out.println(line);
            break;
        }

    }

}
