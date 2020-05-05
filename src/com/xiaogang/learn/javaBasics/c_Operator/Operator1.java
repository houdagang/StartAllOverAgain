package com.xiaogang.learn.javaBasics.c_Operator;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 关系操作符 & 逻辑操作符
 * @创建日期 : 2020/5/5 11:25
 */
public class Operator1 {

    public static void main(String[] args) {

        /**
         * > 大于
         * >= 大于或等于
         * < 小于
         * <= 小于或等于
         * == 是否相等
         * != 是否不等
         */
        int a = 5;
        int b = 6;
        int c = 5;
        System.out.println(a>b);  //返回 false
        System.out.println(a>=c);  //返回 true
        System.out.println(a==b); //返回false
        System.out.println(a!=b);//返回true


        /*----------------------逻辑运算符------------------------*/
        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println( i == 1 & i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);

        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println( j== 1 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);

        //长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i1 = 2;
        System.out.println( i1 == 1 | i1++ ==2  ); //无论如何i1++都会被执行，所以i1的值变成了3
        System.out.println(i1);

        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int j1 = 2;
        System.out.println( j1 == 2 || j1++ ==2  );  //因为j1==2返回true,所以右边的j1++就没有执行了，所以j1的值，还是2
        System.out.println(j1);

        //!取反操作
        boolean b1 = true;
        System.out.println(b1); //输出true
        System.out.println(!b1);//输出false

        //^ 异或
        boolean aa = true;
        boolean bb = false;
        System.out.println(aa^bb); //不同返回真
        System.out.println(aa^!bb); //相同返回假

        /**
         * 练习
         */
        int ii = 1;
        boolean b2 = !(ii++ == 3) ^ (ii++ ==2) && (ii++==3);
        System.out.println(b2);  //false
        System.out.println(ii);  //3
    }
}
