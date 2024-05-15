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
                    // while loop for the New order screen
                    boolean newOrder = true;
                    while (newOrder) {
                        System.out.println("\n\nCreate A New Order: ");
                        System.out.println("        1) Add Sandwich\n        2) Add Drink        \n        3) Add Chips\n        4) Checkout");
                        System.out.println("0) Cancel Order/Back Home");
                        String orderScreenInput = myScanner.nextLine();

                        switch  (orderScreenInput) {

                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                break;

                            case "0":
                                newOrder = false;
                                break;
                            default:
                                System.out.println("Please Enter a Valid Option");


                        }








                    }
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
