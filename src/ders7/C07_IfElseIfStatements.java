package ders7;

import java.util.Scanner;

public class C07_IfElseIfStatements {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

        int a=scan.nextInt();

        if (a>=65){


            System.out.println("emekli olabilirsin");

        } else if (a<0) {

            System.out.println("cocuk bir dogsun bakariz");

        }


        else
        {
            System.out.println("emekli olamazsin ");
            System.out.println((65-a)+"  "+"yil daha calisman lazim");

        }


















    }
}
