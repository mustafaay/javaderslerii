package ders22;

import java.util.ArrayList;
import java.util.List;

public class C09_Get {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<Integer>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(2);
        List<String> isimler=new ArrayList<String>();



        isimler.add("erdal");
        isimler.add("hakan");
        isimler.add("enes");

        System.out.println(sayilar.get(0));
        System.out.println(  isimler.get(2));

// ctrl ye basili tutarak o komuta gidebiliriz








    }
}
