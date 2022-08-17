package ders31;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {

    public static void main(String[] args) {

        enuzunkelimeyiyazdir("ali","ayse","ismail");

















    }

    public static void enuzunkelimeyiyazdir(String... kelime) {

String enuzunkelime=kelime[0];

for (String a:kelime) {

    if(a.length()>enuzunkelime.length()){

        enuzunkelime=a;
    }






}

        System.out.println(enuzunkelime);



    }


}
