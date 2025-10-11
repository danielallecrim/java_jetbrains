package inheritance.challenge_cake;

public class Cake {
    private String flavor;
    private double price;
    private static final String BASE_TYPE = "cake";
    private String type;

    public Cake(){
        this("vanilla","cake");
    }

    public Cake(String flavor,String type){
        setFlavor(flavor);
        setType(type);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBaseType() {
        return BASE_TYPE;
    }

    @Override
    public String toString() {
        return "This " + type + " has the flavor " + flavor + " and its price is " + price;
    }
}
