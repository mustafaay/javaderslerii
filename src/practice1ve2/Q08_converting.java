package practice1ve2;

import java.util.Scanner;

public class Q08_converting {

    public static void main(String[] args) {






        /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon
        */


//galonu litreye cevirme
        int galon = 1000;
        double litre = galon * 3.785;
        String sonuc = galon + "galon degeri    " + litre + "   litre degeri    ";
        System.out.println(sonuc);

//litreyi galona cevirme
        int l = 100;
        double g = l / 3.785;
        System.out.println(l + " litre degeri " + g + "galona esittir");


     /*

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen fahreneyt cinsinden deger giriniz");
        double f = scan.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("sicaaklik  =  " + c + " derece");


    }


}
