package ders10;

import java.util.Scanner;

public class C03_Ecolesmetod {

    public static void main(String[] args) {


        String str="ali can";
        String str2="ali Can";
        String str3="ali can" +"";
        String str4="ali can";
        String str5=new String("ali can");

        System.out.println(str==str2);

        System.out.println(str==str3);

        System.out.println(str.equals(str3));


        System.out.println(str==str5);

        System.out.println(str.equals(str5));

        System.out.println(str.equals(str4));

        System.out.println(str3.equals(str5));

        //stringlerde ayni  string olsa bile == her zaman calismaz
        //emin olmak isterseniz equals metodunu kulanmalisiniz
        //equals kulandigimizda dikat edilmesi gereken tek sey metinlerin birebir ayni olmasi gerekir





    }
}
