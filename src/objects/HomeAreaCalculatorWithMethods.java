package objects;

public class HomeAreaCalculatorWithMethods {
    public static void main(String[] args) {
        Rectangle kitchen = new Rectangle(200,400);
        Rectangle bathroom = new Rectangle(300,700);
        System.out.println("The total area is: " + area);
    }

    public static double calculateTotalArea(Rectangle rectangleOne,Rectangle rectangleTwo){
        return rectangleOne.calculateArea() + rectangleTwo.calculateArea();
    }

}
