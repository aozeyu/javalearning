package com.atguigu.demo.Autobox;

import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("/Users/yaozeyu/Desktop/党员微积分/demo/src/Test.txt");
            writer = new FileWriter("/Users/yaozeyu/Desktop/党员微积分/demo/src/dest.txt");
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
