package recap2;

public class Q07_StringManipulation {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {


    String  str1= "$13.99";
    String str2= "$10.55";

    str1=str1.replaceAll("\\D", "");//burada $ ve . lari kaldirdik ki sayiya cevirmek daha kolay olsun
    str2=str2.replaceAll("\\D", "");//burada $ ve . lari kaldirdik ki sayiya cevirmek daha kolay olsun
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);

double sayi1=Double.parseDouble(str1);//String olan str1 degiskenini dooble cevirdik
double sayi2=Double.parseDouble(str2);//String olan str2 degiskenini dooble cevirdik
double toplam=(sayi1+sayi1)/100;
        System.out.println("$"+toplam);














    }
}
