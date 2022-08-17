package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class FP_01 {
    /*

    1)lamda (functional  programming)java 8 ile kulanilmaya baslanmistir
    2)functional  programming'de " ne yailacak " uzerinde yogunlasilir .
    structed programming" nasil yapilacak" uzerne yogunlasir
    3)functional  programming arrays ve colections ile birlikte kulnilir
    4)"entry set() methodu  ile map set'e donusturulerek functional  programming kulanilabilir
    5)
     */

    public static void main(String[] args) {


        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);

        //1) Ardışık list elementlerini
        // aynı satırda aralarında boşluk
        // bırakarak yazdıran bir method oluşturun.(Structured)

        listelemanlariniyazdir(l);
        listelemanlariniyazdir2(l);
        ciftelemanlariyazdir(l);
        ciftelemanlariyaz2(l);
        tekelemanlariyazdir(l);
        tekelemanlariyazdir2(l);
        tekelemanlariyazdir3(l);
        ciftyazdir3(l);
    }

    public static void listelemanlariniyazdir(List<Integer> l) {

        for (Integer w : l) {

            System.out.print(w + "   ");


        }

        System.out.println();

    }

    //2 yontem functional  programming ile
    public static void listelemanlariniyazdir2(List<Integer> l) {

        l.stream().forEach(t -> System.out.print(t + "   "));


            /*
            stream methodu colectiondna elementleri akisa dahil etmek icin
            ve methodlara ulsamak icin kulnilir

             */
    }


    //2)Ardışık çift list elementlerini
    // aynı satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.(Structured)
    public static void ciftelemanlariyazdir(List<Integer> l) {
        System.out.println();
        for (Integer w : l) {
            if (w % 2 == 0) {
                System.out.print(w + "   ");
            }
        }


    }

    public static void ciftelemanlariyaz2(List<Integer> l) {
        System.out.println();
        l.stream().filter(w -> w % 2 == 0).forEach(w -> System.out.print(w + " "));

    }


    //3) Ardışık tek list elementlerinin
    // karelerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekelemanlariyazdir(List<Integer> l) {

        System.out.println();
        for (Integer w : l) {
            if (w % 2 == 1) {
                System.out.print((w * w) + "  ");
            }


        }


    }

    public static void tekelemanlariyazdir2(List<Integer> l) {
        System.out.println();
        l.stream().filter(w -> w % 2 == 1).map(w -> w * w).forEach(w -> System.out.print(w + "   "));


    }


    //4) Ardışık tek list elementlerinin
    // küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak
    // yazdıran bir method oluşturun.
    public static void tekelemanlariyazdir3(List<Integer> l) {
        System.out.println();
        l.stream().distinct().filter(w -> w % 2 == 1).map(w -> w * w * w).forEach(w -> System.out.print(w + "   "));

    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void ciftyazdir3(List<Integer> l) {
        System.out.println();
        Integer toplama = l.stream().distinct().filter(w -> w % 2 == 0).map(w -> w * w).reduce(0, (w, m) -> w + m);
        System.out.println(toplama);


    }
}
