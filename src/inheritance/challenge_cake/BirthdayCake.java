package inheritance.challenge_cake;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake(){
        super("chocolate","birthdaycake");
    }

    public int getCandles(){
        return this.candles;
    }
    public void setCandles(int candles){
        this.candles = candles;
    }
}
