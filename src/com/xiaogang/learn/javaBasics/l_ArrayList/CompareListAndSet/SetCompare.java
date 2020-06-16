package com.xiaogang.learn.javaBasics.l_ArrayList.CompareListAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-16 11:08
 */
public class SetCompare {

    public static void main(String[] args) {
        /**
         * HashSet： 无序
         * LinkedHashSet： 按照插入顺序
         * TreeSet： 从小到大排序
         */
        HashSet<Integer> numberSet1 = new HashSet<>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(8);
        numberSet1.add(88);
        numberSet1.add(888);
        System.out.println(numberSet1);

        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);

        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        //TreeSet 中的数据是进行了排序的
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);
        System.out.println(numberSet3);

        //https://www.cnblogs.com/jxxblogs/p/11561629.html

    }

}
