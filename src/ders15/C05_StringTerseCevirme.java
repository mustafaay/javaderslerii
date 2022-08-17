package ders15;

public class C05_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen String terse cevirip yazdiran methot yazin

        String input = "mustafa ay tam bir dahi";


        terstenyazdir(input);


    }

    public static void terstenyazdir(String input) {
        String tersinput = input.substring(input.length() - 1);
        for (int i = input.length() - 2; i >= 0; i--) {

            tersinput += input.substring(i, i + 1);


        }


        System.out.println(tersinput);


    }


}
