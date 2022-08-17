package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class r {

    public static void main(String[] args) {

        /*

        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

Test Data:
sentence -> "Java is fun"

Copied!
reversed **-> "**fun is Java**"**
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String reversed = "";
        String sentence = input.nextLine();
        reversed=reversed.toLowerCase();
        String[] arr = sentence.split(" ");
        List<String> str = new ArrayList<String>();
        int a = 1;
        for (int i = 0; i < arr.length; i++) {


            str.add(arr[arr.length - a]);


            a++;
        }


        reversed = str.toString();
        reversed="**"+ reversed+"**";
        System.out.println(reversed);



    }
}
