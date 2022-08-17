package practice9.restorant;

public class mutfak {

public  String yemekler="adana kebabp , urfaciger , kusbasi , kusleme ";
public String arasicak="yalacorbasi, mercimekcorbsasi,duguncorbasi,corba";
public String tatlilar="baklava , sutlac , gullac, kazandibi , kunefe";
public String icecekler="ayran, kola ,salgam";

    public mutfak(String yemekler, String arasicak, String tatlilar, String icecekler) {


this.yemekler=yemekler;
this.arasicak=arasicak;
this.tatlilar=tatlilar;
this.icecekler=icecekler;





    }

    public mutfak() {

    }


    @Override
    public String toString() {
        return "mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \narasicak='" + arasicak + '\'' +
                ",\n tatlilar='" + tatlilar + '\'' +
                ",\n icecekler='" + icecekler + '\'' +
                '}';
    }
}
