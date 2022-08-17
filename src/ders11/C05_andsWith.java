package ders11;

import java.util.Scanner;

public class C05_andsWith {

    public static void main(String[] args) {

        String stkr="ah be java";


        System.out.println(stkr.endsWith("java"));//true
        System.out.println(stkr.endsWith("k"));//false
  //ama
        System.out.println(stkr.endsWith(" "));//boule olursa tru olur cunku
        //" " ' yi var olarak algilar



          /*
        kulanicidan e mail adresini girmesini isteyin
        mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        @gmail.com ile bitiyorsa "mail adrreiniz kayit edildi"
        eger @gmaol.com ile bitmiorsa "lutfen yazimi kontrol etiriniz"
        yazin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir mail adresi giriniz");
        String str=scan.nextLine();



 if (str.contains("@gmail.com")){


     if (str.endsWith("@gmail.com")) {
         System.out.println("mail adresiniz kait edildi");

     } else  {
         System.out.println("lutfem yazimi kontrol edi iz");

     }


 }
 else {
     System.out.println("lutfen gecerli bir gmail adresi giriniz ");
 }


    }
}
