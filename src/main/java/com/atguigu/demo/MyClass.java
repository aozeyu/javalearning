package com.atguigu.demo;

import java.lang.reflect.Method;

public class MyClass {
    @MarkAAnnotation(value = 10)
    public void sayHello(){
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass h = new MyClass();
        Method methodVal = h.getClass().getMethod("sayHello");
        MarkAAnnotation markAAnnotation = methodVal.getAnnotation(MarkAAnnotation.class);
        System.out.println("value is: " + markAAnnotation.value());
    }
}
