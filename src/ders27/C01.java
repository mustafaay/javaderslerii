package ders27;

public class C01 {

    static  int sayi=10;
    int rakam=5;


    public static void main(String[] args) {


        /*
        class levelda 2 tur variable ulusturabiliriz
        static(class) veriablere
         instance(obje) veriablere

         satatic variableler yum classtan kulanilabilirken instance variableler static olmayan methodlardan kulanilabilir
         instance variablelere static variableden ulasmak istersek oje
         olusturmamiz gerekir

         instance variableler obje variable oldugu icin herhangi bir satirda instance variablenin degerinin ne oldugunu
         bulmak icin obje olusturulan satirdan itibaren code incelenmelidir

         static variableler class variableri oldugu icin her hangi bir sattirda
         static variablein degerini bulmak icin classin basinda itibaren code incelenmelidir


         */


        C01 obj1=new C01();
        System.out.println(obj1.rakam);
        System.out.println(sayi);

obj1.rakam+=1;

sayi+=1;

        System.out.println(obj1.rakam);
        System.out.println(sayi);

        C01 obj2=new C01();
        System.out.println(obj2.rakam);
        System.out.println(sayi);


        obj2.rakam++;
        sayi++;





    }






}
