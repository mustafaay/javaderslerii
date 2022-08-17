package ders23;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {

    public static void main(String[] args) {


        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println(sayilar1.size());

sayilar1.add(2);
sayilar1.addAll(sayilar1);
        System.out.println(sayilar1.size());

sayilar1.set(5,999);

        System.out.println(sayilar1);


/*
set methodu istenen elementeki eski elementi silip yerine verdigimiz yeni elementi set eder



eger eski elementi silmaek istemiyorsak
add(indext,deger) methodu kulanabiliriz



set() methodu sildigi eski elementi bize dondurur
 */





    }
}
