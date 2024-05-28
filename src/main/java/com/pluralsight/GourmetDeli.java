package com.pluralsight;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

// Importing conversion class
import static com.pluralsight.Converter.*;


public class GourmetDeli {

    // creating static scanner to access at all times
    public static final Scanner myScanner = new Scanner(System.in);

    // creating static colors for aesthetic purposes
    public static final String RED = "\u001B[31m";
    public static final String BRIGHT_WHITE = "\u001B[97m";
    public static final String BRIGHT_GREEN = "\u001B[92m";

    public static void main(String[] args) throws IOException {

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

                    String directoryPath = "src/main/resources/receipts";
                    LocalDateTime receiptDate = LocalDateTime.now();


                    // while loop for the New order screen
                    boolean newOrder = true;
                    while (newOrder) {


                        File receipt = new File(directoryPath + receiptDate);


                        try {
                            receipt.createNewFile();
                            FileWriter receiptWriter = new FileWriter(receipt, true);


                            System.out.println(BRIGHT_WHITE + "\n\nCreate A New Order: ");
                            System.out.println("        1) Add Sandwich\n        2) Add Drink        \n        3) Add Chips\n        4) Checkout");
                            System.out.println("0) Cancel Order");
                            String orderScreenInput = myScanner.nextLine();

                            ArrayList<String> standardToppings = new ArrayList();
                            ArrayList<String> condiments = new ArrayList();
                            ArrayList<Sandwich> userOrder = new ArrayList<>();
                            ArrayList<Chips> chipsOrder = new ArrayList<>();
                            ArrayList<Drink> drinksOrder = new ArrayList<>();


                            switch (orderScreenInput) {

                                case "1":
                                    // while loop to exit adding a sandwich
                                    boolean addSandwich = true;


                                    Sandwich userSandwich = new SandwichBuilder("null", "null", "null", false, "null", false, false, standardToppings, condiments, 0);

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
                                                receiptWriter.write("..... " + convertIntToSize(userSizeSandwich) + " .....\n");

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
                                                receiptWriter.write(convertIntToBread(userBreadType) + "... +$" + userSandwich.getBreadTotal(userSandwich.getSizeSandwich()) + "\n");

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
                                                receiptWriter.write(convertIntToMeatType(userMeatType) + "... +$" + userSandwich.getMeatTotal(userSandwich.getSizeSandwich())+ "\n");

                                                meatTypeScreen = false;
                                            } else {
                                                userSandwich.setMeatType(convertIntToMeatType(userMeatType));
                                                receiptWriter.write(convertIntToMeatType(userMeatType) + "... +$" + userSandwich.getMeatTotal(userSandwich.getSizeSandwich())+ "\n");

                                                extraProteinScreen = true;
                                                meatTypeScreen = false;
                                            }
                                        }

                                        while (extraProteinScreen) {
                                            System.out.println(BRIGHT_WHITE + "Would you like extra protein? Y/N (additional cost)");
                                            String userExtraMeat = myScanner.nextLine();
                                            userExtraMeat.toLowerCase();
                                            convertValueToBool(userExtraMeat);


                                            if (userExtraMeat.contains("y") || (userExtraMeat.contains("Y"))) {

                                                userSandwich.setExtraMeat(true);

                                                receiptWriter.write("Extra Meat: " + "... +$" + userSandwich.getExtraMeatTotal(userSandwich.getSizeSandwich())+ "\n");

                                                extraProteinScreen = false;
                                            } else if (userExtraMeat.contains("n") || (userExtraMeat.contains("N"))) {
                                                extraProteinScreen = false;
                                                  } else {
                                                System.out.println(RED + "Value not recognized. Please try again.\n");

                                            }
                                        }
                                        boolean cheeseTypeScreen = true;
                                        boolean extraCheeseScreen = false;
                                        boolean addToppings = true;

                                        while (cheeseTypeScreen) {
                                            System.out.println(BRIGHT_WHITE + "Cheese Type: \n1) American\n2) Provolone\n3) Cheddar\n4) Swiss\n5) Continue");
                                            String userCheeseType = myScanner.nextLine();
                                            userCheeseType.toLowerCase();
                                            convertIntToCheeseType(userCheeseType);
                                            if (convertIntToCheeseType(userCheeseType).equals("Cheese not recognized")) {
                                                System.out.println(RED + "Cheese not recognized. Please Try Again\n");
                                                cheeseTypeScreen = true;


                                            } else if (convertIntToCheeseType(userCheeseType).equals("No cheese")) {
                                                extraCheeseScreen = false;
                                                receiptWriter.write(convertIntToMeatType(userCheeseType) + "... +$" + userSandwich.getCheeseTotal(userSandwich.getSizeSandwich()) + "\n");
                                                cheeseTypeScreen = false;

                                            } else {
                                                userSandwich.setMeatType(convertIntToCheeseType(userCheeseType));
                                                receiptWriter.write(convertIntToCheeseType(userCheeseType) + "... +$" + userSandwich.getCheeseTotal(userSandwich.getSizeSandwich()) + "\n");

                                                extraCheeseScreen = true;
                                                cheeseTypeScreen = false;

                                            }
                                        }

                                            while (extraCheeseScreen) {

                                                System.out.println(BRIGHT_WHITE + "Would you like extra cheese? Y/N (additional cost)");
                                                String userExtraCheese = myScanner.nextLine();
                                                userExtraCheese.toLowerCase();
                                                convertValueToBool(userExtraCheese);

                                                if (userExtraCheese.contains("y") || (userExtraCheese.contains("Y"))) {

                                                    userSandwich.setExtraMeat(true);
                                                    receiptWriter.write("Extra Cheese: " + "... +$" + userSandwich.getExtraCheeseTotal(userSandwich.getSizeSandwich())+ "\n");

                                                    extraCheeseScreen = false;
                                                } else if (userExtraCheese.contains("n") || (userExtraCheese.contains("N"))) {
                                                    extraCheeseScreen = false;
                                                } else {
                                                    System.out.println(RED + "Value not recognized. Please try again.\n");

                                                }


                                            while (addToppings) {

                                                System.out.println(BRIGHT_WHITE + "Add Toppings: \n1) Lettuce 2) Peppers 3) Onions 4) Tomatoes\n"
                                                        + "5) Jalapenos 6) Cucumbers 7) Pickles 8) Guacamole 9) Mushrooms 0) Continue");
                                                String userToppings = myScanner.nextLine();

                                                if (userToppings.equals("0")) {
                                                    addToppings = false;
                                                } else if (userToppings.equals("1") || (userToppings.equalsIgnoreCase("Lettuce"))) {
                                                    standardToppings.add("Lettuce");
                                                    receiptWriter.write("     Lettuce\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("2") || (userToppings.equalsIgnoreCase("Peppers"))) {
                                                    standardToppings.add("Peppers");
                                                    receiptWriter.write("     Peppers\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("3") || (userToppings.equalsIgnoreCase("Onions"))) {
                                                    standardToppings.add("Onions");
                                                    receiptWriter.write("     Onions\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("4") || (userToppings.equalsIgnoreCase("Tomatoes"))) {
                                                    standardToppings.add("Tomatoes");
                                                    receiptWriter.write("     Tomatoes\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("5") || (userToppings.equalsIgnoreCase("Jalapenos"))) {
                                                    standardToppings.add("Jalapenos");
                                                    receiptWriter.write("     Jalapenos\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("6") || (userToppings.equalsIgnoreCase("Cucumbers"))) {
                                                    standardToppings.add("Cucumbers");
                                                    receiptWriter.write("     Cucumbers\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("7") || (userToppings.equalsIgnoreCase("Pickles"))) {
                                                    standardToppings.add("Pickles");
                                                    receiptWriter.write("     Pickles\n");

                                                    addToppings = true;

                                                } else if (userToppings.equals("8") || (userToppings.equalsIgnoreCase("Guacamole"))) {
                                                    standardToppings.add("Guacamole");
                                                    receiptWriter.write("     Guacamole");

                                                    addToppings = true;

                                                } else if (userToppings.equals("9") || (userToppings.equalsIgnoreCase("Mushrooms"))) {
                                                    standardToppings.add("Mushrooms");
                                                    receiptWriter.write("     Mushrooms\n");

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
                                                    receiptWriter.write("     Mayo\n");

                                                    addCondiments = true;
                                                } else if (userCondiments.equalsIgnoreCase("2") || (userCondiments.equalsIgnoreCase("Mustard"))) {
                                                    condiments.add("Mustard");
                                                    receiptWriter.write("     Mustard\n");

                                                    addCondiments = true;
                                                } else if (userCondiments.equalsIgnoreCase("3") || (userCondiments.equalsIgnoreCase("Ketchup"))) {
                                                    condiments.add("Ketchup");
                                                    receiptWriter.write("     Ketchup\n");

                                                    addCondiments = true;
                                                } else if (userCondiments.equalsIgnoreCase("4") || (userCondiments.equalsIgnoreCase("Ranch"))) {
                                                    condiments.add("Ranch");
                                                    receiptWriter.write("     Ranch\n");

                                                    addCondiments = true;
                                                } else if (userCondiments.equalsIgnoreCase("5") || (userCondiments.equalsIgnoreCase("Vinaigrette"))) {
                                                    condiments.add("Vinaigrette");
                                                    receiptWriter.write("     Vinaigrette\n");

                                                    addCondiments = true;
                                                } else if (userCondiments.equalsIgnoreCase("6") || (userCondiments.equalsIgnoreCase("Thousand Island"))) {
                                                    condiments.add("Thousand Island");
                                                    receiptWriter.write("     Thousand Island\n");
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

                                                if (userToastSandwich.contains("y") || (userToastSandwich.contains("Y"))) {
                                                    userSandwich.setExtraMeat(true);
                                                    receiptWriter.write("\033[3mToasted\033[0m");

                                                    tosatedOrNot = false;
                                                } else if (userToastSandwich.contains("n") || (userToastSandwich.contains("N"))) {
                                                    tosatedOrNot = false;
                                                } else {
                                                    System.out.println(RED + "Value not recognized. Please try again.\n");

                                                }
                                                // Adding sandwich to their order arrayList
                                                userOrder.add(userSandwich);

                                                double finalCost = addTotal(userSandwich);
                                                userSandwich.setTotal(finalCost);
                                                receiptWriter.write("\n......" + userSandwich.getTotal());

                                                System.out.println(BRIGHT_GREEN + "\nSandwich Added Successfully\n");
                                                addSandwich = false;

                                            }


                                        }
                                    }

                                    break;
                                case "2":
                                    boolean drinkScreen = true;

                                    while (drinkScreen) {
                                        System.out.println(BRIGHT_WHITE + "Add a Drink: ");
                                        System.out.println("1) Small \n2) Medium \n3) Large \n0) Back");
                                        String userDrinkInput = myScanner.nextLine();
                                        userDrinkInput.toLowerCase();

                                        if (userDrinkInput.equals("0")) {

                                            drinkScreen = false;

                                        } else if (userDrinkInput.equals("1") || userDrinkInput.equalsIgnoreCase("small")) {
                                            convertStringToDrink(userDrinkInput);
                                            System.out.println("Choose a Flavor: ");
                                            System.out.println("1 ) Pepsi \n2) Sprite \n3) Sweet Tea \n4) Water");
                                            String userDrinkFlavor = myScanner.nextLine();
                                            userDrinkFlavor.toLowerCase();

                                            Drink userDrink = new Drink(convertStringToDrink(userDrinkInput), convertStringToDrinkFlavor(userDrinkFlavor), 0);
                                            double drinkTotal = userDrink.getDrinkTotal(userDrink);
                                            userDrink.setDrinktotal(drinkTotal);
                                            receiptWriter.write("\nSmall " + userDrink.getDrinkFlavor() + "... $2.00\n");
                                            System.out.println(BRIGHT_GREEN + "\nDrink Added Successfully\n");
                                            drinkScreen = false;
                                        } else if (userDrinkInput.equals("2") || userDrinkInput.equalsIgnoreCase("medium")) {
                                            System.out.println("Choose a Flavor: ");
                                            System.out.println("1 ) Pepsi \n2) Sprite \n3) Sweet Tea \n4) Water");
                                            String userDrinkFlavor = myScanner.nextLine();
                                            userDrinkFlavor.toLowerCase();

                                            Drink userDrink = new Drink(convertStringToDrink(userDrinkInput), convertStringToDrinkFlavor(userDrinkFlavor), 0);
                                            double drinkTotal = userDrink.getDrinkTotal(userDrink);
                                            userDrink.setDrinktotal(drinkTotal);
                                            receiptWriter.write("\nMedium " + userDrink.getDrinkFlavor() + "... $2.50\n");
                                            System.out.println(BRIGHT_GREEN + "\nDrink Added Successfully\n");
                                            drinkScreen = false;
                                        } else if (userDrinkInput.equals("3") || userDrinkInput.equalsIgnoreCase("Large")) {
                                            System.out.println("Choose a Flavor: ");
                                            System.out.println("1 ) Pepsi \n2) Sprite \n3) Sweet Tea \n4) Water");
                                            String userDrinkFlavor = myScanner.nextLine();
                                            userDrinkFlavor.toLowerCase();

                                            Drink userDrink = new Drink(convertStringToDrink(userDrinkInput), convertStringToDrinkFlavor(userDrinkFlavor), 0);

                                            userDrink.setDrinktotal(userDrink.getDrinktotal());
                                            receiptWriter.write("\nLarge " + userDrink.getDrinkFlavor() + "... $3.00\n");
                                            System.out.println(BRIGHT_GREEN + "\nDrink Added Successfully\n");
                                            drinkScreen = false;

                                        } else {
                                            System.out.println(RED + "Drink size not recognized. Please try Again.\n");


                                        }
                                    }
                                    break;
                                case "3":
                                    boolean addChipsScreen = true;

                                    while (addChipsScreen) {
                                        System.out.println(BRIGHT_WHITE + "Add Chips: ");
                                        System.out.println("1) Doritos \n2) Classic Potato Chips \n3) Cheetos \n0) Back");
                                        String userChipFlavor = myScanner.nextLine();
                                        userChipFlavor.toLowerCase();


                                        if (userChipFlavor.equals("0")) {

                                            addChipsScreen = false;

                                        } else if (userChipFlavor.equals("1") || (userChipFlavor.equals("2")) || (userChipFlavor.equals("3"))) {
                                            convertStringToChip(userChipFlavor);
                                            Chips userChips = new Chips(convertStringToChip(userChipFlavor), 1.5);
                                            receiptWriter.write("\n" + convertStringToChip(userChipFlavor) + "... $1.50\n");
                                            System.out.println(BRIGHT_GREEN + "\nChips Added Successfully\n");
                                            addChipsScreen = false;

                                        } else {
                                            System.out.println(RED + "Value not recognized. Please try again.");


                                        }

                                    }



                                    break;
                                case "4":

                                    boolean checkoutScreen = true;
                                    while (checkoutScreen) {

                                        Scanner myReader = new Scanner(receipt);
                                        while (myReader.hasNextLine()) {
                                            String output = myReader.nextLine();
                                            System.out.println(output);

                                        }
                                        myReader.close();
                                        break;

                                    }

                                    break;
                                case "0":

                                    // Deletes the order
                                    userOrder.clear();
                                    drinksOrder.clear();
                                    chipsOrder.clear();

                                    // Exits to home screen
                                    newOrder = false;
                                    break;
                                default:
                                    System.out.println(RED + "\n\nNot A Valid Option");

                            }
                            receiptWriter.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
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

    private static double addTotal(Sandwich userSandwichOrder) {

        if(userSandwichOrder.getSizeSandwich().equalsIgnoreCase("4 inch")) {
            double orderTotal = 0;
            orderTotal += 5.50;
            if (userSandwichOrder.getMeatType().equalsIgnoreCase("No meat")) {

                orderTotal += 0;
            } else {
                orderTotal += 1;
            }
            if (userSandwichOrder.extraMeat == true) {
                orderTotal += .50;
            }

            if (userSandwichOrder.getCheeseType().equalsIgnoreCase("No cheese")) {

                orderTotal += 0;
            } else {
                orderTotal += .75;
            }
            if (userSandwichOrder.extraCheese == true) {

                orderTotal += .30;

                return orderTotal;
            }


        } else if(userSandwichOrder.getSizeSandwich().equalsIgnoreCase("4 inch")) {

            double orderTotal = 0;
            orderTotal += 7;
            if (userSandwichOrder.getMeatType().equalsIgnoreCase("No meat")) {

                orderTotal += 0;
            } else {
                orderTotal += 2;
            }

                if (userSandwichOrder.extraMeat == true) {
                    orderTotal += 1;
                }

                if (userSandwichOrder.getCheeseType().equalsIgnoreCase("No cheese")) {

                    orderTotal += 0;
                } else {
                    orderTotal += 1.50;
                }
                if (userSandwichOrder.extraCheese == true) {

                    orderTotal += .60;

                    return orderTotal;


            }
        } else {
            double orderTotal = 0;
            orderTotal += 8.50;
            if (userSandwichOrder.getMeatType().equalsIgnoreCase("No meat")) {

                orderTotal += 0;
            } else {
                orderTotal += 3;
            }
            if (userSandwichOrder.extraMeat == true) {
                orderTotal += 1.50;
            }

            if (userSandwichOrder.getCheeseType().equalsIgnoreCase("No cheese")) {

                orderTotal += 0;
            } else {
                orderTotal += 2.25;
            }
            if (userSandwichOrder.extraCheese == true) {

                orderTotal += .90;

                return orderTotal;
            }


        }
        return 0;
    }

    public String printListValues(ArrayList input) {

        for (Object output : input) {
            System.out.println(output);

        }
        return "No Toppings Available";
    }

    }