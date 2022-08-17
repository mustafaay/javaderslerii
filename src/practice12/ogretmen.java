package practice12;

public class ogretmen extends Kisi {

   private String bolum;
   private String sicilno;

    public ogretmen(String adsoyad, String kimlikno, int yas, String bolum, String sicilno) {
        super(adsoyad, kimlikno, yas);
        this.bolum = bolum;
        this.sicilno = sicilno;
    }



    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilno=" + sicilno +
                '}'+super.toString() + '}';









    }

    public String getSicilno() {
        return sicilno;
    }

    public void setSicilno(String sicilno) {
        this.sicilno = sicilno;
    }

    public ogretmen(){

    }
}
