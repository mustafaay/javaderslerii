package ders11;

public class C02_IastIndexof {

    public static void main(String[] args) {

        String  cumle ="java cok kolay , java cok guzel";
        String kelime="java";
         //verilen kelimenin  asagidaki sartlardan uygun olani yazan bir program yaziniz

        //verilen kelime cumlede kulanilmamis
        //verilen kelie  cimlede 1 kez kulanilmis
        //verilen kelimr cumlede birden fazla kulanilmis



        int ilkindek=cumle.indexOf(kelime);
        int sonindex=cumle.lastIndexOf(kelime);

        if (ilkindek==-1||sonindex==-1){
            System.out.println("cumlede bu kelime kulanilmamis");
        }
else if (ilkindek==sonindex){

            System.out.println("cumlede 1 kere kulanilmis");
        }

else {
            System.out.println("birden fazla kere kulanilmis");
        }























    }
}
