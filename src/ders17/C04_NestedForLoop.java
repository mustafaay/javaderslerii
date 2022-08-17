package ders17;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {
        //verilen input'a gore * lardan olusan bir ucgen olusturun

        //orn
      // input =4;
      // *
      // **
      // ***
      // ****
        for (int k = 0; k < 100; k++) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen deger giriniz");
        int input=scan.nextInt();






        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }

            System.out.println("   ");

        }


        }






    }
}
