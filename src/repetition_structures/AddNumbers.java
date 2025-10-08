package repetition_structures;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;
        do{
            System.out.println("Enter the first number");
            double numberOne = scanner.nextDouble();

            System.out.println("Enter the second number");
            double numberTwo = scanner.nextDouble();

            double sum = numberOne + numberTwo;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes, 2 for no.");
            runAgain = scanner.nextInt();
        }while(runAgain == 1);

        scanner.close();
    }
}
