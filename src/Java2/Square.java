
/**
 * Created by michaelfestger on 5/19/17.
 */

    package Java2;


   public class Square extends Rectangle{
    private int sides;
    public Square(int sides) {
        super(sides, sides);
        this.sides = sides;
    }

    @Override
    public String description() {
        return String.format("Each side of this box is: " + sides, super.description(), sides);
    }




}

