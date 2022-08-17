package practice6;

import java.util.Scanner;

public class Q03_DoWhileLoop {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String str="";

        do{
            System.out.println("bir harf giriniz");
      str=scanner.next();
            System.out.println("program calisiyor...");


        }while (!str.equalsIgnoreCase("x"));


        System.out.println("      ");
        System.out.println("PROGRAM  DURDU!!!!!!!!!!!!");













    }
}
