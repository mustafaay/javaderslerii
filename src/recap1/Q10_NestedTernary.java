package recap1;

import java.util.Scanner;

public class Q10_NestedTernary {

    public static void main(String[] args) {


            /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
String not=scan.next().toUpperCase();



        System.out.println(not.equals("A")? "gayet basarili": not.equals("B")? "basarili":not.equals("C")? "ha gauret":"gecersiz not girdiniz"); ;


























    }
}
