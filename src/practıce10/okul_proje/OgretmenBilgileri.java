package practıce10.okul_proje;

public class OgretmenBilgileri {

String isim;
String soyisim;
int yas=0;
String brans;
String telefon;


    public OgretmenBilgileri(String isim,
                             String soyisim,
                             int yas, String brans,
                             String telefon) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.telefon = telefon;
    }


    @Override
    public String toString() {
        return "*****Ogretmen Bilgileri*****\n" +
                "isim  =  " + isim + "\n" +
                " soyisim  =  " + soyisim + "\n" +
                " yas  =  " + yas +"\n"+
                " brans  =  " + brans + "\n" +
                "telefon  =  " + telefon + "\n" ;
    }
}
