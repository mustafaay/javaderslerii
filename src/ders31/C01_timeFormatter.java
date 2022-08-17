package ders31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_timeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihvesaat=LocalDateTime.now();

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss ");

        System.out.println(dtf.format(tarihvesaat));


        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMMM/yyyy  HH:mm:ss ");

        System.out.println(dtf2.format(tarihvesaat));






    }
}
