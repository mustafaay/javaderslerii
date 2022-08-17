package practice11;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Q01 {


    public static void main(String[] args) {


/*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        String[] arr = cumle.split("");
        int sayac = 0;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {


            if (arr[i-1].equals(arr[i])) {

                sayac++;
            } else {
                System.out.println(arr[i-1] + "  harfinden " + (sayac+1) + "  tane var ");
                sayac = 0;
            }
            if(i==arr.length-1){

                System.out.println(arr[i] + "  harfinden " + (sayac+1) + "  tane var ");

            }


        }


    }


}
