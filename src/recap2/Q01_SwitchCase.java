package recap2;

import java.util.Scanner;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutgen haftanin gunlerinden bir tane giriniz");
        String gun = scan.next().toLowerCase();

        switch (gun) {
            case "pazartesi":
                System.out.println("java ders gunu");
                break;

            case "sali":
                System.out.println("java ders gunu");
                break;

            case "persembe":
                System.out.println("Selenyum dersi gunleri");
                break;

            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;

            case "carsamba":
                System.out.println("SQL dersi gunleri");
                break;


            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;

            case "pazar":
                System.out.println("izin gunu");
                break;

            default:
                System.out.println("lutfen gecerli gun giriniz");


        }


    }


}
