package ders33_encapsulation;

public class Tasit {

   private  String tasitturu;
   private  boolean muayenesiVarMi;
   private  int yil;


    public String getTasitturu() {
        return tasitturu;
    }
    //getter methoduda tek bir satırlık islem yapiyor
    //oda maska kilaslari private oldug icin erisemedigi tasit turu bilgisine ulasip
  //  istenen farkli classlara retrun yapar

    public void setTasitturu(String tasitturu) {
        this.tasitturu = tasitturu;
    }
    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o
    // bir satırlık islemde bizim gönderdiğimiz parametreyi instence variable a atıyor.

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    //boolean  vaiablesi icin olusturulan getter methodlarinin ismi isvariable ismi seklide olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
