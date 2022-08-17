package ders32;

public class C07_Delete {

    public static void main(String[] args) {



        StringBuilder sb = new StringBuilder("java her zaman guzeldir");
        sb.delete(8,9);
        System.out.println(sb);
sb.deleteCharAt(8);
        System.out.println(sb);


// bastan baslayarak her loopta ilk harfi silip kalani yazdralim
int son=sb.length();

        for (int i = 0; i <son ; i++) {

            sb.deleteCharAt(0);
            System.out.println(sb);



        }










    }
}
