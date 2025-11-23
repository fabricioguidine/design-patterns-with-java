package org.example;

/**
 * Pix payment implementation.
 * 
 * @version 1.0
 */
public class PixPayment implements Payment {
    private String pixKey;
    private float value;

    /**
     * Constructs a PixPayment.
     * 
     * @param pixKey the Pix key
     * @param value the payment value
     */
    public PixPayment(String pixKey, float value) {
        if (pixKey == null || pixKey.trim().isEmpty()) {
            throw new IllegalArgumentException("Pix key cannot be null or empty");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.pixKey = pixKey;
        this.value = value;
    }

    public String getPixKey() {
        return pixKey;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String accept(Visitor visitor) {
        if (visitor == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
        return visitor.displayPixPayment(this);
    }
}

