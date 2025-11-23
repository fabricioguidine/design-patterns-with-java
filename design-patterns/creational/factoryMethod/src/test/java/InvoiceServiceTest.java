import org.example.IService;
import org.example.ServiceFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for InvoiceService in the Factory Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Factory Method Pattern - Invoice Service Tests")
class InvoiceServiceTest {
    @Test
    @DisplayName("Should execute invoice payment")
    void shouldExecuteInvoicePayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Invoice");
        
        // Assert
        assertEquals("Payment by Bank Invoice.", service.execute());
    }
    
    @Test
    @DisplayName("Should cancel invoice payment")
    void shouldCancelInvoicePayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Invoice");
        
        // Assert
        assertEquals("Payment cancelled.", service.cancel());
    }
}

