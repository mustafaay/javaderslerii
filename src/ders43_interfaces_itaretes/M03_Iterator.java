package ders43_interfaces_itaretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);//[ 10 , 20 , 30 ]
        /*
        listtedeki tum elementleri index kulanmandan 3 artirin
         */

        for (Integer a : list
        ) {
            a += 3;

            System.out.println(a + "   ");//13 23 33   ama kalici degildir

        }
/*
java indext yapisi olmayan colection'lardaki elementlere ulasmak veya degistirmek
icin iterator interfaces'ini olusturmustur




iterator interfaces oldugundan ondan obje uretmemiz mumkun degildir
bunun yerine bize iterator donduren liste.iterator() kulaniyoruz
 */

        Iterator it1 = list.iterator();


// iterator'da geri donus yok adim adim
        //sona ulastiktan sonra yeniden bir itaretor olusturmak gerekir


    while (it1.hasNext()){
        it1.next();
        it1.remove();
    }

        System.out.println(list);
/*
gorundugu uzere iterator kulanarak yapabildigimiz
1-) cloxtion elementlerini yazdirmak
2-) tup cloxtion elementlerini silmek
bunlarda bize yatmez
 */

    }
}
