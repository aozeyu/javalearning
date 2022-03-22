package com.atguigu.demo.Autobox;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int i = 10;
        Integer iObj = Integer.valueOf(i);
        System.out.println("Value of Interger obj: " + iObj);
        int i1= iObj;
        System.out.println("Value of i1: " + i1);
        Character charObj = 'a';
        char ch = charObj;
        System.out.println("value of ch: " + ch);
        System.out.println("Value of charObj: "+ charObj);
    }
}
