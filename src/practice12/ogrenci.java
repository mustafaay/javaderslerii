package practice12;

public class ogrenci extends Kisi{

 private   String ogrencino;
 private   String sinif;


    public ogrenci(String adsoyad, String kimlikno, int yas, String ogrencino, String sinif) {
        super(adsoyad, kimlikno, yas);
        this.ogrencino = ogrencino;
        this.sinif = sinif;
    }

    public ogrenci(){

    }

    public String getOgrencino() {
        return ogrencino;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ogrencino='" + ogrencino + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString();
    }

    public void setOgrencino(String ogrencino) {
        this.ogrencino = ogrencino;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
