package ders26;

public class KamyonRunner {

    public static void main(String[] args) {


        Kamyon kamyon1=new Kamyon();

        System.out.println("kamyon1 ozelikleri"+kamyon1.toString());


Kamyon kamyon2=new Kamyon("mercedes","4140",2005,50000);


        System.out.println("kamyon 2 bilgileri =  \n"+kamyon2);


        Kamyon kamyon3=new Kamyon("man","as900",2007,40000);


        System.out.println("kamyon 3 bilgileri =  \n"+kamyon3);


Kamyon kamyon4=new Kamyon("scanya","s540");

    }
}
