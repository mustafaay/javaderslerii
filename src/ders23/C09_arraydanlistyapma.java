package ders23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_arraydanlistyapma {

    public static void main(String[] args) {

        /*
        list ile calisirkan en kosu ozeligi
        elemanlari tek tek eklemek

         */

      Integer [] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};

/*
bu kadar elemanli sisteyi tek yek eleman olarak girmek yerine array olusturp for lop ile yapariz


 */

List<Integer>sayilar=new ArrayList< >();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);

// baska yontemlede yapabiliriz ama yan etkiler var
/*
yan etkiler
bu sekilde olusturulan listeue add remove gibi
size degistiren methodlar kulanilamaz
 */
        List<Integer>sayilar2= Arrays.asList(arr);

        System.out.println(sayilar);


sayilar.add(5);
        System.out.println(sayilar);

     //   sayilar2.add(5);
        System.out.println(sayilar);

/*
asList methodu ile olusturulan liste ve kaynak olan array birbiri ile ilisik olarak hayatlarina devam ederler
birinde yapilan degisiklik digerindede yansir
 */



        arr[0]=10;

        System.out.println(Arrays.toString(arr));







    }
}
