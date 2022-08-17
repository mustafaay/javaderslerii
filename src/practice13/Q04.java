package practice13;

public class Q04 {


    public static void main(String[] args) {

    /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/

        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};


        elemansayisi(arr);

    }

    public static void elemansayisi(int[][] arr) {

       /*
       for (int[] each:arr) {
    for (int i:each) {
        sayac++;   buda baska cozumu
        */


        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr[i].length; j++) {
                sayac++;


            }
        }


        System.out.println(sayac);


    }
}
