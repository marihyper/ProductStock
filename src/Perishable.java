import java.util.Comparator;

public class Perishable extends Product implements Comparator<Product> {
    private Date expiration;

    public Perishable(String name, String description, double price, Date expiration, int amount) {
        super(name, description, price, amount);
        this.expiration = expiration;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "[Name: " + getName() +
                ", Description: " + getDescription() +
                ", Price: " + getPrice() +
                ", Amount: " + getAmount() +
                ", Expiration " + getExpiration() + "]";
    }
}