package practice12;
import ders33_encapsulation.Ogretmen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class hocanin_islemler_clasi {


    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    //static yazmamizin sebebi tum methodlardan ulasamk icin gokte ki ay
    //gokteki ay gibi heryeden ulaşılabilsin
    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();//kullanici kucuk harf girse bile buyuk harfe cevirdik cunku kontrol buyuk harfle yapcaz
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                break;
            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;
        }
    }

    private static void islemMenusu() {
        System.out.println("sectigin kisi turu  " + kisiTuru + "  lutfen asagidaki islmleri seciniz");
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");
        System.out.println("islem tercihinizi giriniz: ");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();//yapildi
                islemMenusu();//method call ile islem menusune taekrar gider
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                //listeleme();
                islemMenusu();
                break;
            case 4:
                //silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();//yani ana menu
                break;
            case 0:
                //cikis();
                break;
            default:
                System.out.println("guzel birsey gir");
                islemMenusu();
                break;
        }
    }

    private static void arama() {
        System.out.println("**** " + kisiTuru + " arama sayfasina hosgeldin");
        boolean flag = true;//bayrak yukarda true olan her saart devam eder aksiyon baslasin
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//bu satiirda ogrenci ariyorsa calisir
            //dummy
            System.out.println("kimlik no giriniz");
            String arananKimlikNo = scan.next().replaceAll(" ", "");//kullanici bosluk girerse diye bosluk hiclik yapilfi
            for (Kisi w : ogrncList) {
                if (w.getKimlikno().equals(arananKimlikNo)) {//kullanicinin girdigi tc ile ogrenci listinde ki tc lerden eslesen var mi
                    System.out.println("aradiginiz ogrenci " + w.getAdsoyad());
                    flag = false;
                }
            }
            if (flag) {//flag true ise hala bu if body si calisir. yani aranan tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogrenci yok ");
            }//94 den 107 ye kadar ogrenci islemleri
        } else {// ogretmen icin caliscak

            System.out.println("kimlik no giriniz");
            String arananKimlikNo = scan.next().replaceAll(" ", "");//kullanici bosluk girerse diye bosluk hiclik yapilfi
            //dummy
            for (Kisi w : ogrtmnList) {
                if (w.getKimlikno().equals(arananKimlikNo)) {//kullanicinin girdigi tc ile ogrenci listinde ki tc lerden eslesen var mi
                    System.out.println("aradiginiz ogretmen " + w.getAdsoyad());
                    flag = false;
                }
            }
            if (flag) {//flag true ise hala bu if body si calisir. yani aranan tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogretmen yok ");
            }//else body si komple ogretmen icin tasarlandi
        }
    }

    private static void ekle() {//bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("**** " + kisiTuru + " ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim gir");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.println("kimlik gir");
        String kimliNo = scan.nextLine();
        System.out.println("yas gir");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {//TODO sonra doldur
        } else {//cozum berk karanfil bey den
            scan.nextLine();//dummy6 kod hata almamak icin//
            System.out.println("bolum gir");
            String bolum = scan.nextLine();
            System.out.println("sicil no gir");
            String sicilNo = scan.nextLine();
            ogretmen ogretmen = new ogretmen(adSoyad, kimliNo, yas, bolum, kimliNo);
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);
        }
    }

}