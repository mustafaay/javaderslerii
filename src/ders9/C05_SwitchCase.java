package ders9;

import java.util.Scanner;

public class C05_SwitchCase {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci gun oldugunu girin");
        int gunno = scan.nextInt();
        switch (gunno) {


            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsanba");
                break;

            case 4:
                System.out.println("persenbe");
                break;

            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("lutfen 1-7 arasinda sayi giriniz");


        }


    }
}
