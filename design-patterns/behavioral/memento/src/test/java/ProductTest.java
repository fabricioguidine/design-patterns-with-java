import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Memento pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Memento Pattern Tests")
class ProductTest {

    @Test
    @DisplayName("Should store states")
    void shouldStoreStates() {
        // Arrange
        Product product = new Product();
        
        // Act
        product.setState(InStockState.getInstance());
        product.setState(SoldState.getInstance());
        
        // Assert
        assertEquals(2, product.getStates().size());
    }

    @Test
    @DisplayName("Should return initial state")
    void shouldReturnInitialState() {
        // Arrange
        Product product = new Product();
        product.setState(InStockState.getInstance());
        product.setState(SoldState.getInstance());
        
        // Act
        product.restoreState(0);
        
        // Assert
        assertEquals(InStockState.getInstance(), product.getState());
    }

    @Test
    @DisplayName("Should return previous state")
    void shouldReturnPreviousState() {
        // Arrange
        Product product = new Product();
        product.setState(InStockState.getInstance());
        product.setState(OutOfStockState.getInstance());
        product.setState(InStockState.getInstance());
        product.setState(SoldState.getInstance());
        
        // Act
        product.restoreState(2);
        
        // Assert
        assertEquals(InStockState.getInstance(), product.getState());
    }

    @Test
    @DisplayName("Should throw exception for invalid index")
    void shouldThrowExceptionForInvalidIndex() {
        // Arrange
        Product product = new Product();
        
        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> product.restoreState(0)
        );
        assertEquals("Invalid index", exception.getMessage());
    }
    
    @Test
    @DisplayName("Should throw exception for null state")
    void shouldThrowExceptionForNullState() {
        // Arrange
        Product product = new Product();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            product.setState(null);
        });
    }
}

