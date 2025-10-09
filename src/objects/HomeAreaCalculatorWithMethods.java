package objects;

public class HomeAreaCalculatorWithMethods {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle kitchen = new Rectangle(200,400);
        Rectangle bathroom = new Rectangle(300,700);

        double area = calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is: " + area);

        scanner.close();
    }

    public static double calculateTotalArea(Rectangle rectangleOne,Rectangle rectangleTwo){
        return rectangleOne.calculateArea() + rectangleTwo.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }

}
