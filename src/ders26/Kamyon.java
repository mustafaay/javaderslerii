package ders26;

public class Kamyon {

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    int yil;
    public int fiyat;

    public Kamyon(String markaa, String modell, int yill, int fiyatt) {

        marka=markaa;
        model=modell;
        yil=yill;
        fiyat=fiyatt;


        /*
        biizim temel amacimiz
       kamyonrunner'de argument olarak girilen degerin
       kamyon classinda intance variableye atanmasi
       ancak scope onusunda ogrendigimiz gibi kamyon constructor
       scopunda marka oldugu icin instance markaya gitmiyor



       bu karisikligi gidermek icin instance varibleyi belirli hale getirmemiz lazim
       java bunun icin this keywordu olusturmustur



genel kulanim acisindan this keywordu kodu herkezin anlamasini kolaylastirdigi icin terci edilir

         */
    }


    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){}

    @Override
    public String toString() {
        return "\nKamyon" +
                "\nmarka=" + marka + '\'' +
                " \nmodel=" + model + '\'' +
                " \nyil=" + yil +
                " \nfiyat=" + fiyat
                ;
    }
}
