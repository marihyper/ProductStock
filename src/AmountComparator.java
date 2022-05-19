import java.util.Comparator;

public class AmountComparator implements Comparator<Product> {
    public int compare(Product n1, Product n2) {
        return Integer.compare(n1.getAmount(), n2.getAmount());
    }
}