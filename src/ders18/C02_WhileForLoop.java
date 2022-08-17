package ders18;

public class C02_WhileForLoop {

    public static void main(String[] args) {

        /*
        kulanicidan bir sayi alin ve sayinin
        toplamini yazdirin
         */

        int input=1234567899;
int rakamlartoplami=0;
int birlertoplami=0;
int temp=input;

while (temp>0){
    birlertoplami=temp%10;
    rakamlartoplami+=birlertoplami;
    temp/=10;

}
        System.out.println(input+" sayisinin rakamlar toplami =  "+rakamlartoplami);













    }
}
