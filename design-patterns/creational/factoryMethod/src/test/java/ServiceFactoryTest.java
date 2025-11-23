import org.example.IService;
import org.example.ServiceFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for ServiceFactory in the Factory Method pattern.
 * 
 * @version 1.0
 */
@DisplayName("Factory Method Pattern - Service Factory Tests")
class ServiceFactoryTest {
    @Test
    @DisplayName("Should throw exception for non-existent service")
    void shouldThrowExceptionForNonExistentService() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> ServiceFactory.getService("Pi")
        );
        assertTrue(exception.getMessage().contains("Service does not exist"));
    }
    
    @Test
    @DisplayName("Should throw exception for null service name")
    void shouldThrowExceptionForNullServiceName() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            ServiceFactory.getService(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception for empty service name")
    void shouldThrowExceptionForEmptyServiceName() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            ServiceFactory.getService("");
        });
    }
}

