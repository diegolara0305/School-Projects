/* Diego Lara
[CS1101] Comprehensive Lab 1
This work is to be done individually. It is not permitted to. share, reproduce, or alter any part of this assignment for any purpose. Students are not permitted from sharing code, uploading this assignment online in any form, or viewing/receiving/ modifying code written from anyone else. This assignment is part. of an academic course at The University of Texas at El Paso and
a grade will be assigned for the work produced individually by the student.
*/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.io.File;

public class CL1_Lara {
    public static void main(String[] args) throws FileNotFoundException {
        // Initializing all my variables
        Scanner scanner = new Scanner(System.in);
        int answer;
        double total = 0;
        String items = "";
        double subtotal = 0.0;
        // Keep looping until user exits
        do {

            String Mainmenu = "Welcome to UTEP Eats!\n------------Menu------------\nChoose an option (1-5):\n1. Add food\n2. View cart\n3. Clear cart\n4. Checkout\n5. Exit\n----------------------------";

            System.out.println(Mainmenu);

            answer = scanner.nextInt();

            switch (answer) {
                case 1:
                    String source = "food.txt";
                    String product;
                    float price;
                    int amount;

                    String dish;

                    File dataFile = new File(source);

                    Scanner fileScanner = new Scanner(dataFile);
                    while (fileScanner.hasNext()) {
                        product = fileScanner.next();
                        price = fileScanner.nextFloat();
                        System.out.print(product + " $");
                        System.out.println(price);
                    }

                    System.out.println("choose one:");
                    dish = scanner.next();
                    System.out.println("Enter quantity:");
                    amount = scanner.nextInt();
                     fileScanner = new Scanner(dataFile);

                    while (fileScanner.hasNext()) {
                        product = fileScanner.next();
                        price = fileScanner.nextFloat();
                        if (dish.equals(product)) {
                            
                            subtotal = amount * price;
                        }
                    }
                    items = " " + amount;
                    total = subtotal * 0.725;

                    break;
                case 2:
                    System.out.println("------------Cart-------------");
                    System.out.println("Number of items: " + items);
                    System.out.println("Total: $" + total);
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    System.out.println("Yor cart is empty now");
                    items = "";
                    total = 0;
                    System.out.println("Number of items: " + items);
                    System.out.println("Total: " + total);
                    break;

                case 4:
                    System.out.println("Choose an option below:");
                    System.out.println("1. Pickup   2. Delivery");
                    int option = scanner.nextInt();

                    if (option == 1) {
                        System.out.println("Order information:");
                        System.out.println("Number of Items: " + items);
                        System.out.println("Total: " + total);
                        System.out.println("Please enter your 16 digit card number to comlpete the order:");
                        BigInteger card = scanner.nextBigInteger();
                        System.out.println(card);
                        System.out.println("Success! Thank you for shopping with UTEP Eats!");
                        System.out.println("--------Receipt--------");
                        System.out.println("Number of Items: " + items);
                        System.out.println("Total: " + total);
                        System.out.println("--------Receipt--------");

                    } else if (option == 2) {
                        System.out.println("There is a $5 dollar delivery fee");
                        total = total + 5;
                        System.out.println("Please enter your address:");
                        int addressnum = scanner.nextInt();
                        String address = scanner.next();
                        String address2 = scanner.next();

                        System.out.println("Would you like to add a tip?");
                        System.out.println("1. Yes  2. No");
                        int tip = scanner.nextInt();

                        if (tip == 2) {
                            System.out.println("Order information:");
                            System.out.println("Number of Items: " + items);
                            System.out.println("Total: " + total);
                            System.out.println("Address: " + addressnum + " " + address + " " + address2);
                            System.out.println("Please enter your 16 digit card number to comlpete the order:");
                            BigInteger card = scanner.nextBigInteger();
                            System.out.println(card);
                            System.out.println("Success! Thank you for shopping with UTEP Eats!");
                            System.out.println("--------Receipt--------");
                            System.out.println("Number of Items: " + items);
                            System.out.println("Total: " + total);
                            System.out.println("--------Receipt--------");
                            System.out.println("Ending program.");
                        }

                        else if (tip == 1) {
                            System.out.println("How much would you like to give?");
                            double addtip = scanner.nextDouble();
                            total = total + addtip;
                            System.out.println("Order information:");
                            System.out.println("Number of Items: " + items);
                            System.out.println("Total: " + total);
                            System.out.println("Address: " + address);
                            System.out.println("Please enter your 16 digit card number to comlpete the order:");
                            BigInteger card = scanner.nextBigInteger();
                            System.out.println(card);
                            System.out.println("Success! Thank you for shopping with UTEP Eats!");
                            System.out.println("--------Receipt--------");
                            System.out.println("Number of Items: " + items);
                            System.out.println("Total: " + total);
                            System.out.println("--------Receipt--------");
                            System.out.println("Ending program.");

                        }

                    }
                    return;

                case 5:
                    System.out.println("Cart abandoned. Goodbye!");
                    System.out.println("Ending program.");
                    return;

            }

        } while (answer > 0 && answer < 6);
    }
}
