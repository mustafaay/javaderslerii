package ders41_abstractClass_Interface;

public abstract class EToyota extends DAraba {


    @Override
    public void motorr() {
        System.out.println("toyota arabalar cevreci mothor kulanir ");
        /*
        parent classtaki standart belirleyici methodlar (abstract methodlar)'larin tamami child class tarafindan
        override edilmelidir
        concrete methodlarin everride edilme mecburiyeti yoktur
        ister override ederiz istersek etmeyiz



        aslinda toyota calsida obje uretecegimiz bir claas degil
        bu durumda eger proje tasarimi yapiyorsaniz toyta clasinida abstract yapmaniz guzel olur

         */
    }
}
