package practice1ve2;

import java.util.Scanner;

public class Q10_scanner02 {

    public static void main(String[] args) {

// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);
       // System.out.println("merhaba lutfen bana adini , memleketini suanki konumunu yasini ve boyunu soylermisi  \nHER BILGIDEN SONRA ENTERA BASMAYI UNUTMA");
        System.out.println("isminiz?");
String ad=scan.nextLine();

        System.out.println("memleketiniz?");
String memleket=scan.nextLine();

        System.out.println("suanki konumunuz?");
String konum=scan.nextLine();

        System.out.println("yasiniz?");
int yas=scan.nextInt();

        System.out.println("boyunuz?");
double boy=scan.nextDouble();

        System.out.println("yasadiginiz "+konum+" seviyormusun ?"+ "\n eger seviyorsaniz true sevmiyorsaniz folse yazin");
   boolean seviyorMu=scan.nextBoolean();

        System.out.println("ad = " + ad);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);











    }
}
