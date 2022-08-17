package ders47_maps;

import ders46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {


    public static void main(String[] args) {

        Map<Integer,String> siniflistmap= ReusableMethods.mapolustur();
        System.out.println(siniflistmap);
//ogrenci istesini isim soyisim olarak yazdirin
        ReusableMethods.tumvalueSiraliyazdir(siniflistmap);
ReusableMethods.Bransogrencisayisiyazdir(siniflistmap);









    }
}
