package Java2;

import java.util.Arrays;

/**
 * Created by michaelfestger on 5/18/17.
 */
public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 6}, // has 3 elements
                {1, 2, 3},
                {4, 6, 7,},
                {34, 6 , 9}
        };

        System.out.println(matrix.length);
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(matrix[1][2]);
        System.out.println(matrix[3][0]); // The first [] is the first object
        System.out.println(matrix[0][2]); // The second [] is position inside the array
        System.out.println();
        // This prints out all elements.
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
        // This laos prints out all elements.
        for(int[] row: matrix){
            for(int number : row){
                System.out.println(number);
            }
            System.out.println();
        }

    }
}
