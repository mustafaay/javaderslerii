package ders37_owerloding;

public class FSupra extends EToyota{

@Override
    void yakit(){

        System.out.println("supra benzin kulanir");
/*
private methodlar evverride edilemez
eger childd classda paarent classtaki private method ile signaturde
bir method olusturursak bu overridding olmaz
 */

    }

void  motor(){
    System.out.println("Sırali 6 silindir 2JZ kullanır hocam");
}

    @Override
    void marka() {
        /*
        override notasyonu javaya bir gorev veriri
        birbirine bagli olan iki methodu surekli kontrol eder
        eger parent classtaki overriden methodu silerseniz cte verir


        @Override notasyonu kulanmak mecburi degildir
        eger overriden method silinirse kodun cte vermesini istersek bunu kulanmaliyiz

         */
    }
}
