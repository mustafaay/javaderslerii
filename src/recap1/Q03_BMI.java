package recap1;

import java.util.Scanner;

public class Q03_BMI {

    public static void main(String[] args) {

        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen buyunuzu girin(m)");
double boy=scan.nextDouble();
        System.out.println("kilonuzu giriniz (kg)");
double kilo = scan.nextDouble();

double vki= kilo/(boy*boy);
        System.out.println("vucut kitle endeksiniz" + vki);


    }
}
