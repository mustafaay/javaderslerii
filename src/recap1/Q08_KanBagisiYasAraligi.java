package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {

    public static void main(String[] args) throws InterruptedException {


        	/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println("kan bagisi servisine hos geldiniz ");
        Thread.sleep(1000);
        System.out.println("lutfen yasinizi girin");
double yas=scan.nextDouble();
        System.out.println("lutfen kilonuzu giriniz");
double kilo=scan.nextDouble();

if(yas>=18&&kilo>=50){
    System.out.println("kan bagisi yapabilirsiniz  ");
}

else if(yas>=18&&kilo<50)
{
    System.out.println("kilonuz cok az kan bagisi yapamazsiniz");
}

else if(yas>0&&yas<18){
    System.out.println("yasiniz cok kucuk kan bagisi yyapamazsin");
}
else{
    System.out.println("yanlis deger girdiniz");
}









    }
}
