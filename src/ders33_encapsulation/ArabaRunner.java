package ders33_encapsulation;

public class ArabaRunner {

    public static void main(String[] args) {
//arb1 objesi uzerinden marka variablesine ulasabildik degistirebildik(yazma,set) ve yazdirabildik(okuma,get)
        araba arb1=new araba();
        arb1.marka="toyota";
        System.out.println(arb1.marka);

//accses modifire kulanarak marka variablesine
// ulasimi tamamen serbest yapabilir veya tamamen
// engeleyebiliriz
//private yaptigimiz modele ise hic lasamayiz
//yani acses modifire ya hep hic diyiyor


        //markayi degistirelim ama goremeyelim
        //yakiti gorelim ama degistiremeyelim


//set ve get yetkilerini ozel olarak tanimlamak istersenin
        //1.adim ; ozel yetki olarak tanimalayacagiz veriableyi private yapin
        //baska class'lardan ulasmak mumkun olmadagindan
        //2.adim; set yetkisi icin setter , get yetkisi icin getter methodlari ousturalim

     arb1.getYakit();
arb1.setModel("tesla");

    }
}
