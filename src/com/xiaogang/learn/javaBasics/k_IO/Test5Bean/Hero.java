package com.xiaogang.learn.javaBasics.k_IO.Test5Bean;

import java.io.Serializable;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 :
 * @创建日期 : 2020-06-11 10:40
 */
public class Hero implements Serializable {

    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }
}
