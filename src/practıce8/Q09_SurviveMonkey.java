package practıce8;

public class Q09_SurviveMonkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/


    public static void main(String[] args) {

        int numberOfBananas = 165, survivalDays = 0;
        boolean monkeyAlive = true;
        System.out.println("maymunun hayata kalabilmesi icin gunde 4 tane muz yemesi lazim");
        do {

            System.out.println("maymin 4 tane muz yer");

            numberOfBananas -= 4;
            survivalDays++;
            if (numberOfBananas < 4) {

                monkeyAlive = false;
                System.out.println("maymun  " + survivalDays + " gun hayata kaldi ");


            }



            else {

                System.out.println("bugun "+survivalDays+" gun  oldu ve hala maymun yasiyor");

            }



        } while (monkeyAlive);

        System.out.println("toplam yasadigi gun sayisi  "+survivalDays);

    }
}
