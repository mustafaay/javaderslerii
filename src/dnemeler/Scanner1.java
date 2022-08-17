package dnemeler;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

    //   Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

    //           IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)


    //   BMI 18,5'in altındaysa zayıfsınız

    //   BMI 18,5 ile 25 arasında ise kilonuz idealdir

    //   BMI 25-30 arasındaysa şişmansınız

    //   BMI 30'dan büyük veya eşitse, obez


    //   Input:

    //   Output:

    //   Agirlik : 71

    //   Boy : 1,72

    //   BMI : 23.99945916711736

    //   Zayifsiniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen  kilonuzu giriniz");
double kilo =scan.nextDouble();
        System.out.println("lutfen cm cinsinden boyunuzu giriniz");
int boy =scan.nextInt()/100;

double vki=kilo/(boy*boy);




     if (vki<=18.5){

         System.out.println("zayifsiniz");



        } else if (vki<=25) {
         System.out.println("ideal kilodasiniz");
     }

     else if (vki<=30) {
         System.out.println("sismansiniz");
     }

     else {
         System.out.println("obez");
     }


    }
}
