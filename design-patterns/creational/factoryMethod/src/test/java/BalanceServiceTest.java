import org.example.IService;
import org.example.ServiceFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for BalanceService in the Factory Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Factory Method Pattern - Balance Service Tests")
class BalanceServiceTest {
    @Test
    @DisplayName("Should execute balance payment")
    void shouldExecuteBalancePayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Balance");
        
        // Assert
        assertEquals("Payment with account balance.", service.execute());
    }
    
    @Test
    @DisplayName("Should cancel balance payment")
    void shouldCancelBalancePayment() {
        // Arrange & Act
        IService service = ServiceFactory.getService("Balance");
        
        // Assert
        assertEquals("Payment cancelled.", service.cancel());
    }
}

