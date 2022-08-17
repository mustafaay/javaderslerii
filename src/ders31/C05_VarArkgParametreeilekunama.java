package ders31;

public class C05_VarArkgParametreeilekunama {
    public static void main(String[] args) {



        enuzunkelimeyiyazdir(5,true,"ali","ayse","ismail");
/*

Varargs teorik olarak sonsuz sayida elemant alabilir
bir methotda varargs para metre olar varsa  varargs in sinirlarinini bilmesi icin parametrelerin sonuncusu olmalidir


bu kuraldan dolari bir methoda sadece 1 tane varrgs olabilir
 */
    }

    public static void enuzunkelimeyiyazdir(int kelimesayisi,boolean dogrumu,String... kelime) {

        String enuzunkelime=kelime[0];

        for (String a:kelime) {

            if(a.length()>enuzunkelime.length()){

                enuzunkelime=a;
            }






        }

        System.out.println(enuzunkelime);



    }





}
