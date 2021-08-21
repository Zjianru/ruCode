package com.code.jvmlesson.tuling;

import com.sun.crypto.provider.DESKeyFactory;
import sun.misc.Launcher;

import java.util.Arrays;

/**
 * description
 *
 * @author Zjianru
 * @date 2021/5/17
 */
public class TestJdkClassLoader {
    public static void main(String[] args) {
        boolean b = String.class.getClassLoader() == null;
        System.out.println("String.class.getClassLoader().toString() ---> " + b);
        System.out.println("DESKeyFactory.class.getClassLoader() ---> " + DESKeyFactory.class.getClassLoader());
        System.out.println("TestJdkClassLoader.class.getClassLoader() ---> " + TestJdkClassLoader.class.getClassLoader());

        System.out.println();

        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = appClassLoader.getParent();
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println("appClassLoader--------->" + appClassLoader);
        System.out.println("extClassLoader--------->" + extClassLoader);
        System.out.println("bootStrapClassLoader--------->" + bootStrapClassLoader);

        System.out.println();
        System.out.println("bootStrapClassLoader 加载文件");
        Arrays.stream(Launcher.getBootstrapClassPath().getURLs()).forEach(System.out::println);
        System.out.println("appClassLoader 加载文件");
        System.out.println(System.getProperty("java.class.path"));
        System.out.println("extClassLoader 加载文件");
        System.out.println(System.getProperty("java.ext.dirs"));
    }
}
