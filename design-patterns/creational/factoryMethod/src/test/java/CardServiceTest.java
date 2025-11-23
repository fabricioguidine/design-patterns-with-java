import org.example.IService;
import org.example.ServiceFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for CardService in the Factory Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Factory Method Pattern - Card Service Tests")
class CardServiceTest {
    @Test
    @DisplayName("Should execute card payment")
    void shouldExecuteCardPayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Card");
        
        // Assert
        assertEquals("Payment by Credit Card.", service.execute());
    }
    
    @Test
    @DisplayName("Should cancel card payment")
    void shouldCancelCardPayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Card");
        
        // Assert
        assertEquals("Payment cancelled.", service.cancel());
    }
}

