package com.java.hello;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("你的年龄是" + age);

        System.out.println("请输入你的姓名");
        String name = sc.next();
        System.out.println("欢迎：" + name);
    }

}
