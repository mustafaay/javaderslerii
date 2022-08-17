package ders33_encapsulation;

public class Ogretmen {

   private String isim;
   private String soyisim;
   private String brans;



    /*
    bazende yetkileri sinirlamak degilde yapilan isi
    daha iyi tanimlamak icin
    ancapsulation kulanilir

    bu yaklasimi kulanan classlarda tum variableler private yapilip
    hepsi icin getter ve seeter olusturulur

     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
