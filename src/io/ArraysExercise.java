package io;



        import java.util.Random;
/**
 * Created by michaelfestger on 5/17/17.
 */
public class ArraysExercise {
    public static void main(String[] args) {

        // Exercise 1

        String[] adjectivesArray;
        adjectivesArray = new String[10];

        String[] nounsArray;
        nounsArray = new String[10];

        Random rand = new Random();

        int randomNumber1 = rand.nextInt(10);
        int randomNumber2 = rand.nextInt(10);
        int randomNumber3 = rand.nextInt(10);
        int randomNumber4 = rand.nextInt(10);

        adjectivesArray[0] = "Shy";
        adjectivesArray[1] = "Sad";
        adjectivesArray[2] = "Weird";
        adjectivesArray[3] = "Small";
        adjectivesArray[4] = "Large";
        adjectivesArray[5] = "Creative";
        adjectivesArray[6] = "Logical";
        adjectivesArray[7] = "Funny";
        adjectivesArray[8] = "Silly";
        adjectivesArray[9] = "Beautiful";

        nounsArray[0] = "Thing";
        nounsArray[1] = "Man";
        nounsArray[2] = "Woman";
        nounsArray[3] = "Dog";
        nounsArray[4] = "Cat";
        nounsArray[5] = "Horse";
        nounsArray[6] = "Bird";
        nounsArray[7] = "Fish";
        nounsArray[8] = "Table";
        nounsArray[9] = "Object";


        System.out.println(adjectivesArray[randomNumber1] + " " + nounsArray[randomNumber2]);
        System.out.println(adjectivesArray[randomNumber3] + " " + nounsArray[randomNumber4]);


    }
}
