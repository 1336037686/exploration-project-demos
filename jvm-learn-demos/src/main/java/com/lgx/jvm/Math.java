package com.lgx.jvm;

/**
 * @author 13360
 * @version 1.0
 * @description: TODO
 * @date 2023-11-14 11:05
 */
public class Math {

    public static final int initData = 666;

    public int compute() {  //一个方法对应一块栈帧内存区域
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
    }

}
