package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle roomOne = new Rectangle();

        roomOne.setWidth(25);
        roomOne.setLength(50);
        double areaOfRoomOne = roomOne.calculateArea();

        Rectangle roomTwo = new Rectangle(30,75);
        double areaOfRoomTwo = roomTwo.calculateArea();
    }
}
