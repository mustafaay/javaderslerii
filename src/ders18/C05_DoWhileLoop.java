package ders18;

public class C05_DoWhileLoop {

    public static void main(String[] args) {
/*
9 dan 190 akadar 7 din tam kati olan tum sayilari ekrana yazdirin
 */


        int bas = 9;
        int bitis = 190;

        int temp = bas;


        while (temp < bitis) {

            if (temp % 7 == 0) {

                System.out.print(temp + "    ");


            }

            temp ++;


        }
        System.out.println("     ");
        do {
            if (temp % 7 == 0) {

                System.out.print(temp + "    ");


            }

            temp ++;


        } while (temp < bitis);


    }
}
