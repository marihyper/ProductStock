import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compare(Product n1, Product n2) {
        return Double.compare(n1.getPrice(), n2.getPrice());
    }
}
