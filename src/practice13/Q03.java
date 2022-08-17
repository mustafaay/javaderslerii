package practice13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {


/*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
        List<Integer> fibonaci = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        fibonaci.add(0);
        fibonaci.add(1);
        int i = 1;
        if (sayi <= 1) {
            System.out.println("girilen sayi 1 den buyuk olmali ");

        } else {

            while (fibonaci.get(i) < sayi) {

                fibonaci.add(fibonaci.get(i) + fibonaci.get(i - 1));
                i++;


            }

            System.out.println(fibonaci);

        }

        int sonsayi=fibonaci.size()-1;
if(fibonaci.get(sonsayi)>sayi){
    fibonaci.remove(sonsayi);
    System.out.println("girilen sayi fibonacoi dizisinde bulunmamaktadir"+fibonaci);
}else {
    System.out.println(" ikinci else  "+fibonaci);
}

    }

}
