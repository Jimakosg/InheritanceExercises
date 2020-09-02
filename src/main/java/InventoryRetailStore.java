import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {

    List<Product> products;
    List<Product> inventory = new ArrayList<>();

    public InventoryRetailStore() {
        this.products = products;
        this.inventory = inventory;
    }

    public void reset(){}

    public InventoryRetailStore(List<Product> products) {
        this.products = products;
    }

    @Override
    public void buy(Product product) {
        inventory.add(product);
    }

    @Override
    public void sell(Product product) {
        inventory.remove(product);
    }

    @Override
    public double getRevenue() {
        return 0;
    }

    @Override
    public List<Product> getInventory() {
        return inventory;
    }


}
