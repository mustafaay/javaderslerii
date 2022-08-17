package sorular;

public class forwhile4 {

    public static void main(String[] args) {

/*
Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
 */


        int bas = 0;
        int bir = 100;
        int temp = bas;
        int sayi = 0;
        int i=bas;
        for (;bas <= bir; bas++) {

            if (bas % 2 == 0) {
                sayi += bas;
            } else if (bas % 3 == 0) {
                sayi += bas;

            } else if (bas % 4 == 0) {
                sayi += bas;

            } else if (bas % 5 == 0) {
                sayi += bas;

            } else if (bas % 6 == 0) {
                sayi += i;

            } else if (bas % 7 == 0) {
                sayi += bas;

            } else if (bas % 8 == 0) {
                sayi += bas;
            } else if (bas % 9 == 0) {
                sayi += bas;

            }
            else if (bas == sayi) {

                System.out.println(bas + "  sayisi mukemmel bir sayidir");
            }

        }



            System.out.println(bas + "  sayisi mukemmel sayi degildir");




    }
}
