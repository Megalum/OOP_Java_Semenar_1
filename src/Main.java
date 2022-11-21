import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();
        Product item1 = new Product("Chips", 20);
        Product item2 = new Product("Juice", 15);
        Product item3 = new Product("Nuts", 40);
        ArrayList<Product> assort = new ArrayList<>(Arrays.asList( new Product [] {item1,item2,item3}));
        VendingMachine vendor1 = new VendingMachine();
        vendor1.initProducts(assort);
        logger.info(vendor1.checkAssortment().toString());
        logger.info(vendor1.getProduct("Nuts").toString());
        logger.info(vendor1.checkAssortment().toString());


        Chocolate choco = new Chocolate("Molochniy", 100, "$", "White");
        logger.info(choco.sellItem());

        Water aquaWater = new Water("Aqua Minerale", 50, "$", true, 0.5d);
        logger.info(aquaWater.sellItem());

        HotDrink tempWater = new HotDrink("Water", 10, "$", 1.0d, 20);
        logger.info(tempWater.sellItem());

        HotDrink tempWater1 = new HotDrink("Tea", 20, "$", 0.5d, 40);
        logger.info(tempWater1.sellItem());

        HotDrink tempWater2 = new HotDrink("Coffee", 32, "$", 0.5d, 50);
        logger.info(tempWater2.sellItem());

        HotDrink tempWater3 = new HotDrink("Late", 42, "$", 0.3d, 48);
        logger.info(tempWater3.sellItem());

        ArrayList<HotDrink> assort1 = new ArrayList<>();
        assort1.add(tempWater);
        assort1.add(tempWater1);
        assort1.add(tempWater2);
        assort1.add(tempWater3);
        VendingHotDrink vendor2 = new VendingHotDrink();
        vendor2.initProducts(assort1);
        logger.info(vendor2.toString());
        HotDrink tempWater4 = vendor2.getProduct("Water", 1.0, 20);
        logger.info(tempWater4.sellItem());
        tempWater4 = vendor2.getProduct("Tea");
        logger.info(tempWater4.sellItem());
        tempWater4 = vendor2.getProduct("Coffee", 1.0d);
        logger.info(tempWater4.sellItem());
        tempWater4 = vendor2.getProduct("Coffee", 0.5d);
        logger.info(tempWater4.sellItem());
    }
}