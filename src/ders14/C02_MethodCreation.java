package ders14;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //verilen 3  basamakli sayinin rakamlarinin toplamini yazan
        //bir method olusturun

        int input=523;
        rakamlaritopla(input);
       C01_MethodCreation.terstenyazdir("musta");
    }

    public static void rakamlaritopla(int input) {
        int birlerbasamagi=0;
        int rakamlartoplami=0;




        birlerbasamagi=input%10;
        rakamlartoplami+=birlerbasamagi;
        input/=10;
        birlerbasamagi=input%10;
        rakamlartoplami+=birlerbasamagi;
        input/=10;
        birlerbasamagi=input%10;
        rakamlartoplami+=birlerbasamagi;
        input/=10;
        System.out.println(rakamlartoplami);

    }


}
