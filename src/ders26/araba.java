package ders26;

public class araba {


    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    int yil;
    public int fiyat;

    public araba(String markar, String modelr, int yilr, int fiyatr) {
        marka=markar;
        model=modelr;
        yil=yilr;
        fiyat=fiyatr;





    }

    public araba() {

    }

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }
}

