package com.company;

import org.joou.UInteger;

import javax.imageio.ImageIO;

import static org.joou.Unsigned.*;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.ByteBuffer;

/*
class RGB {
    Byte r,g,b;
}

class RGBTable {
    RGB[] rt;

}

class Bmp {
    sigtag
}
*/
class Pixelx{
    byte rest,r,g,b;
    Pixelx(int p){
        byte[] bytes = ByteBuffer.allocate(4).putInt(p).array();
        r= bytes[1];
        g= bytes[2];
        b= bytes[3];
    }

}

class Pixel{
    byte r,g,b;
    byte[] rgb= new byte[3];

    Pixel(int p){
        this.b = (byte) p;
        p = p >> 8;
        this.g = (byte) p;
        p = p >> 8;
        this.r = (byte) p;
        // 0000000000000000000000000000000000000000010101010101011010110101010101010101
    }
}
public class Main {

    public static void main(String[] args) {
        int test = 32452346;
        Pixelx pixx = new Pixelx(test);
        System.out.println(pixx.r);
        System.out.println(pixx.g);
        System.out.println(pixx.b);
        /*
        UInteger offset = uint(0);
        BufferedImage img;
        File bild = new File("./rm.bmp");
        File output = new File("./copy.bmp");

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int bytezaehler = 0;
        int buffer = 0;

        try{
            img = ImageIO.read(bild);
            for (int x=0; x<=img.getWidth(); x++) {
                for (int y=0; y<=img.getHeight(); y++) {
                    //Pixelx pixelx = (Pixelx) img.getRGB(x, y);
                    Pixel pixel = img.getRGB(x, y);
                    pixel.r += 50;
                    pixel.g += 50;
                    pixel.b += 50;
                    img.setRGB(x, y, (int) pixel);
                }
            }
            bis = new BufferedInputStream(new FileInputStream(bild));
            bos = new BufferedOutputStream(new FileOutputStream(output));

            while((buffer = bis.read()) != -1){
                System.out.println(buffer);
                if(bytezaehler>54){             // Header überspringen
                    if(buffer > 200) buffer -= 100;
                    //if(buffer < 100) buffer += 10;
                }
                bytezaehler++;
                bos.write(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }
}
