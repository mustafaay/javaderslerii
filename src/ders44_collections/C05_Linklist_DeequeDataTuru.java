package ders44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_Linklist_DeequeDataTuru {

    public static void main(String[] args) {
        Deque<String> ll4 = new LinkedList();
        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("tefik");
        ll4.add("selim");
        ll4.removeLastOccurrence("selim");
        System.out.println(ll4);//[cavidan, mesut, selim, tefik]
        System.out.println(ll4.pop());//cavidan
//pop : linkedlist'in basindaki elementi silip bize dondurur

/*
deque iki tarafli queue demektir dolayisiyla
her methodun first ve lasti var

 */





    }
}
