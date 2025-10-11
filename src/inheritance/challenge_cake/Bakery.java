package inheritance.challenge_cake;

public class Bakery {

    static Cake createCake() {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        return cake;
    }

    static BirthdayCake createBirthdayCake(){
        return new BirthdayCake();
    }

    static WeddingCake createWeddingCake(){
        WeddingCake weddingCake = new WeddingCake();

        weddingCake.setFlavor("pina colada");
        weddingCake.setPrice(350);

        return weddingCake;
    }

}
