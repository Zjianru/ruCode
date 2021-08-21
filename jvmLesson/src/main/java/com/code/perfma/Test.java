package com.code.perfma;

/**
 * description
 *
 * @author Zjianru
 * @date 2021/5/25
 */
public class Test {
    public static void main(String[] args) {
        // 对于同时设置了 -Xmx${x}m 与 -XX:MaxHeapSize=${x}m 两个参数的program 来说
        // 后设置的参数将会覆盖之前设置的参数
        // jvm 源码中将两个参数映射到了同一个变量上
        System.out.println("perfMaTestClass");
    }
}
