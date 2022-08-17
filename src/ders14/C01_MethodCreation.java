package ders14;

public class C01_MethodCreation {

    public static void main(String[] args) {

        //input larak verilen 4 harfli bir Stringi
        // tersten yazdiran bir method olusturun

terstenyazdir("mustafa");

    }
public static  void  terstenyazdir(String input){

        String tersiput=input.substring(7)+

                input.substring(6,7)+
                input.substring(5,6)+
                input.substring(4,5)+
                input.substring(3,4)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);












    System.out.println("verrilen kelimeneni n tersi "+tersiput);


}





}
