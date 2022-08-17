package ders18;

public class C03_DoWhileForLoop {

    public static void main(String[] args) {

        /*
while loop da once kontrol edeip sonra
islem yaptigimiz
icin islem bitiktek sonnra loopun kirilmasi icin  bir kez daha basa donmemiz gerekiyor
bu yuzden fazladan 1 islem yapiliyor
         */
        int sayi = 7;
        while (sayi < 10) {

            System.out.println(sayi);
            sayi++;

        }
/*
do while ile calistigimizda bu dez avantaj ortadan kalkar
 */
        sayi = 7;

        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < 10);


    }
}
