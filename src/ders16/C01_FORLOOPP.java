package ders16;

public class C01_FORLOOPP {

    public static void main(String[] args) {
        //verilen bir pozitif tam sayinin
        //tam bolenlerini yazdirin

        int input = 20;
        for (int i = 0; i <input ; i++) {
            if(input%i==0){
                System.out.println(i);
            }
        }


    }
}
