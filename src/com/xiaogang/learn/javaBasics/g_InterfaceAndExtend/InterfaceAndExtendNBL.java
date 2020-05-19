package com.xiaogang.learn.javaBasics.g_InterfaceAndExtend;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 内部类
 * @创建日期 : 2020/5/17 19:21
 */
public class InterfaceAndExtendNBL {

    public String name;

    public static void battleWin() {
        System.out.println("游戏胜利");
    }

    public void actionPerformed() {

    }

    /**
     * 非静态内部类，只有一个外部类对象存在的时候，才有意义
     * 战斗成绩只有在一个英雄对象存在的时候才有意义
     */
    class BattleScore {
        int kill;
        int die;
        public void legendary() {
            if (kill >= 8)
                System.out.println("超神！");
            else
                System.out.println("尚未超神！");
        }
    }

    /**
     * 静态内部类
     * 与非静态内部类不同，静态内部类的实例化 不需要一个外部类的实例为基础，可以直接实例化
     * 语法：new 外部类.静态内部类();
     * 因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
     * 除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
     */
    static class EnemyCrystal {
        int hp = 5000;
        public void checkIfVictory() {
            if(hp == 0) {
                InterfaceAndExtendNBL.battleWin();
                //静态内部类不能直接访问外部类的对象属性
                //System.out.println(name + "胜利");
            }
        }
    }


    public static void main(String[] args) {
        InterfaceAndExtendNBL nbl = new InterfaceAndExtendNBL();

        BattleScore score = nbl.new BattleScore();
        score.kill = 9;
        score.legendary();

        InterfaceAndExtendNBL.EnemyCrystal ec = new InterfaceAndExtendNBL.EnemyCrystal();
        ec.hp = 0;
        ec.checkIfVictory();

        /**
         * 匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
         * 通常情况下，要使用一个接口或者抽象类，都必须创建一个子类
         *
         * 有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
         * 既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
         * 这样的类，叫做匿名类
         */
        InterfaceAndExtendNBL nbl1 = new InterfaceAndExtendNBL(){
            public void actionPerformed() {
                System.out.println("内部类");
            }
        };
        nbl1.actionPerformed();

        /**
         * 本地类（有名字的匿名类）
         */
        class InterAndExtend extends InterfaceAndExtendNBL{
            public void actionPerformed() {
                System.out.println( name+ " 新的进攻手段");
            }
        }
        InterAndExtend bdl = new InterAndExtend();
        bdl.actionPerformed();

    }

}
