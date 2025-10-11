package inheritance.challenge_cake;

public class Main {
    public static void main(String[] args) {
        var cake = Bakery.createCake();
        var birthdayCake = Bakery.createBirthdayCake();
        var weddingCake = Bakery.createWeddingCake();

        System.out.println(cake);
        System.out.println(birthdayCake);
        System.out.println(weddingCake);

        System.out.println(cake.getType() + " is a " + cake.getBaseType());
        System.out.println(birthdayCake.getType() + " is a " + cake.getBaseType());
        System.out.println(weddingCake.getType() + " is a " + cake.getBaseType());
    }
}
