/**
 * Created by michaelfestger on 5/19/17.
 */
package Java2;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Square(5, 4);
        Square box2 = new Square(5, 5);

        System.out.println("The perimeter of Box 1 is: " + box1.getPerimeter());
        System.out.println("The area of Box 1 is: " + box1.getArea());

        System.out.println("The length of Box 2 is: " + box2.description());
        System.out.println("The width of Box 2 is: " + box2.description());
    }


}
