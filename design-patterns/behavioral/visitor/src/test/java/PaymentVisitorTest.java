import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for the Visitor pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Visitor Pattern Tests")
class PaymentVisitorTest {

    @Test
    @DisplayName("Should display Pix payment")
    void shouldDisplayPixPayment() {
        // Arrange
        PixPayment pixPayment = new PixPayment("asdfghjkl", 900.0f);
        PaymentVisitor visitor = new PaymentVisitor();
        
        // Act
        String result = visitor.display(pixPayment);
        
        // Assert
        assertEquals("PixPayment{" +
                "pixKey=asdfghjkl" +
                ", value=900.0" +
                '}', result);
    }

    @Test
    @DisplayName("Should display credit card payment")
    void shouldDisplayCreditCardPayment() {
        // Arrange
        CreditCardPayment creditCardPayment = new CreditCardPayment(1234567890, "10/10", 999, 500.0f);
        PaymentVisitor visitor = new PaymentVisitor();
        
        // Act
        String result = visitor.display(creditCardPayment);
        
        // Assert
        assertEquals("CreditCardPayment{" +
                "cardNumber=1234567890" +
                ", expiryDate='10/10'" +
                ", securityCode='999'" +
                ", value=500.0" +
                '}', result);
    }

    @Test
    @DisplayName("Should display invoice payment")
    void shouldDisplayInvoicePayment() {
        // Arrange
        InvoicePayment invoicePayment = new InvoicePayment("123456", 500.0f);
        PaymentVisitor visitor = new PaymentVisitor();
        
        // Act
        String result = visitor.display(invoicePayment);
        
        // Assert
        assertEquals("InvoicePayment{" +
                "barcode=123456" +
                ", value=500.0" +
                '}', result);
    }
}

