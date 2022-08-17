package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_DoWhileLoop {

/*
Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
 */




        public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
            Random rnd=new Random();
            int sayi=0;
            List<Integer> sayiListesi=new ArrayList<>();
            while(sayiListesi.size()<200){
                sayi= rnd.nextInt(1000);
                if (!sayiListesi.contains(sayi)){
                    sayiListesi.add(sayi);
                }
            }
            System.out.println(sayiListesi);
        }
    }



