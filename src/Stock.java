import java.util.Arrays;
import java.util.List;

public class Stock {
    private Product[] arrayStock;

    public Stock(Product[] arrayStock) {
        this.arrayStock = arrayStock;
    }

    public Product[] getArrayStock() {
        return arrayStock;
    }

    public void setArrayStock(Product[] arrayStock) {
        this.arrayStock = arrayStock;
    }

    public String toString(Product[] array) {
        int n = array.length;
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) stringArray[i] = ("[" + i + "] " + array[i]);
        return ("toString method:\n" + Arrays.toString(stringArray)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
        );
    }

    public Product[] pricesCompare(Product[] array) {
        PriceComparator priceComparator = new PriceComparator();
        List<Product> newList = Arrays.asList(array);
        newList.sort(priceComparator);
        Product[] targetArray = newList.toArray(new Product[0]);
        System.out.print('\n');
        System.out.println("pricesCompare method:\n" + Arrays.toString(targetArray)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
                .replace("[", "")
                .replace("]", "")
        );
        System.out.print('\n');
        return targetArray;
    }

    public Product[] sortProductsByPrice(Product[] array) {
        int n = array.length;
        Product p;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].getPrice() < array[min].getPrice()) {
                    min = j;
                }
            }
            p = array[i];
            array[i] = array[min];
            array[min] = p;
        }
        System.out.print('\n');
        System.out.println("sortProductsByPrice method:\n" + Arrays.toString(array)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
                .replace("[", "")
                .replace("]", "")
        );
        System.out.print('\n');
        return array;
    }

    public Perishable[] listingPerishables(Product[] array) {
        int n = array.length;
        int j = 0;
        Perishable[] arrayP = new Perishable[array.length];
        for (int i = 0; i < n; i++) {
            if (array[i] instanceof Perishable) {
                arrayP[i] = new Perishable(array[i].getName(), array[i].getDescription(),
                        array[i].getPrice(), ((Perishable) array[i]).getExpiration(), array[i].getAmount());
                j++;
            }
        }
        Perishable[] newArrayP = new Perishable[j];
        System.arraycopy(arrayP, 0, newArrayP, 0, j);
        System.out.print('\n');
        System.out.println("listingPerishables method:\n" + Arrays.toString(newArrayP)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
                .replace("[", "")
                .replace("]", "")
        );
        System.out.print('\n');
        return newArrayP;
    }

    public Product[] amountCompare(Product[] array) {
        AmountComparator amountComparator = new AmountComparator();
        List<Product> newList = Arrays.asList(array);
        newList.sort(amountComparator);
        Product[] targetArray = newList.toArray(new Product[0]);
        System.out.print('\n');
        System.out.println("amountCompare method:\n" + Arrays.toString(targetArray)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]")
                .replace("[", "")
                .replace("]", "")
        );
        System.out.print('\n');
        return targetArray;
    }
}