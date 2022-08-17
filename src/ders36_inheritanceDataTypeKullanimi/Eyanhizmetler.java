package ders36_inheritanceDataTypeKullanimi;

public class Eyanhizmetler extends Bmuhasebe {

    protected int saatucreti = 9;
    protected int gunlukmesai = 8;


    protected void maas() {
        System.out.println("yanhizmelliler =  " + (30 * saatucreti * gunlukmesai) + " ucret alir");
    }


    protected void issizliksigorta() {
        System.out.println("yan hizmetlililer %30 indirile  sigorta yaptirabilirler");
    }


    public static void main(String[] args) {


/*
owerriding child classtaki bit methodun
parent classtaki ayni isimdeki methodu etkisisz hale getirerek
endisinin spesifik ozeligini ortaya cikarmasidir


owerridingi nerede dikata aliyoruz ?
bir oje olurulurken
data turu ve controctor fakli ise

eger bir obje olusturulurken data turu ve controctor fakli ise objenin ozelilerini belirlerken 3 konuya dikat cekmeliyiz
1-) obje controctor'in oldugu claasta olusur
2-) objenin ozeliklerini aramaya  data turunun oldugu calssta baslariz
bu classta aranan ozelik bulunamazsa parent claaslara bakilir ordada coksa cte  veriri



eger aranan ozelik variable ise owerridin ihtimali olmadigi icin bulunan ilk degeri yazdiririz
  3-) arana ozelik method ise degeri yazdirmadan once owerrid edilmis mi diye kotrol etmemiz gerekir
  eger owerride edildiyse en guncel deegri yazdiririz





 */







    }













}
