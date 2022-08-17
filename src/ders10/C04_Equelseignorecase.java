package ders10;

public class C04_Equelseignorecase {

    public static void main(String[] args) {


        String str1="Ali Can";
        String str2="ali can";
        String str3="ALI CAN";
        String str4 ="Ali Can_ ";

        System.out.println(str1.equals(str2)); //false olur
        System.out.println(str1.equalsIgnoreCase(str2));//true olur


        System.out.println(str2.equals(str3)); //false olur
        System.out.println(str2.equalsIgnoreCase(str3));//true olur


        System.out.println(str1.equals(str4)); //false olur
        System.out.println(str1.equalsIgnoreCase(str4));//false olur





    }
}
