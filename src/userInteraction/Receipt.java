package userInteraction;

public class Receipt {
   private EStore eStoreName;
   private String ReceiptNumber;
   private Customer name;
   private Cart totalPrice;
   private Cart itemDescription;

   @Override
   public String toString() {
      return "Receipt{" +
              "eStoreName=" + eStoreName +
              ", ReceiptNumber='" + ReceiptNumber + '\'' +
              ", name=" + name +
              ", totalPrice=" + totalPrice +
              ", itemDescription=" + itemDescription +
              '}';
   }

   public String getReceiptNumber() {
      return ReceiptNumber;
   }

   public void setReceiptNumber(String receiptNumber) {
      ReceiptNumber = receiptNumber;
   }

   public Customer getName() {
      return name;
   }

   public void setName(Customer name) {
      this.name = name;
   }

   public Cart getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(Cart totalPrice) {
      this.totalPrice = totalPrice;
   }

   public Cart getItemDescription() {
      return itemDescription;
   }

   public void setItemDescription(Cart itemDescription) {
      this.itemDescription = itemDescription;
   }

   public EStore geteStoreName() {
      return eStoreName;
   }

   public void seteStoreName(EStore eStoreName) {
      this.eStoreName = eStoreName;
   }
}
