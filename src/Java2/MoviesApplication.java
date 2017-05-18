
package Java2;

import java.util.Scanner;
import java.util.Arrays;

public class MoviesApplication {

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        String init = "y";

        displayMenu();

        while (init.equalsIgnoreCase("y")) {
            switch (mainMenuSelect(input)){
                case 0:
                    //exit
                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                case 1:
                    //display all movies
                    System.out.println(MoviesArray.findAll());
                case 2:
                    //display animated
                case 3:
                    //display drama
                case 4:
                    //display horror
                case 5:
                    //display sci-fi
            }
        }
    }

    public static void displayMenu(){
        System.out.println("0 - Exit");
        System.out.println("1 - View All Movies ");
        System.out.println("2 - View Animated Movies");
        System.out.println("3 - View Drama Category");
        System.out.println("4 - View Horror Category");
        System.out.println("5 - View Sci-Fi Category");
        System.out.println("Please enter a number: ");
        input.nextLine();
    }

    public static int mainMenuSelect(Scanner input) {
        int menuOption = input.nextInt();
        input.nextLine();
        return menuOption;
    }
}
