package com.atguigu.demo.Autobox;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("/Users/yaozeyu/Desktop/党员微积分/demo/src/Test.txt");
            outputStream = new FileOutputStream("/Users/yaozeyu/Desktop/党员微积分/demo/src/dest.txt");
            int content;
            while ((content = inputStream.read()) != -1) {
                outputStream.write((byte) content);
            }
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
