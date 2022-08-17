package ders32;

public class C05_IndextOfVeLastIndextOf {

    public static void main(String[] args) {

       StringBuilder sb = new StringBuilder("pay attention please");


        System.out.println(sb.indexOf("pay"));


        System.out.println(sb.indexOf("e"));
        System.out.println(sb.indexOf("e",10));

        System.out.println(sb.lastIndexOf("e"));

        System.out.println(sb.lastIndexOf("e", 10));
    }
}
