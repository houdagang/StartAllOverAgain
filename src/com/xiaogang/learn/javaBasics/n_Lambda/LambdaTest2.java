package com.xiaogang.learn.javaBasics.n_Lambda;

import com.xiaogang.learn.javaBasics.n_Lambda.testObj.HeBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-24 10:36
 */
public class LambdaTest2 {

    /**
     * 对元素进行筛选：
     *  filter 匹配
     *  distinct 去除重复(根据equals判断)
     *  sorted 自然排序
     *  sorted(Comparator<T>) 指定排序
     *  limit 保留
     *  skip 忽略
     * 转换为其他形式的流
     *  mapToDouble 转换为double的流
     *  map 转换为任意类型的流
     * @param args
     */
    public static void main(String[] args) {
        Random r = new Random();
        List<HeBean> heros = new ArrayList<HeBean>();
        for (int i = 0; i < 5; i++) {
            heros.add(new HeBean("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("查询条件：hp>100 && damage<50");
        System.out.println("通过传统操作方式找出满足条件的数据：");

        for (HeBean h : heros) {
            if (h.hp > 100 && h.damage < 50) {
                System.out.println(h.name);
            }
        }

        System.out.println("通过聚合操作方式找出满足条件的数据：");
        heros
        .stream()
        .filter(h -> h.hp > 100 && h.damage < 50)
        .forEach(h -> System.out.println(h.name));

        System.out.println("去除重复的数据，去除标准是看equals");
        heros
                .stream()
                .distinct()
                .forEach(h->System.out.print(h));
        System.out.println("按照血量排序");
        heros
                .stream()
                .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
                .forEach(h->System.out.print(h));

        System.out.println("保留3个");
        heros
                .stream()
                .limit(3)
                .forEach(h->System.out.print(h));

        System.out.println("忽略前3个");
        heros
                .stream()
                .skip(3)
                .forEach(h->System.out.print(h));

        System.out.println("转换为double的Stream");
        heros
                .stream()
                .mapToDouble(HeBean::getHp)
                .forEach(h->System.out.println(h));

        System.out.println("转换任意类型的Stream");
        heros
                .stream()
                .map((h)-> h.name + " - " + h.hp + " - " + h.damage)
                .forEach(h->System.out.println(h));
    }

}
