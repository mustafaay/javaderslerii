package ders11;

public class C01_IndexOf {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        //verilen bir Stringte herhangi bir String veya charin ilk
        //kulanildigi index i bize dondurur

        System.out.println(str.indexOf("j"));//bu harf olmadigi icin bize -1 yezar
        //olmayan tum harflar icin -1 dondururu

        System.out.println(str.indexOf("mek"));//blok oarak dusunuzr ve ilk haefin index ini verir


        // biz eger istersek istedigimiz indexten sonra
        //arama yapmasini sagliya biliriz
        System.out.println(str.indexOf("g", 7));//bu bize 18 verir
//yazdigimiz indexten baslar yani
//  System.out.println(str.indexOf("g",6));  boyle yaparsam 6 yi dahil eder ve arama yapar


        //gormediginiz bie String te 2. ve 3. e nin intiger larini yazdirin

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);


        //eger 2. e varsa 3. e nin olup olmadigini
        //ve varsa indexsini yaziniz

        if (ikincie == -1) {

            System.out.println("ikinci e yok");

        }
        else {
            int ucuncue = str.indexOf("e", ikincie + 1);


            if (ucuncue == -1) {
                System.out.println("ucuncu e yok");
            } else {

                System.out.println("verilen strdaki 3. enin index i =   " + ucuncue);


            }

        }


    }
}
