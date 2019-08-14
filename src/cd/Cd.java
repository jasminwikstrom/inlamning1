package cd;

import java.util.Scanner;

public class Cd {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//Ber om antal skivor

        System.out.print(" Number of Cds: ");

        int numberOfCds = input.nextInt();
//Sätter upp regel kring lägsta antal skivor
        if (numberOfCds < 0) {
            System.out.println("Incorrect value");
        } else {
            System.out.println("You bought " + numberOfCds + " CDs");
        }
//Regler kring bonusen
        if (numberOfCds == 0) {
            System.out.println("You didn't earn any points this month");
        } else if (numberOfCds == 1) {
            System.out.println("You earnd 5 points this month");
        } else if (numberOfCds == 2) {
            System.out.println("You earnd 15 points this month");
        } else if (numberOfCds == 3) {
            System.out.println("You earnd 30 points this month");
        } else if (numberOfCds >= 4) {
            System.out.println("You earnd 60 points this month");
        }
    }
}