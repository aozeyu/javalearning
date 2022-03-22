package com.atguigu.demo.Util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class ImageHandingDemo {
    public static void main(String[] args) throws IOException {
        int width = 963;
        int height = 640;
        BufferedImage image = null;
        image = readFromFile(width,height,image);
        writeToFile(image);
    }

    private static void writeToFile(BufferedImage image) {
        try {
            File output = new File("/Users/yaozeyu/Desktop/out.jpeg");
            ImageIO.write(image,"jpg",output);
            System.out.println("Writing complete");
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
    }

    private static BufferedImage readFromFile(int width,int height,BufferedImage image) throws IOException {
        try {
            File sampleFile = new File("/Users/yaozeyu/Desktop/下载.jpeg");
            image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(sampleFile);
            System.out.println("Reading complete." + image);
        }catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return image;
    }
}
