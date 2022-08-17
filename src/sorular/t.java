package sorular;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        /*
        Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.

Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100
         */



        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        binary1 = in.nextLong();
        binary2 = in.nextLong();
        int ust=1;
        int binar=100010;
        int temp=binar;
        int onlukDeger=0;
        for (int j = binar; j >=0 ; j--) {
            onlukDeger+=(binar%10)*ust;
            binar/=10;
            ust*=2;
        }
        System.out.println(onlukDeger);
        int ust1=1;
        int binar1=110010;
        int temp1=binar;
        int onlukDeger1=0;
        for (int j = binar1; j >=0 ; j--) {
            onlukDeger1+=(binar1%10)*ust1;
            binar1/=10;
            ust1*=2;
        }
        System.out.println(onlukDeger1);
        int toplamOnluk=onlukDeger+onlukDeger1;
        System.out.println("toplamOnluk = " + toplamOnluk);
        int artan=0;
        int toplamIkilik=0;
        while (toplamOnluk>0){
            sum[(artan)++]=toplamOnluk%2;
            toplamOnluk/=2;
        }
        for (int j = artan-1; j >=0 ; j--) {
            System.out.print(sum[j]);
        }
        System.out.println();





















    }
}
