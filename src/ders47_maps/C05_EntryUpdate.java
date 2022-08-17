package ders47_maps;

import ders46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {

    public static void main(String[] args) {
        //soy ismi can olanlarin bransini datascine yapalim
        Map<Integer, String> siniflistmap = ReusableMethods.mapolustur();
        //entrleri alalim
        Set<Map.Entry<Integer, String>> entryseti = siniflistmap.entrySet();
        String entrvalue;
        String[] enrtarrr;

        for (Map.Entry<Integer, String> e : entryseti) {

            entrvalue = e.getValue();
            enrtarrr = entrvalue.split(",");
            if (enrtarrr[1].equals(" can ")) {

                enrtarrr[2] = "datasinece";
                e.setValue(enrtarrr[0] + "  ,  " + enrtarrr[1] + "  ,  " + enrtarrr[2]);

            }


        }


        System.out.println(siniflistmap);


    }
}
