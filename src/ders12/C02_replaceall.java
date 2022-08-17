package ders12;

public class C02_replaceall {

    public static void main(String[] args) {

     String str="bu1gu2n  ha4va- co5k / guzel"  ;


     str = str.replaceAll("\\s","qwertyuiop");





        str=str.replaceAll("\\W","");
str=str.replaceAll("\\d","");

str=str.replace("qwertyuiop"," ");

        System.out.println(str);








    }
}
