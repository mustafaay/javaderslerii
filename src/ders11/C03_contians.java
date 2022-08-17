package ders11;

import java.util.Scanner;

public class C03_contians {

    public static void main(String[] args) {

        /*
        kulanicidan e mail adresini girmesini isteyin
        mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        @gmail.com ile bitiyorsa "mail adrreiniz kayit edildi"
        eger @gmaol.com ile bitmiorsa "lutfen yazimi kontrol etiriniz"
        yazin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfeb bir gmail adresi giriniz");
String mailadresi=scan.nextLine();

if(!mailadresi.contains("@gmail.com")){
    System.out.println("gecerli bir gmail adresi giriniz");
} else if (mailadresi.lastIndexOf("@gmail.com")==(mailadresi.length()-10)) {
    System.out.println("email adresiniz kayit edildi");
}
else {
    System.out.println("lutfen yazimi kontrol ediniz");
}

    }
}
