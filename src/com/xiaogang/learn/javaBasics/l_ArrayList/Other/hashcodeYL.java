package com.xiaogang.learn.javaBasics.l_ArrayList.Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-16 11:25
 */
public class hashcodeYL {

    public static void main(String[] args) {
        List<HeroTest> heros = new ArrayList<HeroTest>();
        for (int j = 0; j < 2000000; j++) {
            HeroTest h = new HeroTest("Hero " + j);
            heros.add(h);
        }

        // 进行10次查找，观察大体的平均值
        for (int i = 0; i < 10; i++) {
            // 打乱heros中元素的顺序
            Collections.shuffle(heros);
            long start = System.currentTimeMillis();
            String target = "Hero 1000000";
            for (HeroTest hero : heros) {
                if (hero.name.equals(target)) {
                    System.out.println("找到了 hero!" );
                    break;
                }
            }
            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }

        HashMap<String,HeroTest> heroMap = new HashMap<String,HeroTest>();
        for (int j = 0; j < 2000000; j++) {
            HeroTest h = new HeroTest("Hero " + j);
            heroMap.put(h.name, h);
        }
        System.out.println("数据准备完成");

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            //查找名字是Hero 1000000的对象
            HeroTest target = heroMap.get("Hero 1000000");
            System.out.println("找到了 hero!" + target.name);

            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }
    }

}
