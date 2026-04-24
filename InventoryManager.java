import java.util.*;

//Singleton Inventory Manager
class InventoryManager {
    private static InventoryManager instance;
    private List<Product> productList;

    //Private Constructor
    private InventoryManager() {
        productList = new ArrayList<>();
    }

    //Singleton Instance Getter
    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    //Add Product
    public void addProduct(Product product) {
        productList.add(product);
    }

    //Return Iterator
    public ProductIterator returnInventory() {
        return new ProductIterator(productList);
    }
}