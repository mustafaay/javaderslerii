package practice11;

public class Q05 {

    public static void main(String[] args) {
/*
normal toplama methodu var arg ile
toplama methodu yazini
 */
        int[] arr = {17, 20, 33, 9, 23};
        System.out.println(arrtopla(arr));
        System.out.println(varargtopla(arr));



    }




    public static int arrtopla(int[] arr) {
        int toplam = 0;
        for (int w : arr) {

            toplam += w;

        }


        return toplam;

    }

    public static int varargtopla(int... i) {

        int topla = 0;
        for (int w : i) {
            topla += w;

        }
        return topla;


    }
}
