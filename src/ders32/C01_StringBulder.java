package ders32;

public class C01_StringBulder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("java cangir");
        StringBuilder sb3 = new StringBuilder(10);


        System.out.println("uzunluk  " + sb1.length());
        System.out.println("kapasitiy  " + sb1.capacity());


        System.out.println("uzunluk2  " + sb2.length());
        System.out.println("kapasitiy2  " + sb2.capacity());


        System.out.println("uzunluk3  " + sb3.length());
        System.out.println("kapasitiy3 " + sb3.capacity());


        sb1.append("java");

        System.out.println("uzunluk  " + sb1.length());
        System.out.println("kapasitiy  " + sb1.capacity());


        sb1.append(" candir");

        System.out.println("uzunluk  " + sb1.length());
        System.out.println("kapasitiy  " + sb1.capacity());


        sb1.append(", bilen bilir.");

        System.out.println("uzunluk  " + sb1.length());
        System.out.println("kapasitiy  " + sb1.capacity());


    }


}
