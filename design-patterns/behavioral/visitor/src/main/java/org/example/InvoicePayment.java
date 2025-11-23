package org.example;

/**
 * Invoice payment (Boleto) implementation.
 * 
 * @version 1.0
 */
public class InvoicePayment implements Payment {
    private String barcode;
    private float value;

    /**
     * Constructs an InvoicePayment.
     * 
     * @param barcode the invoice barcode
     * @param value the payment value
     */
    public InvoicePayment(String barcode, float value) {
        if (barcode == null || barcode.trim().isEmpty()) {
            throw new IllegalArgumentException("Barcode cannot be null or empty");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.barcode = barcode;
        this.value = value;
    }

    public String getBarcode() {
        return barcode;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String accept(Visitor visitor) {
        if (visitor == null) {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
        return visitor.displayInvoicePayment(this);
    }
}

