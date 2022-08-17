package sorular;

public class l {
    public static void main(String[] args) {


/*
1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:

Sayilarin Toplami : 5050
 */

        int toplam = 0;

        for (int i = 0; i < 101; i++) {

            toplam += i;


        }

        System.out.println("1-100 arasi sayilarin toplami  =  " + toplam);


    }
}
