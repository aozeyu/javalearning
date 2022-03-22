package com.atguigu.demo.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String regexStr = ".*[a-z][0-9].";
        Pattern pattern = Pattern.compile(regexStr);

        Matcher matcher = pattern.matcher("123435646adadaf242341234");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        }else {
            System.out.println("Match not found");
        }
    }
}
