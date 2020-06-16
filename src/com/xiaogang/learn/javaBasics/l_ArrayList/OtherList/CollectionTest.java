package com.xiaogang.learn.javaBasics.l_ArrayList.OtherList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-15 15:41
 */
public class CollectionTest {

    //Collections是一个类，容器的工具类,就如同Arrays是数组的工具类
    public static void main(String[] args) {

        //反转
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("集合中的数据：");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println("翻转后集合中的数据：");
        System.out.println(numbers);

        //混淆
        Collections.shuffle(numbers);
        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);

        //排序
        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);

        //交换
        Collections.swap(numbers,0,5);
        System.out.println("交换0与5下标的数据后，集合中的数据：");
        System.out.println(numbers);

        //滚动
        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位,集合中的数据：");
        System.out.println(numbers);

        //线程安全化
        List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);

    }

}
