package practice4;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
// for dongusu ile
        for (int i = 0; i <= 255; i++) {

            char c = (char) i;

            System.out.println(c + " =  " + i);


        }


        //while ile
        int i = 0;
        while (i <= 255) {

            char sembol = (char) i;

            System.out.println(sembol + " =  " + i);
            i++;


        }
        // do ile

        int b = 0;
        do {
            char karakter = (char) i;

            System.out.println(karakter + " =  " + i);
            b++;

        } while (b <= 255);


    }
}
