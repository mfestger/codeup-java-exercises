
package Java2;

import java.util.Scanner;
import java.util.Arrays;

public class MoviesApplication {

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        String init = "y";

        Movie[] findAll = MoviesArray.findAll();
        displayMenu();

        while (init.equalsIgnoreCase("y")) {
            switch (mainMenuSelect(input)) {
                case 0:
                    //exit
                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                    break;

                case 1:
                    //display all movies
                    for (Movie name : findAll) {
                        System.out.println(findAll);
                    }

                    break;

                case 2:
                    //display animated
                    for (Movie name : findAll) {
                        if (name.getCategory().equals("animated")) {
                            System.out.println(name.getInfo());
                        }

                    }
                    break;

                case 3:
                    //display drama
                    for (Movie name : findAll) {
                        if (name.getCategory().equals("drama")) {
                            System.out.println(name.getInfo());
                        }

                    }
                    break;
                case 4:
                    //display horror
                    for (Movie name : findAll) {
                        if (name.getCategory().equals("horror")) {
                            System.out.println(name.getInfo());

                        }

                    }
                    break;
                case 5:
                    //display sci-fi
                    for (Movie name : findAll) {
                        if (name.getCategory().equals("scifi")) {
                            System.out.println(name.getInfo());

                        }

                    }
                    break;

            }
            displayMenu();
            mainMenuSelect(input);
        }
    }

    public static void displayMenu(){
        System.out.println();
        System.out.println("0 - Exit");
        System.out.println("1 - View All Movies ");
        System.out.println("2 - View Animated Movies");
        System.out.println("3 - View Drama Category");
        System.out.println("4 - View Horror Category");
        System.out.println("5 - View Sci-Fi Category");
        System.out.println("Please enter a number: ");

    }

    public static int mainMenuSelect(Scanner input) {
        int menuOption = input.nextInt();
//        input.nextLine();
        return menuOption;
    }
}
