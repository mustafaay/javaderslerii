package practice3;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kemime girini");
        String str = scan.nextLine().toLowerCase();


        System.out.println(KlimeBulucu(str));


    }

    public static boolean KlimeBulucu(String str) {


        if (str.contains("xyz")) {

            return true;
        } else {
            return false;

        }


    }


}
