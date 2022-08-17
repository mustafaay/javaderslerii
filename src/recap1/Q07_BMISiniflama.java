package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {

    public static void main(String[] args) throws InterruptedException {



		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

        Scanner scan=new Scanner(System.in);

        System.out.println("merhaba vucut kitle endeksi hesolama servisine hos heldin");

        Thread.sleep(5000);

        System.out.println("lutfen kilonuzu giriniz");
double kilo=scan.nextDouble();
        System.out.println("lutfen cm cinsinden boyunuzu giriniz");
double boy=scan.nextDouble()/100;

double cevap=kilo/(boy*boy);

if(cevap<=20) {
    System.out.println("oldukca zayifsiniz");
}
else if(cevap>20 && cevap<=25){
    System.out.println("normal sinirlardasiniz");
}
else if(cevap>25&&cevap<=30){
    System.out.println("sisman katogorisindesiniz");
}
else {
    System.out.println("obez gurubundasiniz");
}







    }
}
