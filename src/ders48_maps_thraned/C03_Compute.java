package ders48_maps_thraned;

import java.util.HashMap;
import java.util.Map;

public class C03_Compute {

    public static void main(String[] args) {

        Map<String,Integer> harfmapi=new HashMap<String,Integer>();
harfmapi.put("a",5);
harfmapi.put("b",1);
harfmapi.put("c",2);
harfmapi.put("d",4);
harfmapi.put("e",4);
        System.out.println(harfmapi);
harfmapi.compute("a",(k,v) ->v*2);
harfmapi.compute("d",(k,v) ->v*v);
harfmapi.computeIfAbsent("c",(v)->30);
        harfmapi.computeIfAbsent("f",(v)->30);
harfmapi.computeIfPresent("e",(k,v)->v+5);

        harfmapi.computeIfPresent("g",(k,v)->v*100);







        System.out.println(harfmapi);
    }
}
