import java.util.List;

public interface IStore {

    void buy(Product product);
    void sell(Product product);
    double getRevenue();


    public List<Product> getInventory();
}
