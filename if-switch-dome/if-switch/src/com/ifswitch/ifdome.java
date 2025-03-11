package com.ifswitch;

import java.sql.SQLOutput;

public class ifdome {


    public static void main(String[] args) {
      /* char in = 57;
        System.out.println(in);
        char is = 'A';
        System.out.println(is);*/


        //目标  判断成绩是否合格
        double so = 55;
        if (so > 60){
            System.out.println("您的成绩合格");

        }else {
            System.out.println("您的成绩不合格");
        }


        //帮老板评出员工等级  (0-60)D  (60-80)C (80-90)B (90-100)A
        int come = 190;
        if (come >0 && come <= 60){
            System.out.println("A");
        }else if (come >60 && come <= 80){
            System.out.println('C');
        }else if (come >80 && come <= 90){
            System.out.println('B');
        }else if (come >90 && come <= 100){
            System.out.println('A');
        }else {
            System.out.println("您输入的成绩有问题！！");
        }
    }
}
