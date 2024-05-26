package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;

// Importing conversion class
import static com.pluralsight.Converter.*;


public class GourmetDeli {

    // creating static scanner to access at all times
    public static final Scanner myScanner = new Scanner(System.in);
    public static final String RED = "\u001B[31m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    public static void main(String[] args) {

        // While loop for the home screen
        boolean home = true;
        while (home) {
            System.out.println(BRIGHT_WHITE + "\n\n\nWelcome to The Gourmet Deli\n\n");
            System.out.println("To begin, select an option: ");
            System.out.println("1) New Order");
            System.out.println("X) Exit");
            String homeInput = myScanner.nextLine();

            switch (homeInput) {
                case "1":
                    // while loop for the New order screen
                    boolean newOrder = true;
                    while (newOrder) {
                        System.out.println(BRIGHT_WHITE + "\n\nCreate A New Order: ");
                        System.out.println("        1) Add Sandwich\n        2) Add Drink        \n        3) Add Chips\n        4) Checkout");
                        System.out.println("0) Cancel Order");
                        String orderScreenInput = myScanner.nextLine();

                        switch (orderScreenInput) {

                            case "1":
                                // while loop to exit adding a sandwich
                                boolean addSandwich = true;


                                ArrayList<String> standardToppings = new ArrayList();
                                ArrayList<String> premiumToppings = new ArrayList();
                                ArrayList<String> condiments = new ArrayList();
                                Sandwich userSandwich = new SandwichBuilder("null", "null", "null", false, "null", false, false, standardToppings, premiumToppings, condiments, 0);

                                while (addSandwich) {
                                    System.out.println(BRIGHT_WHITE + "Add A Sandwich\n\n\n");

                                    boolean sizeSandwichScreen = true;

                                    while (sizeSandwichScreen) {
                                        System.out.println(BRIGHT_WHITE + "Select a Sandwich Size\n1) 4in\n" +
                                                "2) 8in\n3) 12in");
                                        String userSizeSandwich = myScanner.nextLine();
                                        userSizeSandwich.toLowerCase();
                                        convertIntToSize(userSizeSandwich);
                                        if (convertIntToSize(userSizeSandwich).equals("Size not recognized")) {
                                            System.out.println(RED + "\nSize Not Recognized. Please Try Again\n");
                                            sizeSandwichScreen = true;
                                        } else {
                                            userSandwich.setSizeSandwich(convertIntToSize(userSizeSandwich));
                                            sizeSandwichScreen = false;
                                        }
                                    }
                                    boolean breadTypeScreen = true;

                                    while (breadTypeScreen) {
                                        System.out.println(BRIGHT_WHITE + "Bread Type: \n1) White\n2) Wheat\n3) Rye\n4) Wrap");
                                        String userBreadType = myScanner.nextLine();
                                        userBreadType.toLowerCase();
                                        convertIntToBread(userBreadType);
                                        if (convertIntToSize(userBreadType).equals("Bread not recognized")) {
                                            System.out.println(RED + "\nBread Not Recognized. Please Try Again\n");
                                            breadTypeScreen = true;
                                        } else {
                                            userSandwich.setBreadType(convertIntToBread(userBreadType));
                                            breadTypeScreen = false;
                                        }
                                    }

                                    boolean meatTypeScreen = true;
                                    boolean extraProteinScreen = false;

                                    while (meatTypeScreen) {
                                        System.out.println(BRIGHT_WHITE + "Meat Type: \n1) Steak\n2) Ham\n3) Salami\n4) Roast Beef");
                                        System.out.println("5) Chicken\n6) Bacon \n7) Continue");
                                        String userMeatType = myScanner.nextLine();
                                        userMeatType.toLowerCase();
                                        convertIntToMeatType(userMeatType);
                                        if (convertIntToMeatType(userMeatType).equals("Meat not recognized")) {
                                            System.out.println(RED + "Meat not recognized. Please Try Again");
                                            meatTypeScreen = true;

                                        } else if (convertIntToMeatType(userMeatType).equals("No meat")) {
                                            extraProteinScreen = false;
                                            meatTypeScreen = false;
                                        } else {
                                            userSandwich.setMeatType(convertIntToMeatType(userMeatType));
                                            extraProteinScreen = true;
                                            meatTypeScreen = false;
                                        }
                                    }

                                    while (extraProteinScreen) {
                                        System.out.println(BRIGHT_WHITE + "Would you like extra protein? Y/N (additional cost)");
                                        String userExtraMeat = myScanner.nextLine();
                                        userExtraMeat.toLowerCase();
                                        convertValueToBool(userExtraMeat);


                                        if (userExtraMeat.contentEquals("y") || (userExtraMeat.contentEquals("Y") || (userExtraMeat.contentEquals("n") || (userExtraMeat.contentEquals("N"))))) {

                                            if (convertValueToBool(userExtraMeat) == true) {

                                                userSandwich.setExtraMeat(true);
                                                extraProteinScreen = false;
                                            } else {
                                                extraProteinScreen = false;
                                            }
                                        } else {
                                            System.out.println(RED + "Value not recognized. Please try again.\n");
                                        }
                                    }
                                    boolean cheeseTypeScreen = true;
                                    boolean extraCheeseScreen = false;

                                    while (cheeseTypeScreen) {
                                        System.out.println(BRIGHT_WHITE + "Cheese Type: \n1) American\n2) Provolone\n3) Cheddar\n4) Swiss\n5) Continue");
                                        String userCheeseType = myScanner.nextLine();
                                        userCheeseType.toLowerCase();
                                        convertIntToCheeseType(userCheeseType);
                                        if (convertIntToCheeseType(userCheeseType).equals("Cheese not recognized")) {
                                            System.out.println(RED + "Cheese not recognized");
                                            cheeseTypeScreen = true;

                                        } else if (convertIntToCheeseType(userCheeseType).equals("No cheese")) {

                                            extraCheeseScreen = false;

                                        } else {
                                            userSandwich.setCheeseType(convertIntToCheeseType(userCheeseType));
                                            cheeseTypeScreen = false;
                                            extraCheeseScreen = true;
                                        }

                                        while (extraCheeseScreen) {

                                            System.out.println(BRIGHT_WHITE + "Would you like extra cheese? Y/N (additional cost)");
                                            String userExtraCheese = myScanner.nextLine();
                                            userExtraCheese.toLowerCase();
                                            convertValueToBool(userExtraCheese);

                                            if (userExtraCheese.contentEquals("y") || (userExtraCheese.contentEquals("Y") || (userExtraCheese.contentEquals("n") || (userExtraCheese.contentEquals("N"))))) {

                                                if (convertValueToBool(userExtraCheese) == true) {

                                                    userSandwich.setExtraCheese(true);
                                                    extraCheeseScreen = false;
                                                } else {
                                                    extraCheeseScreen = false;
                                                }
                                            } else {
                                                System.out.println(RED + "Value not recognized. Please try again.\n");
                                            }
                                        }
                                        boolean addToppings = true;

                                        while (addToppings) {

                                            System.out.println(BRIGHT_WHITE + "Add Toppings: \n1) Lettuce 2) Peppers 3) Onions 4) Tomatoes\n"
                                                    + "5) Jalapenos 6) Cucumbers 7) Pickles 8) Guacamole 9) Mushrooms 0) Continue");
                                            String userToppings = myScanner.nextLine();

                                            if (userToppings.equals("0")) {
                                                addToppings = false;
                                            } else if (userToppings.equals("1") || (userToppings.equalsIgnoreCase("Lettuce"))) {
                                                standardToppings.add("Lettuce");
                                                addToppings = true;

                                            } else if (userToppings.equals("2") || (userToppings.equalsIgnoreCase("Peppers"))) {
                                                standardToppings.add("Peppers");
                                                addToppings = true;

                                            } else if (userToppings.equals("3") || (userToppings.equalsIgnoreCase("Onions"))) {
                                                standardToppings.add("Onions");
                                                addToppings = true;

                                            } else if (userToppings.equals("4") || (userToppings.equalsIgnoreCase("Tomatoes"))) {
                                                standardToppings.add("Tomatoes");
                                                addToppings = true;

                                            } else if (userToppings.equals("5") || (userToppings.equalsIgnoreCase("Jalapenos"))) {
                                                standardToppings.add("Jalapenos");
                                                addToppings = true;

                                            } else if (userToppings.equals("6") || (userToppings.equalsIgnoreCase("Cucumbers"))) {

                                                addToppings = true;

                                            } else if (userToppings.equals("7") || (userToppings.equalsIgnoreCase("Pickles"))) {
                                                standardToppings.add("Pickles");
                                                addToppings = true;

                                            } else if (userToppings.equals("8") || (userToppings.equalsIgnoreCase("Guacamole"))) {
                                                standardToppings.add("Guacamole");
                                                addToppings = true;

                                            } else if (userToppings.equals("9") || (userToppings.equalsIgnoreCase("Mushrooms"))) {
                                                standardToppings.add("Mushrooms");
                                                addToppings = true;

                                            } else {
                                                System.out.println(RED + "Topping not recognized. Please try again.");
                                            }
                                        }
                                        boolean addCondiments = true;

                                        while (addCondiments) {

                                            System.out.println(BRIGHT_WHITE + "Add Condiments: \n1) Mayo 2) Mustard 3) Ketchup\n" +
                                                    "4) Ranch 5) Vinaigrette 6) Thousand Islands 0) Continue");
                                            String userCondiments = myScanner.nextLine();

                                            if (userCondiments.equals("0")) {
                                                addCondiments = false;
                                            } else if (userCondiments.equalsIgnoreCase("1") || (userCondiments.equalsIgnoreCase("Mayo"))) {
                                                condiments.add("Mayo");
                                                addCondiments = true;
                                            } else if (userCondiments.equalsIgnoreCase("2") || (userCondiments.equalsIgnoreCase("Mustard"))) {
                                                condiments.add("Mustard");
                                                addCondiments = true;
                                            } else if (userCondiments.equalsIgnoreCase("3") || (userCondiments.equalsIgnoreCase("Ketchup"))) {
                                                condiments.add("Ketchup");
                                                addCondiments = true;
                                            } else if (userCondiments.equalsIgnoreCase("4") || (userCondiments.equalsIgnoreCase("Ranch"))) {
                                                condiments.add("Ranch");
                                                addCondiments = true;
                                            } else if (userCondiments.equalsIgnoreCase("5") || (userCondiments.equalsIgnoreCase("Vinaigrette"))) {
                                                condiments.add("Vinaigrette");
                                                addCondiments = true;
                                            } else if (userCondiments.equalsIgnoreCase("6") || (userCondiments.equalsIgnoreCase("Thousand Island"))) {
                                                condiments.add("Thousand Island");
                                                addCondiments = true;
                                            } else {
                                                System.out.println(RED + "Condiment not recognized. Please try again.");
                                            }

                                        }
                                        boolean tosatedOrNot = true;
                                        while (tosatedOrNot) {
                                            System.out.println(BRIGHT_WHITE + "Would you like it toasted? (Y/N)");
                                            String userToastSandwich = myScanner.nextLine();
                                            convertValueToBool(userToastSandwich);

                                            if (userToastSandwich.contentEquals("y") || (userToastSandwich.contentEquals("Y") || (userToastSandwich.contentEquals("n") || (userToastSandwich.contentEquals("N"))))) {

                                                if (convertValueToBool(userToastSandwich) == true) {

                                                    userSandwich.setToasted(true);
                                                    tosatedOrNot = false;
                                                } else {
                                                    tosatedOrNot = false;
                                                }
                                            } else {
                                                System.out.println(RED + "Value not recognized. Please try again.\n");
                                            }

                                        }


                                    }
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