package ders17;

public class C01_ForLoop {

    public static void main(String[] args) {
        //verilen string'de ki kulanilan harfleri
        //tekrarsis olarak yazdirip
        //kelimede kulanilan farkli harf sayisini veren
        //bir method yaziniz

        String input = "taka tuka";
        tekrarsizyap(input);
    }

    public static void tekrarsizyap(String input) {

        String benzersizinput = "";
        String islenecekkelime = input.replaceAll(" ", "");
        System.out.print(islenecekkelime.substring(0, 1));
        benzersizinput += islenecekkelime.substring(0, 1);


        for (int i = 1; i < islenecekkelime.length(); i++) {

            if (!benzersizinput.contains(islenecekkelime.substring(i, i + 1))) {

                System.out.print(", " + islenecekkelime.substring(i, i + 1));
                benzersizinput += islenecekkelime.substring(i, i + 1);
            }


        }

        System.out.println("     ");
        System.out.println("     ");
        System.out.println("     ");
        System.out.println("      ");
        System.out.println("input = " + input);
        System.out.println("benzersiz input= " + benzersizinput);
        System.out.println("Kelimede verilen farkli harf sayisi: "+benzersizinput.length());


    }
}
