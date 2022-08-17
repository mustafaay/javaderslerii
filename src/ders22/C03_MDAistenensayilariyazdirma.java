package ders22;

public class C03_MDAistenensayilariyazdirma {

    public static void main(String[] args) {

        /*

        verilen 2 katli  bir multi dimeansional array'de
        outor indexi ve inner indexi ayni olan saylarin toplamin bulunuz

           int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};
           [0][0]+[1][1]+[2][2]...........
         */
        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

int toplam=0;
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if(i==j){

                    toplam+=sayilar[i][j];

                }

            }



        }

        System.out.println(toplam);















    }
}
