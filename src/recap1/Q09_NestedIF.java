package recap1;

import java.util.Scanner;

public class Q09_NestedIF {

    public static void main(String[] args) {

           /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age < 18  ==> oy kullanmaya uygun degil
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();


if(yas<18){
    System.out.println("yasiniz cok kucun oy kulanamazsin");
}
else if(yas>=18&&yas<50){
    System.out.println("bir kez oy kulanabilirsin");
}
else if(yas>=50&&yas<70){
    System.out.println("iki kez oy kulanabilirsin");
} else if (yas>=70) {
    System.out.println("uc kez oy kulanabilirsin");
}

else {
    System.out.println("yanlis deger girdiniz");
}




    }
}
