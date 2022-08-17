package ders7;

import java.util.Scanner;

public class C04_basicIfStatment {

    public static void main(String[] args) {

        Scanner  scan=new Scanner(System.in);
        System.out.println("lutfen haftanin gunlerinden bir tane giriniz");
        String a=scan.next().toLowerCase();

        if(a.equals("pazar")||a.equals("cumartes")){

            System.out.println("hafta sonu" );


        }


        if(a.equals("pazartesi")||a.equals("salı")||a.equals("çarşanba")||a.equals("perşenbe")||a.equals("cuma")) {

            System.out.println("hafta ici");


        }

        if (!(a.equals("pazartesi")||a.equals("salı")||a.equals("çarşanba")||a.equals("perşenbe")||a.equals("cuma")||a.equals("pazar")||a.equals("cumartes"))){

            System.out.println("oyle bir gun yok . acaba alkol aldin mi?");
        }




    }

}
