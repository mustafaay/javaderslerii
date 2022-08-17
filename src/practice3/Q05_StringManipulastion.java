package practice3;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. ismi giriniz");
        String isim1=scan.next();
        System.out.println("lutfen 2. ismi giriniz");
        String isim2=scan.next();

            if(isim1.length()>isim2.length()){
                System.out.println(isim1 + "  daha uzun");
            } else if (isim2.length()>isim1.length()) {
                System.out.println(isim2 + "   daha uzun");

            }
            else {
                System.out.println("ikisi birbirine esit");
            }



        }


    }
}
