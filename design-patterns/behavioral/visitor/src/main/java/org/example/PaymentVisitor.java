package org.example;

/**
 * Visitor implementation for displaying payment information.
 * 
 * @version 1.0
 */
public class PaymentVisitor implements Visitor {

    /**
     * Displays payment information using the visitor pattern.
     * 
     * @param payment the payment to display
     * @return formatted payment information
     */
    public String display(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("Payment cannot be null");
        }
        return payment.accept(this);
    }

    @Override
    public String displayPixPayment(PixPayment pixPayment) {
        return "PixPayment{" +
                "pixKey=" + pixPayment.getPixKey() +
                ", value=" + pixPayment.getValue() +
                '}';
    }

    @Override
    public String displayCreditCardPayment(CreditCardPayment creditCardPayment) {
        return "CreditCardPayment{" +
                "cardNumber=" + creditCardPayment.getCardNumber() +
                ", expiryDate='" + creditCardPayment.getExpiryDate() + '\'' +
                ", securityCode='" + creditCardPayment.getSecurityCode() + '\'' +
                ", value=" + creditCardPayment.getValue() +
                '}';
    }

    @Override
    public String displayInvoicePayment(InvoicePayment invoicePayment) {
        return "InvoicePayment{" +
                "barcode=" + invoicePayment.getBarcode() +
                ", value=" + invoicePayment.getValue() +
                '}';
    }
}

