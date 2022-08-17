package ders44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_Linkedlist_ListDataTuru {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList();
        Queue<String> ll3 = new LinkedList();
        List<String> ll2 = new LinkedList();
        Deque<String> ll4 = new LinkedList();

        ll2.add("berk");
        ll2.add("done");
        ll2.add("enes");
        ll2.add("ayse");
        System.out.println(ll2);
        System.out.println(ll2.remove(3));//ayse
/*
eger listemiz integer elementlerdem olusuyorsa
direk sayi yazarsak indext olarak kabul eder
ama bir variableye atama yapar
ve remowde o vaiablenin ismini yazarsak o zaman obje olarak bakul
eder
 */
        System.out.println(ll2.remove("kemal"));//false
        System.out.println(ll2.isEmpty());//false
        ll2.set(1, "serap");
        System.out.println(ll2);//[berk, serap, enes]
        ll1.add("berk");
        ll1.add("ismail");
        System.out.println(ll1);//[berk, ismail]
        ll2.retainAll(ll1);//ll2 deki tum elemanlari ll1 ile karsilastirir
        //ll1 de olmayanlari siler
        System.out.println(ll2);//[berk]
        System.out.println(ll2.hashCode());//3020251
        ll2.add("fatih");
        System.out.println(ll2.hashCode());//190831485







    }
}
