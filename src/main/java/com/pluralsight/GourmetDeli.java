package com.pluralsight;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;

public class GourmetDeli {

    // creating static scanner to access at all times
    public static final Scanner myScanner = new Scanner(System.in);
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[97m";

    public static void main(String[] args) {

        // While loop for the home screen
        boolean home = true;
        while (home) {
            System.out.println(WHITE + "\n\n\nWelcome to The Gourmet Deli\n\n");
            System.out.println("To begin, select an option: ");
            System.out.println("1) New Order");
            System.out.println("X) Exit");
            String homeInput = myScanner.nextLine();

            switch (homeInput) {
                case "1":
                    // while loop for the New order screen
                    boolean newOrder = true;
                    while (newOrder) {
                        System.out.println(WHITE + "\n\nCreate A New Order: ");
                        System.out.println("        1) Add Sandwich\n        2) Add Drink        \n        3) Add Chips\n        4) Checkout");
                        System.out.println("0) Cancel Order");
                        String orderScreenInput = myScanner.nextLine();

                        switch  (orderScreenInput) {

                            case "1":
                                // while loop to exit adding a sandwich
                                boolean addSandwich = true;

                                while(addSandwich) {
                                    System.out.println(WHITE + "Add A Sandwich\n\n\n");
                                    System.out.println("Select a Sandwich Size\n1) 4in\n" +
                                            "2) 8in\n3) 12in");
                                    String userSizeSandwich = myScanner.nextLine();
                                    System.out.println("Bread Type: \n1) White\n2) Wheat\n3) Rye\n4) Wrap");
                                    String userBreadType = myScanner.nextLine();
                                    System.out.println("Meat Type: \n1) Steak\n2) Ham\n3) Salami\n4) Roast Beef");
                                    System.out.println("5) Chicken\n6) Bacon \n7) Continue");
                                    String userMeatType = myScanner.nextLine();
                                    System.out.println("Would you like extra protein? Y/N (additional cost)");
                                    String userExtra1Meat = myScanner.nextLine();
                                    boolean userExtraMeat = Boolean.getBoolean(userExtra1Meat);
                                    System.out.println("Cheese Type: \n1) American\n2) Provolone\n3) Cheddar\n4) Swiss\n5) Continue");
                                    String userCheeseType = myScanner.nextLine();
                                    System.out.println("Would you like extra cheese? Y/N (additional cost)");
                                    String user1ExtraCheese = myScanner.nextLine();
                                    boolean userExtraCheese = Boolean.getBoolean(user1ExtraCheese);

                                    boolean addToppings = true;

                                    while (addToppings) {

                                        System.out.println("Add Toppings: \n1) Lettuce 2) Peppers 3) Onions 4) Tomatoes\n"
                                                + "5) Jalapenos 6) Cucumbers 7) Pickles 8) Guacamole 9) Mushrooms 0) Continue");
                                        String userToppings = myScanner.nextLine();

                                        if (userToppings.equals("0")) {
                                            addToppings = false;
                                        }
                                    }
                                        boolean addCondiments = true;

                                        while (addCondiments) {

                                            System.out.println("Add Condiments: \n1) Mayo 2) Mustard 3) Ketchup\n" +
                                                    "4) Ranch 5) Vinaigrette 6) Thousand Islands 0) Continue");
                                            String userCondiments = myScanner.nextLine();

                                            if (userCondiments.equals("0")) {
                                                addCondiments = false;
                                            }

                                        }

                                        System.out.println("Would you like it toasted? (Y/N)");
                                        String userToast1Sandwich = myScanner.nextLine();
                                        boolean userToastSandwich = Boolean.getBoolean(userToast1Sandwich);


                                     //Parse the size sandwich into a string holding the size sandwich
                                    // Sandwich userSandiwch = new SandwichBuilder(userSizeSandwich);

                                    }






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
                                System.out.println(RED + "\n\nNot A Valid Option");


                        }








                    }
                    break;
                case "x", "X":
                    home = false;
                    break;
                default:
                    System.out.println(RED + "\n\nNot A Valid Option");




            }


        }




    }
}