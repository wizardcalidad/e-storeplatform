package userInteraction;

public class Customer implements User {
    private BillingInformation billingInformation;
    private Cart shoppingCart;

    public BillingInformation getBillingInformation() {
        return billingInformation;
    }

    public void setBillingInformation(BillingInformation billingInformation) {
        this.billingInformation = billingInformation;
    }

    public  Cart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Cart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public String password() {
        return null;
    }

    @Override
    public String emailAddress() {
        return null;
    }

    @Override
    public String phone() {
        return null;
    }

    @Override
    public Address homeAddress() {
        return null;
    }
}
