import java.util.ArrayList;

public class VendingHotDrink {

    protected ArrayList<HotDrink> assortment = new ArrayList<>();

    private void addProduct(HotDrink item) {
        this.assortment.add(item);
    }

    public void initProducts(ArrayList<HotDrink> items) {
        for (HotDrink item : items) {
            addProduct(item);
        }
    }

    public HotDrink getProduct(String name) {
        for (int i = 0; i < this.assortment.size(); i++) {
            String currentName = this.assortment.get(i).getName();
            if (currentName.equals(name)) {
                HotDrink boughProduct = this.assortment.get(i);
                return boughProduct;
            }
        }
        return new HotDrink("Empty", 0, "$", 0.0d, 0);
    }

    public HotDrink getProduct(String name, double volume) {
        for (int i = 0; i < this.assortment.size(); i++) {
            String currentName = this.assortment.get(i).getName();
            Double currentVolume = this.assortment.get(i).getVolume();
            if (currentName.equals(name) && currentVolume.equals(volume)) {
                HotDrink boughProduct = this.assortment.get(i);
                return boughProduct;
            }
        }
        return new HotDrink("Empty", 0, "$", 0.0d, 0);
    }

    public HotDrink getProduct(String name, double volume, int temp) {
        for (int i = 0; i < this.assortment.size(); i++) {
            String currentName = this.assortment.get(i).getName();
            Double currentVolume = this.assortment.get(i).getVolume();
            Integer currentTemp = this.assortment.get(i).getTemp();
            if (currentName.equals(name) && currentVolume.equals(volume) && currentTemp.equals(temp)) {
                HotDrink boughProduct = this.assortment.get(i);
                return boughProduct;
            }
        }
        return new HotDrink("Empty", 0, "$", 0.0d, 0);
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < this.assortment.size(); i++) {
            out += assortment.get(i).sellItem() + "\n";
        }
        return out;
    }
}
