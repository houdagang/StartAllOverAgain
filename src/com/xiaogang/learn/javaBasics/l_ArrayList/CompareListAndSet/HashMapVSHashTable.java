package com.xiaogang.learn.javaBasics.l_ArrayList.CompareListAndSet;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-16 10:53
 */
public class HashMapVSHashTable {

    public static void main(String[] args) {
        /**
         * HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
         * 区别
         * 1.HashMap可以存放null   Hashtable不能存放null
         * 2.HashMap不是线程安全的类    Hashtable是线程安全的类
         */
        HashMap<String,String> hashMap = new HashMap<String,String>();
        //HashMap可以用null作key,作value
        hashMap.put(null, "123");
        hashMap.put("123", null);

        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        //Hashtable不能用null作key，不能用null作value
        //hashtable.put(null, "123");
        //hashtable.put("123", null);

    }

}
