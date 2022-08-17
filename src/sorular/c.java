package sorular;

import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int input1='a';
int input2='z';
        do {
            int ascii=input1;
            System.out.println(" Ascii value of "+ input1+" = "+ascii);
            input1++;
        }while (input1<=input2);
        for (int i = input1; i <=input2 ; i++) {
            int ascii=i;
            System.out.println(" Ascii value of "+ i+" = "+ascii);
        }









    }
}
