package practice4;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
   cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("olcuyu giriniz");
        double gelencm = scan.nextDouble();

        cmcevirme(gelencm);


    }

    public static void cmcevirme(double gelencm) {

        double metre = gelencm / 1000;
        double km = metre / 1000;
        System.out.println(gelencm + "cm = " + metre + " metre ve " + km + "  kilometre yapar");


    }


}
