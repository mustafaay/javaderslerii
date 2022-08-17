package ders9;

import java.util.Scanner;

public class C02_TernaryOperator {

    public static void main(String[] args) {


        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scanner.nextDouble();


        // eger ternary ile farkli data turkerinde ise atama yapamayiz
        //sadece yazdirabiliriz
        //double x=sayi>0?"sayi pozitif":(sayi*sayi);

        System.out.println(  sayi>0?"sayi pozitif":(sayi*sayi));









    }
}
