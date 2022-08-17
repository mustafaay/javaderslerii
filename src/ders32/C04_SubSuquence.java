package ders32;

public class C04_SubSuquence {


    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("kayra");
        sb.substring(0,3);

        //bu method String dondurdugu icin String bulderin eski halini degistiremez
        System.out.println(sb);

        sb.subSequence(0,3);
        System.out.println(sb);









    }
}
