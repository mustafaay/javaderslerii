package ders3;

import java.util.Locale;
import java.util.Scanner;

public class Scanner_ilkharf {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen adini giriniz");

        char harf=scan.next().toUpperCase(Locale.ROOT).charAt(0);
        System.out.println("basharfin = " +harf);







    }

}
