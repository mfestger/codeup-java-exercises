/**
 * Created by michaelfestger on 5/8/17.
 */

package io;

import java.util.Scanner;

public class PizzaExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price = 0;
        String pizzaSize;
        System.out.println("Welcome to #Festg Pizza!");
        System.out.println("Please select the size of your pizza.");
        System.out.println("Small: $8.99");
        System.out.println("Medium: $10.99");
        System.out.println("Large: $12.99");
        System.out.print("Type what size you would like: ");
        pizzaSize = scan.nextLine();

        for (int sizeSelector = 1; sizeSelector < 2; sizeSelector+=0) {
            // This determines size
            switch (pizzaSize.toLowerCase()) {
                case "small":
                    System.out.print("Small, got it. ");
                    price += 8.99;
                    sizeSelector++;
                    break;
                case "medium":
                    System.out.print("Medium, got it. ");
                    price += 10.99;
                    sizeSelector++;
                    break;
                case "large":
                    System.out.print("Large, got it. ");
                    price += 12.99;
                    sizeSelector++;
                    break;
                default:
                    System.out.print("That is not a size. ");
                    break;
            }
        }

            // This determines specialty
            System.out.println("Please select your specialty pizza. No extra cost.");
            System.out.println("Meat Lovers");
            System.out.println("Veggie Lovers");
            System.out.println("Pepperoni Lovers");
            System.out.println("Supreme");
            System.out.println("Super Supreme");
            System.out.print("Type what specialty you would like: ");
            String pizzaSpecialty = scan.nextLine();
            System.out.print(pizzaSize + " " + pizzaSpecialty + ", got it. ");

            // This determines extra toppings
            System.out.println("Please select any extra toppings. Each are an extra $1.50");
            System.out.println("Pepperoni");
            System.out.println("Ham");
            System.out.println("Italian Sausage");
            System.out.println("Green Peppers");
            System.out.println("Onion");
            System.out.println("Mushroom");
            System.out.println("Jalapeno");
            System.out.println("Black Olive");
            System.out.println("Pineapple");
            System.out.println("Spinach");
            System.out.println("None");
            System.out.print("Type what toppings you would like: ");
            String extraToppings = scan.nextLine();

            System.out.println(extraToppings);

            System.out.println(price);

        }

}

