package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String 1 ; ");
String str1=scan.nextLine();
        System.out.println("String 2 ; ");
String str2=scan.nextLine();

        System.out.println("1. yontem : "+str1+"  "+str2);
        System.out.println("2.yontem : "+str1.concat(" "+str2));

        String str1sonrasi=str1.substring(1);
        String str2sonrasi=str2.substring(1);

        System.out.println(str1sonrasi+" "+str2sonrasi);


    }







}
