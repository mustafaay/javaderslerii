package ders39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_icicetrcCacth {

    public static void main(String[] args){

int k;
        try {
            FileInputStream fis = new FileInputStream("src/ders39_exceptions/test.txt");

while ((k=fis.read())!=-1){
    System.out.print((char)k);
}






        }
        catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi veya dosya bozuk");
        } catch (IOException e) {
            System.out.println( "dosyala");
        }


    }
}
