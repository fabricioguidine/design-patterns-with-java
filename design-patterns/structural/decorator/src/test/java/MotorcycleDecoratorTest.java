import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Decorator pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Decorator Pattern Tests")
class MotorcycleDecoratorTest {
    
    @Test
    @DisplayName("Should decorate motorcycle with chest")
    void shouldDecorateMotorcycleWithChest() {
        // Arrange
        Motorcycle honda = new Honda(10000);
        Motorcycle decorated = new Chest(honda);
        
        // Act
        float price = decorated.getPrice();
        String custom = decorated.getCustom();
        
        // Assert
        assertEquals(12000, price);
        assertEquals("Honda, Chest", custom);
    }
    
    @Test
    @DisplayName("Should chain multiple decorators")
    void shouldChainMultipleDecorators() {
        // Arrange
        Motorcycle honda = new Honda(10000);
        Motorcycle withChest = new Chest(honda);
        Motorcycle withDoubleChest = new Chest(withChest);
        
        // Act
        float price = withDoubleChest.getPrice();
        String custom = withDoubleChest.getCustom();
        
        // Assert
        assertEquals(14000, price);
        assertEquals("Honda, Chest, Chest", custom);
    }
    
    @Test
    @DisplayName("Should throw exception when decorating null motorcycle")
    void shouldThrowExceptionWhenDecoratingNullMotorcycle() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Chest(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception for negative price")
    void shouldThrowExceptionForNegativePrice() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Honda(-100);
        });
    }
    
    @Test
    @DisplayName("Should return base price for undecorated motorcycle")
    void shouldReturnBasePriceForUndecoratedMotorcycle() {
        // Arrange
        Motorcycle honda = new Honda(10000);
        
        // Act
        float price = honda.getPrice();
        String custom = honda.getCustom();
        
        // Assert
        assertEquals(10000, price);
        assertEquals("Honda", custom);
    }
    
    @Test
    @DisplayName("Should return zero price for default Honda")
    void shouldReturnZeroPriceForDefaultHonda() {
        // Arrange
        Motorcycle honda = new Honda();
        
        // Act
        float price = honda.getPrice();
        
        // Assert
        assertEquals(0, price);
    }
}

