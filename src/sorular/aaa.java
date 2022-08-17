package sorular;

import java.util.ArrayList;
import java.util.List;

public class aaa {

    public static void main(String[] args) {
        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List: siyah,mavi,kirmizi,beyaz

en başa: pembe

mavi-kirmizi arasına yesil renk eklenecek.

Beklenen Çıktı:
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
         */



        String []arr={"siyah","mavi","kirmizi","beyaz"};
     List<String> list=new ArrayList<String>();
        for (int i = 0; i < arr.length ; i++) {


            list.add(arr[i]);


        }
        list.add(0,"pembe");
        System.out.println(list);
        list.add(2,"yesil");
        System.out.println(list);






    }
}
