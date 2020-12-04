package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        File bild = new File("./r+m.bmp");
        File output = new File("./copy.bmp");

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int bytezaehler = 0;
        int buffer = 0;

        try{
            bis = new BufferedInputStream(new FileInputStream(bild));
            bos = new BufferedOutputStream(new FileOutputStream(output));

            while((buffer = bis.read()) != -1){
                System.out.println(buffer);
                if(bytezaehler>40){             // Header überspringen
                    if(buffer > 100) buffer -= 150;
                    //if(buffer < 100) buffer += 10;
                }
                bytezaehler++;
                bos.write(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
