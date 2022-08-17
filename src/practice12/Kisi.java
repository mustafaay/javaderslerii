package practice12;

public class Kisi {

  private   String adsoyad;
  private   String kimlikno;
  private   int yas;

    public Kisi() {

    }

    public Kisi(String a, String kimlikno, int yas) {
        this.adsoyad = a;
        this.kimlikno = kimlikno;
        this.yas = yas;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(String kimlikno) {
        this.kimlikno = kimlikno;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adsoyad='" + adsoyad + '\'' +
                ", kimlikno='" + kimlikno + '\'' +
                ", yas=" + yas +
                '}';
    }
}
