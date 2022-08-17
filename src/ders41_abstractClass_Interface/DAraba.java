package ders41_abstractClass_Interface;

public abstract class DAraba {

    public static void main(String[] args) {

        /*
        abstract class'da main method opsiyoneldir
        eger abstract class sadece child class'larin
        tasimak zorunda oldugu ozelikleri belirlemek icin olusturulduysa
        main method'a ihtiyac ommaz
        sadece abstract methodlar olur

        ama bir abstract methodda
        standart belirlemek disinda da methodlar calistirilabilir
        bu durumda ihtiyac olursa main method olusturulabilir
         */


    }



    public  abstract void motorr();
/*
sadece child class'larin mecburi tasiyacaklari ozelikleri belirleyen
methodlar abstract method olur ve abstract medhodlarin body'si olmaz'
 */


    public void kilima(){
        System.out.println("bahzi arabalarin kilimasi olabilir");
    }

   /*
   abstract olamayan methodlara  concrete method denir
   abstract bir mwthodu abstract yazarak belirtmek zorundayiz
   concrete methodlarda bunun yazilmasinnin geregi yoktur
   biz sadece abstract ile ilgili konustugumuzda abstract olamayanlari
    methodlardan bahsetmek icin concrete tabirini kulaniriz



    */

public abstract void  yakit();

public abstract void kaporta();




}
