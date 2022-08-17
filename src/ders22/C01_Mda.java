package ders22;

import java.util.Arrays;

public class C01_Mda {

    public static void main(String[] args) {

        // tekn katli ereylerde arrayi direk yazdiramiyoruz
        //cunku array non primitive data turudur ve
        // her none orimitive data direk yazdiramayabiliriz

        //ancar arrayin icindeki elementleri direk yazdirabiliriz
        //cunku genede primitive data turu veya String elementler kulaniyorduk
        //multi-dimensiolanl arraylarda en dikat edecegimiz konu
       // ulasmak istedigimiziz elementin arraymi yoksa
       //         primitive dta mi oldugudur

        int [][] sayilar={{1,2,3,4,5},{3,4}};
        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0]==>[1,2,3,4,5]
         */
        System.out.println(Arrays.toString(sayilar[0]));//[1,2,3,4,5]
        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));//[[I@57829d67, [I@19dfb72a]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 3, 4, 5], [3, 4]]

/*
arrayda elemanlari 2 sekilde tanimlaya biliriz
1)  int [][] sayilar={{1,2,3,4,5},{3,4}};
2)outer ve inner arrayleri uzunluklari belirterek olusturabiliriz
int [][] sayilaar = new int [3][4];
ancak 2. yontemle yaptigimiz araylari farkli uzunlukta olma ihtimali olmaz
bu ornek icin outer array'in 3 tane inner arrati vardir
her bir inner arrayi'in farkli


 */
    }
}
