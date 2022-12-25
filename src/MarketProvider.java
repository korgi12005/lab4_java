import java.util.Random;

public class MarketProvider {
    Random price;
    {price = new Random();}
    public int onMarketUpdate() {
        return price.nextInt();
    }
}
