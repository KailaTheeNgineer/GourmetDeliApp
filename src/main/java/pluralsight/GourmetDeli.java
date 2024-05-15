package pluralsight;

import java.util.Scanner;

public class GourmetDeli {

    // creating static scanner to access at all times
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // While loop for the home screen
        boolean home = true;
        while (home) {
            System.out.println("\n\n\nWelcome to The Gourmet Deli\n\n");
            System.out.println("To begin, select an option: ");
            System.out.println("1) New Order");
            System.out.println("X) Exit");
            String homeInput = myScanner.nextLine();

            switch (homeInput) {
                case "1":
                    break;
                case "x", "X":
                    home = false;
                    break;
                default:
                    System.out.println("Select a Valid Option");



            }








        }




    }
}
