package practice6;

import java.util.Arrays;

public class Q06_Arrays {

    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */

    public static void main(String[] args) {

        String str="heySiri";
        str=str.replace("hey","bye");
        String[] array=new String[1];

array[0]=str;
        System.out.println(Arrays.toString(array));















    }
}
