package com.xiaogang.learn.javaBasics.j_Exception;

/**
 * @ProjectName : StartAllOverAgain
 * @作者 : 侯小刚
 * @描述 : 自定义异常
 * @创建日期 : 2020-06-01 15:20
 */
public class ZdyExceptionTest extends Exception{

    public ZdyExceptionTest() {

    }

    public ZdyExceptionTest(String msg) {
        super(msg);
    }

}
