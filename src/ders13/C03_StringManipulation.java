package ders13;

public class C03_StringManipulation {

    public static void main(String[] args) {


       // bayram cumartesi pazar pazartesi sali


String str="Java ogrenmek123 cok guzel@  ";
str=str.trim();
str=str.replaceAll("\\d","");
str=str.replaceAll("@","");
str=str.replaceAll("C","c");
str=str+".";
        System.out.println(str);







    }
}
