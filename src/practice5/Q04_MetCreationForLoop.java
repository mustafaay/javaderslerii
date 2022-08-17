package practice5;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to
		  reverse a string. Use for loop
		   and create a method called
		  reverseString */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scan.nextLine();

        reverseString(str);


    }

    private static String reverseString(String str) {

        String reverse = "";



        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }

        System.out.println(reverse);


        return reverse;
    }


}
