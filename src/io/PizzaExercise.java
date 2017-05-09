/**
 * Created by michaelfestger on 5/8/17.
 */

package io;

import java.util.Scanner;

public class PizzaExercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This determines size
        System.out.println("Welcome to #Festg Pizza!");
        System.out.println("Please select the size of your pizza.");
        System.out.println("Small: $8.99");
        System.out.println("Medium: $10.99");
        System.out.println("Large: $12.99");
        System.out.print("Type what size you would like: ");
        String pizzaSize = scan.nextLine();

        if (pizzaSize.equals("Small")) {
            System.out.print(pizzaSize + ", got it. ");
        } else if(pizzaSize.equals("Medium")){
            System.out.print(pizzaSize + ", got it. ");
        } else if(pizzaSize.equals("Large")){
            System.out.print(pizzaSize + ", got it. ");
        } else {
            System.out.print("That is not a size. ");
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


        if (pizzaSize == "Small") {
            double totalPrice = 8.99;
        } else if (pizzaSize == "Medium") {
            double totalPrice = 10.99;

        } else if (pizzaSize == "Large") {
            double totalPrice = 12.99;
        }

//        if (extraToppings == "Pepperoni", "Ham", "Italian Sausage", "Green Peppers",
//                "Onion", "Mushroom", "Jalapeno", "Black Olive", "Pineapple", "Spinach"){
//        }


    }
}

