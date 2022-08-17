package sorular;

import java.util.Scanner;

public class ll {


        /*
        Ugly Number:

Girilen bir sayının ugly number olup olmadığını kontrol etmek için bir Java programı yazın.

Sayı sisteminde, ugly number sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10 ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

Test Data:
13
Beklenen çıktı:
ugly number  degildir
Test Data:
25
Beklenen Çıktı:
ugly number
         */

    public static void main(String args[]) {
        System.out.println("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        // Store the input number
        Integer inputNumber = scan.nextInt();
        checkUglyNumber(inputNumber);
    }

    public static void checkUglyNumber(Integer inputNumber) {
        int num = inputNumber;
        /* Loop will run until
        num becomes 1 */
        while (num != 1) {
            if (num % 2 == 0)
                num /= 2;
            else if (num % 3 == 0)
                num /= 3;
            else if (num % 5 == 0)
                num /= 5;
            else {
                System.out.println(inputNumber + " is NOT an Ugly Number");
                /* Come out of the loop,
                method has void return type */
                return;
            }
        }
        System.out.println(inputNumber + " is an Ugly Number");


    }


}
