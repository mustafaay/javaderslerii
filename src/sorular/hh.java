package sorular;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class hh {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String sentence = input.nextLine();
        String reversed = "";

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


        //Kodlarınızı burada sonlandırınız ve verilen yardımcı kodları değiştirmeyiniz.
        System.out.println(reversed);

    }
}
