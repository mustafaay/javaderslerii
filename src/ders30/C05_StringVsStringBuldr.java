package ders30;

import java.time.LocalTime;

public class C05_StringVsStringBuldr {


    public static void main(String[] args) {


 /*
  String mi yoksa StringBuilder mi daha hizlidir ?
  bunun icin bir String olusturup, 1000 kere sonuna . ekleyelim
  oncesinde ve sonrasinda zamani alip
  aradaki farki bulalim

  ayni islemi string builder icin de yapalim
 */
        LocalTime bas=LocalTime.now();
    String str="ahhhh java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";

        }

        LocalTime bit=LocalTime.now();

        System.out.println(bas);
        System.out.println(bit);

        System.out.println(bit.getNano()-bas.getNano());

        LocalTime bas2=LocalTime.now();

        StringBuilder str2=new StringBuilder("ahhhh java");

        for (int i = 0; i <10000 ; i++) {
           str2.append(".");

        }


        LocalTime bit2=LocalTime.now();

        System.out.println(bas2);
        System.out.println(bit2);

        System.out.println(bit2.getNano()-bas2.getNano());











    }
}
