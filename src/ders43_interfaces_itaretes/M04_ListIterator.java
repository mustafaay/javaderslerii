package ders43_interfaces_itaretes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {

    public static void main(String[] args) {


        /*
        listIterator iterator interfacesi'nin child interfacesidir
        ama daha cok methoda sahiptir

         */
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator li1=list.listIterator();

    Integer temp=0;

while (li1.hasNext()) {

 temp=(Integer) li1.next()+3;

    li1.set(temp);

}
        System.out.println(list);






    }
}
