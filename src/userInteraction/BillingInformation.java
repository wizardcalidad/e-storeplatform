package userInteraction;

public class BillingInformation {
    private String receiverName;
    private String receiverPhoneNumber;
    private Address deliveryAddress;
    private CreditCardInformation creditCardInformation;


    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CreditCardInformation getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(CreditCardInformation creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    @Override
    public String toString() {
        return "BillingInformation{" +
                "receiverName='" + receiverName + '\'' +
                ", receiverPhoneNumber='" + receiverPhoneNumber + '\'' +
                ", deliveryAddress=" + deliveryAddress +
                ", creditCardInformation=" + creditCardInformation +
                '}';
    }
}
