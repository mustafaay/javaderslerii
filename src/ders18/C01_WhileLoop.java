package ders18;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        kulanicidan baslangic ve bitis harflerini alin
        ve baslangic harfinden baslayim bitis harfinden baslayan
        tum harfleri yazinn
        buyuk ekran olarak yazin
         */


        char baslangic = 'f';
        char bitis = 't';
        String buyutme = "";
        while (baslangic <= bitis) {

            buyutme =( baslangic + " ").toUpperCase();


            System.out.println(buyutme);
            baslangic += 1;


        }


    }
}
