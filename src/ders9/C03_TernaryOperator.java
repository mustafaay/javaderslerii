package ders9;

import java.util.Scanner;

public class C03_TernaryOperator {

    public static void main(String[] args) {


        //kulanicidan bir ayi isteyin
        //sayi pozitifse sayiyi yazdirir
        //sayi negatitifse bir sayi daha isteyin ve carpimlarini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scanner.nextDouble();

if(sayi>0)
{
    System.out.println("sayi = " + sayi);
}

else {
    System.out.println("lutfen bir sayi daha giriniz");
    double sayi2 = scanner.nextDouble();
    System.out.println(sayi2*sayi);


}

//eger if else icerisinde yeni kodlar varsa
//  ternary ile yazmamiz mumkun degil















    }
}
