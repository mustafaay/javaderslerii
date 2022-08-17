package sorular;

public class f {

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
        int sayi = 6;
        int bolentoplami = 0;

        if (sayi % 1 == 0 && sayi != 1) {

            bolentoplami += 1;


        }
        if (sayi % 2 == 0 && sayi != 2) {

            bolentoplami += 2;

        }

        if (sayi % 3 == 0 && sayi != 3) {

            bolentoplami += 3;

        }

        if (sayi % 4 == 0 && sayi != 4) {

            bolentoplami += 4;

        }

        if (sayi % 5 == 0 && sayi != 5) {

            bolentoplami += 5;

        }

        if (sayi % 6 == 0 && sayi != 6) {

            bolentoplami += 6;

        }

        if (sayi % 7 == 0 && sayi != 7) {


            bolentoplami += 7;
        }
        if (sayi % 8 == 0 && sayi != 8) {

            bolentoplami += 8;
        }

        if (sayi % 3 == 9 && sayi != 9) {

            bolentoplami += 9;
        }

        if (sayi == bolentoplami) {

            System.out.println(sayi + "  sayisi mumemel sayidir");
        } else {
            System.out.println(sayi + "  sayisi mukemel sayi degildir");
        }




    }
}
