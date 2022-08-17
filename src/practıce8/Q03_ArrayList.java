package practıce8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */


    public static void main(String[] args) {


        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 102, 47, 0};
        int n =4;


//bir liste olusturalim

        List<Integer> list = new ArrayList<>();
        for (int a : arr) {

            list.add(a);


        }

        List<Integer> maxlist = new ArrayList<>();


        int sayac = 1;


        while (sayac <= n) {


            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {

                if(list.get(i)>max&&!(maxlist.contains(list.get(i)))) {

                    max = list.get(i);
                }


            }

            maxlist.add(max);
            list.remove(list.indexOf(max));
            sayac++;
        }


        System.out.println("arrayin max "+n+"   elemani  "+maxlist);



    }
}
