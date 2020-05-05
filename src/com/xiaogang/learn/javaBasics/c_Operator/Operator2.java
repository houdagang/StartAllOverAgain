package com.xiaogang.learn.javaBasics.c_Operator;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020/5/5 11:58
 */
public class Operator2 {

    //异或的用法，不用中间变量交换两个值
    private void testYh() {
        int a = 44444, b = 55555;
        System.out.printf("交换前：a = %d, b = %d\n", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("交换后：a = %d, b = %d\n", a, b);
    }

    public static void main(String[] args) {
        /**
         * 位操作
         */
        int a = 6;
        String b = Integer.toBinaryString(a);
        System.out.println(a + "的二进制表达是：" + b);

        /**
         * 位或 |
         */
        int c = 5;
        int d = 6;
        System.out.println(Integer.toBinaryString(c)); //5的二进制是101
        System.out.println(Integer.toBinaryString(d)); //6的二进制是110
        System.out.println(c|d); //所以 5|6 对每一位进行或运算，得到 111->7

        /**
         * 位与 &
         */
        int e = 5;
        int f = 6;
        System.out.println(Integer.toBinaryString(e)); //5的二进制是101
        System.out.println(Integer.toBinaryString(f)); //6的二进制是110
        System.out.println(e&f); //所以 5&6 对每一位进行与运算，得到 100->4

        /**
         * 异或 ^
         * 比较两个位不同时是1
         */
        int g = 5;
        int h = 6;
        System.out.println(Integer.toBinaryString(g)); //5的二进制是 101
        System.out.println(Integer.toBinaryString(h)); //6的二进制是110
        System.out.println(g^h); //所以 5^6 对每一位进行或运算，得到 011->3
        System.out.println(g^0);
        System.out.println(g^g);
        //异或用法
        new Operator2().testYh();

        /**
         * 取非 ~
         */
        byte i = 5;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(~i); //5的二进制是00000101,所以取非即为11111010,即为-6

        /**
         * 左移右移
         * 左移右边补零，超出抹去右边  *2
         * 右移左边补零或者符号位，超出抹去坐边 /2
         */
        byte j  =6;
        //6的二进制是110
        System.out.println(Integer.toBinaryString(j));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(j<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(j>>1);


        /**
         * 练习1
         */
        int ii = 3; // 二进制是11
        int jj = 2; // 二进制是10
        int cc = ((ii | jj) ^ (ii & j)) << 2 >>> 1;
        System.out.println(cc);

        /**
         * 练习2
         * 赋值操作
         */
        int z = 1;
        z += ++z;   //就想当于 z = z + ++z = 1 + 2 = 3
        System.out.println(z);

    }
}
