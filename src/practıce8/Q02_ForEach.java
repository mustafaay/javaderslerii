package practıce8;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop

    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};
        for (String a : list) {
            System.out.println(a + "  ,  "+"uzunlugu =  " + a.length() + "  ");


        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        for (String a : list) {

            if (a.startsWith("v")) {

                break;

            }
            System.out.println(a);
        }


    }
}
