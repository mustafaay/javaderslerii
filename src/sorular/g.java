package sorular;

public class g {

    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020
Beklenen Çıktı:**True**
Aranan Değer:2010
Beklenen Çıktı :**False**
         */

        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};

        int aranandeger = 2020;
        boolean varmi = false;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == aranandeger) {

                System.out.println("**true**");
                varmi = true;
                break;

            }


        }

        if (!varmi) {
            System.out.println("**false**");

        }


    }
}
