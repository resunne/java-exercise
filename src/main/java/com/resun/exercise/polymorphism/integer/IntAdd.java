package com.resun.exercise.polymorphism.integer;

public class IntAdd {

    public static void main(String[] args) {
        System.out.println("IntAdd");

        add((byte) 1, (byte) 2);

    }

    public static void add(byte firstVal, byte secondVal) {
        /**
         * 错误的写法
         * * firstVal 与 secondVal 被提升为 int 类型，再进行加法计算，求和结果也是 int 类型。
         * * 求和结果 int 类型，无法赋值给 secondVal byte 类型
         */
        // secondVal = firstVal + secondVal;

        /**
         * += 隐式的将求和结果 int 类型转换为 byte 类型
         */
        secondVal += secondVal;
        System.out.println(String.format("firstVal %d, secondVal %d", firstVal, secondVal));
    }

}