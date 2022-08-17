package practice6;

import java.util.Scanner;

public class Q04_DoWhileLoop {
     /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        String str="";



        do{
            System.out.println("lutfen kelime giriniz");
            str=scan.next();

if(str.length()<3){

    System.out.println("en az 3 kararakter olmalidir");

}if (str.length()%2==1&& str.length()>=3) {

                System.out.println(str.charAt(str.length()/2));





}


else {


                System.out.println("You entered wrong word");
            }




        }while(! (str.length()%2==1&& str.length()>=3));















    }
}
