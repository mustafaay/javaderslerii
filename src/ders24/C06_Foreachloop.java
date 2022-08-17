package ders24;

import java.util.ArrayList;
import java.util.List;

public class C06_Foreachloop {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9};


        List<Integer> list=new ArrayList<>();


        //arayi inceleyelim
        //tek sayi olanlari
       // listeye ekleyelim

        for(int t:arr){

            if(t%2==1){

                list.add(t);
            }


        }
        System.out.println(list);











    }
}
