public class NonPerishable extends Product {
    public NonPerishable(String name, String description, double price, int amount) {
        super(name, description, price, amount);
    }

    @Override
    public String toString() {
        return "[Name: " + getName() +
                ", Description: " + getDescription() +
                ", Price: " + getPrice() +
                ", Amount: " + getAmount() + "]";
    }
}