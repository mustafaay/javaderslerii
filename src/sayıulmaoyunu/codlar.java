package sayıulmaoyunu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class codlar {


public static void girissayfasi(){

    System.out.println("aciklama icin 1   \noyun icin 2 ye basini");
    Scanner scan=new Scanner(System.in);
    char giris=scan.next().charAt(0);
    switch (giris) {
        case '1':
            aaciklamagetir();
            oyunabasklama();
            sayikontrol();

            break;
            case '2':
                oyunabasklama();
                sayikontrol();
                break;
        default:
            System.out.println("lutfen gecerli bir giris yapiniz");
    break;
    }


}

    public static void sayikontrol() {
        System.out.println("oyun basliyor");
    int [] girilensayiarr=new int[4];
        Scanner scan=new Scanner(System.in);
    int arti;
    int eksi;
    int toplambilinen=0;
    int sayici=0;
    int test=0;
    do{
        arti=0;
        eksi=0;
        toplambilinen=0;
        test=0;
        System.out.println("lutfen 4 basamakli rakamlari birbirinden farkli sayi giriniz");

        int tahminsayisi=scan.nextInt();
        girilensayiarr[3]=tahminsayisi%10;
        girilensayiarr[2]=(tahminsayisi%10)/10;
        girilensayiarr[1]=(tahminsayisi%10)/100;
        girilensayiarr[0]=(tahminsayisi%10)/1000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4 ; j++) {
                if(girilensayiarr[i]==girilensayiarr[j]){
                    test++;
                }

            }

        }
       if(tahminsayisi<1000||tahminsayisi>9999){
           System.out.println("lutfen 4 basamakli sayi giriniz");
       } else if (test>4) {
           System.out.println("");
           System.out.println("lutfen basamaklari birbirinden farkli 4 basamakli sayi giriniz");
       } else {
           for (int i = 0; i <4 ; i++) {
               for (int j = 0; j <4; j++) {

                  // if(girilensayiarr[i]==sayiuret[j])




               }
           }

















       }


    }while (arti<4);















    }

    public static void oyunabasklama() {
int test = 0;
 int [] sayiuret=new int[4];

        Random rnd=new Random();
        do{
        int sayi=rnd.nextInt(9999-1000)+1000;
            for (int i = 3; i >=0 ; i--) {
              sayiuret[i]=sayi%10;
              sayi/=10;
            }
            for (int i = 0; i <sayiuret.length ; i++) {
                for (int j = 0; j <4 ; j++) {

                  if(sayiuret[i]==sayiuret[j]){
                      test++;
                  }



                }

            }
if(test==4){
    break;
}
          else {
    test=0;
}




        }while (test<4);


        System.out.println(Arrays.toString(sayiuret));


    }

    public static void aaciklamagetir() {
int n=0;
        FileInputStream fis=null;
       try {
           fis=new FileInputStream("src/sayıulmaoyunu/aciklama.txt");
           while ((n=fis.read())!=-1){
               System.out.print((char)n);


           }
       } catch (FileNotFoundException e) {
           System.out.println("dosya bulunamadi");
       }catch (IOException e){
           System.out.println("dosya uzantisi bozuk olabilir");
       }


    }

}
