/**
 * Created by michaelfestger on 5/22/17.
 */
package io;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {
        Student2 david = new Student2("David", 80);
        Student2 veronica = new Student2("Veronica", 100);
        Student2 russel = new Student2("Russel", 75);
        Student2 kira = new Student2("Kira", 98);

        Map<String, Student2> students = new HashMap<>();
        students.put("clefCity", david);
        students.put("whisperluvr", veronica);
        students.put("wtf-is-github", russel);
        students.put("kira_bug", kira);





    }
}
