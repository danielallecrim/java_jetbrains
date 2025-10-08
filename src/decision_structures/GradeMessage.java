package decision_structures;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A","B" -> message = "Excelent job!";
            case "C" -> message = "Good job!";
            case "D" -> message = "You need to work a bit harder";
            case "F" -> message = "Uh oh!";
            default -> message = "Error. Invalid grade";
        };
    }
}
