package practice13;

public class Q02 {

    public static void main(String[] args) {


   /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */


//1.Yol: StringBuilder () kullanarak

String input="all is well";

StringBuilder str= new StringBuilder();
str.append(input);
        System.out.println(str);
        String terinput=str.reverse().toString();
        System.out.println(terinput);

//2.Yol: String Classini kullanarak
        System.out.println("2. yol  ");
        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));

        }










    }
}
