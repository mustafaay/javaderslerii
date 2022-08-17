package ders12;

public class C01_Replace {

    public static void main(String[] args) {


        String str="   bug  un ha  va    cok    guz   el";

        System.out.println(str.replace(" ",""));


//hava kelimesini java yapalim

        System.out.println(str.replace("h","j").replace(" ",""));


//guzel yerine harika yapalim

        System.out.println(str.replace(" guz   el","harika"));

//cumleyi replace kulanarak bugun java cok guzel yazalim

        System.out.println(str.replace("   bug  un ha  va    cok    guz   el","bugun java cok guzel"));






    }
}
