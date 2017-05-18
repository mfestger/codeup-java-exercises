/**
 * Created by michaelfestger on 5/17/17.
 */

package Java2;
public class Movie {
    private String name; // properties of the object "Movie"
    private String category; // properties of the object "Movie"

// constructor has to have same name as class

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getInfo(){
        String results;
        results = ("Title: " + name + " Category: " + category);
        return results;
    }

    public String getCategory(){
        return category;
    }

}

