package com.xiaogang.learn.javaBasics.f_ClassAndObj;

import com.xiaogang.learn.javaBasics.f_ClassAndObj.bean.HeroEnum;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 测试枚举
 * @创建日期 : 2020/5/14 20:56
 */
public class ClassAndObj5 {

    public static void main(String[] args) {
        HeroEnum season = HeroEnum.亚索;
        switch (season) {
            case 亚索:
                System.out.println("面对疾风吧");
                break;
            case 盖伦:
                System.out.println("德玛西亚万岁");
                break;
            case 提莫:
                System.out.println("提莫队长正在待命");
                break;
            case 艾希:
                System.out.println("世间万物皆系于一箭之上");
                break;
        }
    }

}
