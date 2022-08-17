package ders24;

import java.util.Arrays;
import java.util.List;

public class C01_Arraydenarreylistyapma {

    public static void main(String[] args) {

        /*
        uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine array olsturup bunlari liste cevirmek daha pratik olabilir


        1-) loop ile array'deki tum elementkleri liste atabilirz


        2-) array.aslist() kulanabiliriz
        ama 2 tane yan etki var
        a-)arrays clasi kulanildigi icin array
        ozelikleri gecerli olur  dolayisiyla liste
        olan add remove gibi size deggostiren methodlar
         bu sekilde olusturukan listlerde kulaniaamaz


        b-) kaynak olan array ile urun olan list
        ozlestirilir . birinde yapilan degisiklik
        otomattik olarak digerinede yapilir


         */

       String[] arr={"ismail","nurulah","fatih"};


        List<String> sinif= Arrays.asList(arr);
        System.out.println(sinif);
        /*
        1.yan etki

         */
     //     sinif.add("erdi");// UnsupportedOperationException hatasi aliiriz

//sinif.remove(1);//UnsupportedOperationException hatasi aliiriz




  //2.yan etki

    arr[1]="emre";
        System.out.println(Arrays.toString(arr));//arrayi degistirirsek listte degisir

        System.out.println(sinif);//yapilan degisiklik her ikisinide kapsar










    }
}
