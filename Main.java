public class Main {
    public static void main(String[] args) {

        //Get Singleton Instance
        InventoryManager manager = InventoryManager.getInstance();

        //Add New Products
        manager.addProduct(new NewProduct("Laptop"));
        manager.addProduct(new NewProduct("Smartphone"));

        //Add Legacy Items using Adapter
        LegacyItem oldItem1 = new LegacyItem(101, "Old Keyboard");
        LegacyItem oldItem2 = new LegacyItem(102, "Old Mouse");

        manager.addProduct(new ProductAdapter(oldItem1));
        manager.addProduct(new ProductAdapter(oldItem2));

        //Iterate through inventory
        ProductIterator iterator = manager.returnInventory();

        System.out.println("---- Inventory Details ----");

        while (iterator.hasNext()) {
            Product product = iterator.next();
            product.displayDetails();
        }
    }
}