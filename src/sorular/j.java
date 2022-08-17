package sorular;

import java.util.ArrayList;
import java.util.List;

public class j {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]
         */

        String[] str = {"Python", "JAVA", "PHP", "Perl", "C#", "C++" };

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < str.length; i++) {


            list.add(str[i]);


        }
        System.out.println(list);


    }
}
