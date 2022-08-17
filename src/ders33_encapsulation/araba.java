package ders33_encapsulation;

public class araba {


        String marka="marka belirtilmedi";
       private String model="model belirtilmedi";
       private String yakit="elektirikli";//tum arabalar elektiirikli isie bu variablenein degistirilmemesi lazim


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
