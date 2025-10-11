package inheritance.challenge_cake;

public class WeddingCake extends Cake{
    private int tiers;

    public WeddingCake(){
        super("almond","weddingcake");
    }

    public int getTiers(){
        return this.tiers;
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }
}
