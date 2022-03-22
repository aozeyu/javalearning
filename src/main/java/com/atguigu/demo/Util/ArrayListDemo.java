package com.atguigu.demo.Util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
    }
}
