package ders16;

public class C06_NestedForLoop {

    public static void main(String[] args) {

        //bazen tek degisken sorunu cozmeye yetmez
        //  *
        //  **
        //  ***
        //  ****
        //  *****
        //  ******

        //3 tane yan yana yildiz yaz deseler bu kolay
        //  for (int i = 1; i <3; i++) {
        //      System.out.print("* ");

        //  }

        //  //yan yana 4 tane * yildiz yazin
        //  for (int i = 1; i <4; i++) {
        //      System.out.print("* ");

        //  }


        //  System.out.println("      ");
        // bu tur durumlarda ic ici loop kulanmak gerekir
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");

            }

            System.out.println("   ");


        }


    }
}
