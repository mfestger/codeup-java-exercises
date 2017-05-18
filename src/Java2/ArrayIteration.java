package Java2;

/**
 * Created by michaelfestger on 5/18/17.
 */
public class ArrayIteration {
    public static void main(String[] args) {
        String[] languages = {"HTML", "CSS", "JavaScript", "Java"};
        System.out.println("I know the following languages: ");
        for(int i = 0; i < languages.length; i++){
            System.out.println(languages[i]);

        }
        System.out.println("ONE MORE TIME!");
        for (String language: languages) {
            System.out.println(language);
        }

        int[] numbers = {2, 12, 23, 40, 78, 100};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum+= numbers[i];
        }
        System.out.println("The sum of all numbers is: " + sum);


    }
}
