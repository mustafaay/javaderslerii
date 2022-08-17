package ders13;

import java.util.Scanner;

public class C02_StringManipulation {

    public static void main(String[] args) {

        //  Soru 6) Kullanicidan bir sifre girmesini isteyin.
        //          Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        //  sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //          - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre = scan.nextLine();

        int kontroll = 0;

        if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z') {
       kontroll++;



        }
        else {
            System.out.println("ilk harf buyuk olmali");
        }
        if(sifre.charAt(sifre.length()-1)<='a'&&sifre.charAt(sifre.length()-1)<='z') {

            kontroll++;

        }
        else {
            System.out.println("son harf kucuk almali");
        }

        if(sifre.contains(" ")){
            System.out.println("sifrenizde bosluk olmamali");
        }
else
        {
            kontroll++;
        }
if(sifre.length() >=8){
    kontroll++;
}
else {
    System.out.println("sifreniz minimum 8 karakter olmali");
}

if(kontroll==4){
    System.out.println("Sifre basari ile tanimlandiSifre basari ile tanimlandi");
}
else {
    System.out.println("sifrenizde hata var");
}













    }
}
