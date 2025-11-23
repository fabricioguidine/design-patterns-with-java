import org.example.IService;
import org.example.ServiceFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for PixService in the Factory Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Factory Method Pattern - Pix Service Tests")
class PixServiceTest {
    @Test
    @DisplayName("Should execute Pix payment")
    void shouldExecutePixPayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Pix");
        
        // Assert
        assertEquals("Payment by Pix.", service.execute());
    }
    
    @Test
    @DisplayName("Should cancel Pix payment")
    void shouldCancelPixPayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Pix");
        
        // Assert
        assertEquals("Payment cancelled.", service.cancel());
    }
}

