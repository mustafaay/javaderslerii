package practıce10.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {


    public static void main(String[] args) {


        System.out.println("*****HOSGLDINIZ*****");
        Scanner scan = new Scanner(System.in);


        System.out.println("lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("lutfen soisim giriniz");
        String soisim = scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans = scan.next();



        System.out.println("lutfen telefon numaranizi giriniz");
        String telefon = scan.next();

        OgretmenBilgileri adayogretmen=new OgretmenBilgileri(isim,soisim,yas,brans,telefon);

        List<OgretmenBilgileri> ogretmenlist=new ArrayList<>();
        ogretmenlist.add(adayogretmen);

        System.out.println("girilen bilgi;er  \n "+ogretmenlist);






    }

}
