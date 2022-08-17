package ders32;

public class C02_Append {

    public static void main(String[] args) {


       StringBuilder sb=new StringBuilder("java daha ne yapsin");
        sb.append("?");

        System.out.println(sb);


/*
appand istedigimiz Stingi en sona ekler
 */
sb.insert(4," her seyi dusunmus , ");
/*
araya ekleme yapmaknistedigimizde append degil insert yapmaliyiz
 */;





    }
}
