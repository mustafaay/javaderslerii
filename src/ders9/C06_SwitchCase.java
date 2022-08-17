package ders9;

import java.util.Locale;
import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {

        //kulanicidan gun ismini alin
        //hafta ici veya hafta sonu oldugunu yazdirirn

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String hafta = scan.next().toLowerCase(Locale.ROOT);

        switch (hafta) {

            case "pazartesi":
                System.out.println("hafta ici");
                break;

            case "sali":
                System.out.println("hafta ici");
                break;

            case "carsanba":
                System.out.println("hafta ici");
                break;

            case "persanbe":
                System.out.println("hafta ici");
                break;

            case "cuma":
                System.out.println("hafta ici");
                break;

            case "cumartesi":
                System.out.println("hafta sonu");
                break;

            case "pazar":
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("lutfen haftanin gunlerinden bir tane giriniz ");


        }



//altaki kodda break oldadigi icin break gorene kadar devam eder
        // hem yukaridaki hemde asagidaki kodda calisir bir sikinti olmaz








        switch (hafta) {

            case "pazartesi":


            case "sali":


            case "carsanba":


            case "persanbe":

            case "cuma":
                System.out.println("hafta ici");
                break;

            case "cumartesi":


            case "pazar":
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("lutfen haftanin gunlerinden bir tane giriniz ");


        }


































    }
}
