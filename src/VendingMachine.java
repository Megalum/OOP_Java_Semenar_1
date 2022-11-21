import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<Product> assortment = new ArrayList<>();

    private void addProduct(Product item) {
        this.assortment.add(item);
    }

    public void initProducts(ArrayList<Product> items) {
        for (Product item : items) {
            addProduct(item);
        }
    }

    public Product getProduct(String name) {
        for (int i = 0; i < this.assortment.size(); i++) {
            String currentName = this.assortment.get(i).getName();
            if (currentName.equals(name)) {
                Product boughProduct = this.assortment.get(i);
                this.assortment.remove(i);
                return boughProduct;
            }
        }
        return new Product("Empty", 0);
    }

    public ArrayList checkAssortment() {
        return this.assortment;
    }
}