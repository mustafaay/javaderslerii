package ders41_abstractClass_Interface;

public class HA160 extends FMercedes{


    /*
    abstract parent silsilesinden gelen ilk concrete class parenti olan tum classlardaki abstract methodlari
    concrete hale donusturmek (override etmek) zorundadir

    bu kuaralin istisnasi parent claslaridan herhangi birinde
    concrete hale donusturulmus abstract methodlardir

     */
    public static void main(String[] args) {


        HA160 araba1=new HA160();
        // concrete bir claastan istedigimiz objeyi uretebiliriz
        FMercedes araba2=new FMercedes();
        //mercedes concrete



       // EToyota araba3=new EToyota();
        //abstract classlar constroctor barindirir ama obje uretemezler
        //toyota clasi abstract class oldugundan obje uretilemez




/*
abstract bir classin ozeliklerini tasiyan bir obje olusturmak istedigimizde
daata turunu istedigimiz abstract class
constroctor'i ise childi olan concrete bir classtan seceriz
 */









    }
}
