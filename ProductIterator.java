import java.util.*;


//Custom Iterator
class ProductIterator implements Iterator<Product> {
    private List<Product> products;
    private int index = 0;

    public ProductIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return index < products.size();
    }

    @Override
    public Product next() {
        if (hasNext()) {
            return products.get(index++);
        }
        return null;
    }
}