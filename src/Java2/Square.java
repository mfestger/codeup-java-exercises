package Java2;

import Java2.Rectangle;

/**
 * Created by michaelfestger on 5/19/17.
 */


    class Square extends Rectangle{
    private int sides;
    public Square(int length, int width) {
        super(length, width);
        sides = length;
        sides = width;

    }

    public String description() {
        return String.format("The size of each side is: " + sides);
    }



}

