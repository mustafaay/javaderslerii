package ders17;

public class C07WhileLoop {

    public static void main(String[] args) {

        /* 20 den 50 ye kadar cift sayilari yazdiralim
        */
int bas=20;
int bitis=50;
        for (int i = bas; i <=bitis ; i++) {

            if(i%2==0){
                System.out.println(i);
            }

        }
        System.out.println("   ");
int tem=bas;

while (tem<=bitis){


    if(tem%2==0){
        System.out.println(tem);

    }
    tem++;

}













    }
}
