package ders19;

public class C01_IstanveVariables {

/*
c;as icerisnde her yerden kulanmak istedigimiz variableslari clas levelde(clasin icinde methodlarin disinda)
olmalidir
 genelikle class level variblesler clasin basinda olusturulur(sart degil )

class leveldeki varibleslar icin 2 scop vardir
1-) static variables(class variableslari denir





2-)instance (static olmayan ) variables (obje variablesi da denir)
 */
int inst=20;



    public static void main(String[] args) {
int sayi=10;
       // System.out.println(inst);inst variablesi static olmadigi icin main meteda direk kulanamayiz
//instance variables'larin diger adi object variables'dir
        //dolayisiyla intance variables'lari obje olusturarak her yerd kulanabiliriz


C01_IstanveVariables obje1=new C01_IstanveVariables();
        System.out.println(obje1.inst);//20
obje1.inst=30;
        System.out.println(obje1.inst);//30


        C01_IstanveVariables obje2=new C01_IstanveVariables();
             System.out.println(obje2.inst);//20


        /*
        her obje oustugunda instance (obje variables)variableslari ilk atana degeri alir
         */









    }

    public  static  void  statichmethod(){

            /*
    bir methodun icerisinde olusturulan variables sadece
    o metodun icinde kulanilir
    (local variables)
     */


/*
inst = 25;
instance variables lari main metod disindaki static variables laradanda ulasamayiz
ama obje olusturursaak ulasabiliriz
 */









    }
    public void  staticOlmayan(){
        System.out.println(inst);
/*
instance variables lar class icerisindeki static olmayan metodlarda direk kulanlabilir
 */

    }










}
