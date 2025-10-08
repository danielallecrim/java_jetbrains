package decision_structures;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args) {

        //initialize known values
        int quotas = 10;

        //Get values for the unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales >= quotas){
            System.out.println("Congrats! You've met your quota.");
        }else{
            int salesShort = quotas- sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
