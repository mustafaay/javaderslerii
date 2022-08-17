package ders15;

public class C04_ForLoop {

    public static void main(String[] args) {
//1den 5'e kadar olan tAM Sayilari tolpa
        int toplam =0;

        for (int i = 1; i < 6; i++) {
            toplam+=i;




        }
        System.out.println(toplam);
toplam=0;
        //3-50arasi cift sayilari toplayyyin
        //1/ yontem
        //eger baslangis sayisini biliyorsak
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }

        System.out.println(toplam);
        toplam=0;
        //2.yontem
        for (int i =30; i < 50; i++) {

            if(i%2==0){
                toplam+=i;
            }



        }
        //yukaridaki yontem ile farkli varyasyonlarada uyum saglat
        //mesela 2 ye degilde 7 ye bolunenleri topla gibi

        System.out.println(toplam);
        toplam=0;














    }



}
