public class HotDrink extends Water{

     protected int temp;

    public HotDrink(String name, double price, String currency, double volume, int temp) {
        super(name, price, currency, false, volume);
        this.temp = temp;
    }

    protected int getTemp() {
        return this.temp;
    }

    public String sellItem() {
        // TODO Auto-generated method stub
        return "We sold one bottle of " + super.name + " temperature: " + this.temp + "; " + super.volume + " at a price " + super.price + super.currency;
    }
}
