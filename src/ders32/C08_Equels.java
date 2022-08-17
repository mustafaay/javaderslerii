package ders32;

public class C08_Equels {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        String str="java";
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));

/*
StringBuilder'da equels methodu ancak ayni obje olursa true doner
Stringteki gibi dusunmemeklazim

 */

        System.out.println(sb1.equals(str));



/*
equals () methodu parantez icinde yazarsak hata vermez ama false doner
 */


        System.out.println(sb1.compareTo(sb2));//0
        StringBuilder sb4 = new StringBuilder("jave");
        System.out.println(sb1.compareTo(sb4));//-4





        /*
copmearto iki StringBuilder'i  bastan baslayarak har harf karsiastirir ilk harfler ayni ise ikincilere gecer
iikinciler ayiysa ucuncuye gecer ve ikl farkli oolan harfe kadar gider
farkli olan iki harfin ascii kodlari arasindaki farki veriri



eger hic farkli harf yoksa sonuc olarak 0 dondurur
 */











    }
}
