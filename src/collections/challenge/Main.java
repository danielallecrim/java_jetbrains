package collections.challenge;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        var grades = new HashMap<String, Integer>();
        grades.put("Isaac", 95);
        grades.put("Hannah", 55);
        grades.put("Charlie", 80);
        grades.put("Alice", 24);
        grades.put("Bob", 32);
        grades.put("Jane", 63);
        grades.put("Daniel", 50);
        grades.put("Grace", 59);
        grades.put("Frank", 40);
        grades.put("Eve", 79);


        var makeupGrades = new HashMap<String, Integer>();
        makeupGrades.put("Isaac", 90);
        makeupGrades.put("Hannah", 95);
        makeupGrades.put("Charlie", 76);
        makeupGrades.put("Alice", 97);
        makeupGrades.put("Bob", 82);
        makeupGrades.put("Jane", 62);
        makeupGrades.put("Daniel", 89);
        makeupGrades.put("Grace", 80);
        makeupGrades.put("Frank", 98);
        makeupGrades.put("Eve", 79);

        var gradebook =  UpdateGrades.updateGrades(grades, makeupGrades);

        gradebook.forEach((k,v) -> System.out.println(k + ":" + v ));
    }
}
