package practice7;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {

        String cunle = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";


        cunle = cunle.replaceAll(" ", "");
        System.out.println(cunle.length());

        String[] harf = cunle.split("");
        System.out.println(harf.length);

        String cunle2 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        String[] kelime = cunle2.split(" ");
        int bosluk = kelime.length - 1;
        System.out.println(bosluk);

        String[] caracter = cunle2.split("");
        System.out.println(caracter.length - bosluk);


    }

}
