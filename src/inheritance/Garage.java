package inheritance;

public class Garage {
    static void main() {
        Coupe myCar = new Coupe();
        myCar.setColor("red");

        System.out.println(String.format("My car is %s and has %d doors.",myCar.getColor(),myCar.getDoors()));
    }
}
