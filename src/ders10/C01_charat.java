package ders10;

public class C01_charat {

    public static void main(String[] args) {


        String str="java ogrenmek cok guzel";
        System.out.println(str.charAt(0)); //bize str Srtingin ilk harfini yazdirir yani "j"

        System.out.println(str.toUpperCase().charAt(7));//ekrana R yazdirir

        System.out.println(str.charAt(21));//ekrana l yazdirir

        System.out.println(str.charAt(22));//hatta verir cunku  maximum kararketer sayisi-1 ile bulunur yani buraya maksimim 21 yazilir

// son harfi bulmak icin st'in uzunlugunun 1 eksigini index olarak gireriz
// eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir

//charat metedu kulandigimizda sonuc char olacagi icin artik manipilasyon yapamayiz
//string metodlarindan kunlamamiz gereken metod varsa charat den once kulanmaliyiz







    }
}
