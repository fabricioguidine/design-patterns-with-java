package org.example;

/**
 * Credit card payment implementation.
 * 
 * @version 1.0
 */
public class CreditCardPayment implements Payment {
    private int cardNumber;
    private String expiryDate;
    private int securityCode;
    private float value;

    /**
     * Constructs a CreditCardPayment.
     * 
     * @param cardNumber the card number
     * @param expiryDate the expiry date
     * @param securityCode the security code
     * @param value the payment value
     */
    public CreditCardPayment(int cardNumber, String expiryDate, int securityCode, float value) {
        if (expiryDate == null || expiryDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Expiry date cannot be null or empty");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityCode = securityCode;
        this.value = value;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String accept(Visitor visitor) {
        if (visitor == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
        return visitor.displayCreditCardPayment(this);
    }
}

