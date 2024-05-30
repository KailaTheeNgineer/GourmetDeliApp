# Delicious Gourmet Deli App
This app is designed to take in an order. The user can add sandwiches, drinks, or chips to their order. They can customize their sandwich to add the toppings they want.
Through the `Add Sandwich` screen, user can add a sandwich, drinks, or chips to their order. They also have the ability to cancel their order/go back home, or checkout their order. There is an option to view all `Transactions`, only `Payments`, only `Deposits`, or to view `Reports`.
In the `Checkout` screen, user can view their current order and the order total. From here, they have the option to confirm the order, cancel the order, or add more items to the order.




### Home
![Deli Home](src/main/receipts/HOMEADDORDERSCREEN.png)
> *From the home screen, user can start a new order or exit*





### Create An Order
![AddSandwichScreen](src/main/receipts/CREATEORDER.png)
>> Screen allows for user to add a new sandiwch, chips, or a drink to their order.*

![Ask Extra](src/main/receipts/ASK EXTRA SCREEN.png)
>> *While adding a sandwich, the user will be prompted for extra meet and cheese only if they add meat or cheese to the order*

![Error Catch](src/main/receipts/ERRORCATCH.png)
>> *While creating a sandwich, if input is invalid, user will be prompted to try again.*

![Receipt](src/main/receipts/receipt.png)
>> *Screen allows for user to view the order and order total. From here, they can confirm the order which is saved to the receipt file, save their order, or add more items.*




### Project Summary


:bulb: **Interesting Piece of Code:** The static ANSI colors.

>> `public static final String RED = "\u001B[31m";
public static final String BRIGHT_WHITE = "\u001B[97m";
public static final String BRIGHT_GREEN = "\u001B[92m";`
>> *Used these Strings for formatting and color for the app*