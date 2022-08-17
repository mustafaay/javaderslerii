package practice3;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelimeyi giriniz");
        String kelime1=scan.nextLine().toLowerCase();
        System.out.println("2. kelimeyi giriniz");
        String kelime2=scan.nextLine().toLowerCase();
        System.out.println("3. kelimeyi giriniz");
        String kelime3=scan.nextLine().toLowerCase();
        System.out.println("4. kelimeyi giriniz");
        String kelime4=scan.nextLine().toLowerCase();

        System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+"  "+
               kelime2+"  "+kelime3+"  "+kelime4+ "  .  "  );








    }






}
