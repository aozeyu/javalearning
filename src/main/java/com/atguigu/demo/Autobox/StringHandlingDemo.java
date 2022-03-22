package com.atguigu.demo.Autobox;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "John is studying";
        String str2 = "in college";
        System.out.println(str1.length());
        String result = str1.concat(str2);
        System.out.println(result);
        String.format("The name of student is " + "%s, and the age is " + "variable is %d,","John", 21);
        System.out.println(str1.charAt(5));
        if (str1.equals(str2)) {
            System.out.println("both strings are same");
        }else {
            System.out.println("both strings are different");
        }
    }
}
