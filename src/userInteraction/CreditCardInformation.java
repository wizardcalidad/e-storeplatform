package userInteraction;

import java.time.YearMonth;

public class CreditCardInformation {

    private YearMonth cardExpirationYearMonth;
    private String creditCardNumber;
    private byte cardCvv;
    private CardType cardType;
    private String nameOnCard;


    public YearMonth getCardExpirationYearMonth() {
        return cardExpirationYearMonth;
    }

    public void setCardExpirationYearMonth(YearMonth cardExpirationYearMonth) {
        this.cardExpirationYearMonth = cardExpirationYearMonth;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public byte getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(byte cardCvv) {
        this.cardCvv = cardCvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    @Override
    public String toString() {
        return "CreditCardInformation{" +
                "cardExpirationYearMonth=" + cardExpirationYearMonth +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", cardCvv=" + cardCvv +
                ", cardType=" + cardType +
                ", nameOnCard='" + nameOnCard + '\'' +
                '}';
    }
}
