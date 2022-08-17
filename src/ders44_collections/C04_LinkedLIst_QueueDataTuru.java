package ders44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedLIst_QueueDataTuru {

    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList();
        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("hpolat");
        ll3.add("kadir");
        //queue kuyruk demektir ve sira onemlidir
        //gelen sona gelir giden bastan gider
        System.out.println(ll3);//[adem, zeynep, hpolat, kadir]
        System.out.println(ll3.remove());//adem
        System.out.println(ll3);//[ zeynep, hpolat, kadir]
        System.out.println(ll3.remove("hpolat"));//true
        System.out.println(ll3);//[ zeynep, kadir]
        System.out.println(ll3.element());//zeynep
        System.out.println(ll3.peek());//zeynep

        Queue<String> ll4 = new LinkedList();
     //   System.out.println(ll4.element());//NoSuchElementException
        System.out.println(ll4.peek());//null  aradaki tek far biri hata verri biride null dondurur
/*
peek ve element silmeden ilk  elementi
bizer dondurur
aralarindaki fark bos liste olursa
 peek null donem element exception firlatir

 */

        System.out.println(ll3.offer("ahmet"));//true
        System.out.println(ll3);//[zeynep, kadir, ahmet]
        ll3.offer("sefa");
        System.out.println(ll3);//[zeynep, kadir, ahmet, sefa]
        System.out.println(ll3.poll());//zeynep
        System.out.println(ll3);//kadir, ahmet, sefa]
        /*
       poll bastakini siler ve bize getirir

         */
        System.out.println(ll4.poll());// null
        /*
        poll eger bosa null dondurur   ama remove hata dondurur
         */
     //   System.out.println(ll4.remove());//NoSuchElementException
    }
}
