package com.xiaogang.learn.javaBasics.l_ArrayList.OtherList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-15 10:39
 */
public class HashSetTest {

    public static void main(String[] args) {
        /**
         * set中的元素不能重复
         */
        HashSet<String> names = new HashSet<>();
        names.add("gareen");
        System.out.println(names);
        //第二次插入同样的数据，是插不进去的，容器只会保留一个
        names.add("gareen");
        System.out.println(names);

        /**
         * Set中的元素，没有顺序。
         * 严格的说，是没有按照元素的插入顺序排列
         * HashSet的具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序。
         */
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers);

        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }

        //或者采用增强型for循环
        for (Integer i : numbers) {
            System.out.println(i);
        }

    }

}
