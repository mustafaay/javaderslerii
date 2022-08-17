package ders13;

public class C04_MetodCreation {

    public static void main(String[] args) {

       //input olarak verilen 2 intigeri toplayip sonucu yazdiran metod olusturun

int input1=10;
int input2=20;


    }
    //metod 4 adimda olusturulur
    //1.adim metod call
    //argument eklenmesi gerekiyorsa ekliyelim
    //eegr metodhun retrun type voiden farkli olacaksa bir veriable olusturup method call'u assin edelim


  public static void   topla(int input1, int input2) {

        //3.adim method deklerasyonunda degistirilmesi gereken
        //bolumleri degistirir(access modifier , retrun type vb...)
        //4.eger retrune type void disinda birseyse retrune keyword ...'u ve donecek degeri hesplamaliyiz

      System.out.println(
              "girilen 2 sayinin toplami "+(input1+input2)
      );
  }






}
