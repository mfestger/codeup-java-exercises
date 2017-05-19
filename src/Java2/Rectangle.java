/**
 * Created by michaelfestger on 5/19/17.
 */
package Java2;
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        int area = length * width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = (length * 2) + (width * 2);
        return perimeter;
    }

}
