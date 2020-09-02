import java.util.List;

public class Store implements IStore {

   private String name;
   private  String address;

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    public void buy(Product product) {

    }

    public void sell(Product product) {

    }

    public double getRevenue() {
        return 0;
    }

    @Override
    public List<Product> getInventory() {
        return null;
    }
}
