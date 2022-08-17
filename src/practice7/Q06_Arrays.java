package practice7;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {


        arryolusturma();


    }

    public static void arryolusturma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("array uzunlugu ne olsun ? ");
        int arrayuzunluk = scan.nextInt();
        int[] arr = new int[arrayuzunluk];

        for (int i = 0; i < arrayuzunluk; i++) {

            System.out.println("arrayin " + (i + 1) + " . elemani giriniz");
            arr[i] = scan.nextInt();


        }

        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucun eleman arasinda ki fark " + (arr[arr.length - 1] - arr[0]));


    }

}
