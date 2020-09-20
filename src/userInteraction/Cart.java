package userInteraction;

public class Cart {
    private int Quantity;
    private ItemDescription item;
    private static final char Unit = '₦';
    private ItemDescription description;
    private ItemDescription unitPrice;
    private int totalPrice;


    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public ItemDescription getItem() {
        return item;
    }

    public void setItem(ItemDescription item) {
        this.item = item;
    }

    public static char getUnit() {
        return Unit;
    }

    public ItemDescription getDescription() {
        return description;
    }

    public void setDescription(ItemDescription description) {
        this.description = description;
    }

    public ItemDescription getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(ItemDescription unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "Quantity=" + Quantity +
                ", item=" + item +
                ", description=" + description +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
