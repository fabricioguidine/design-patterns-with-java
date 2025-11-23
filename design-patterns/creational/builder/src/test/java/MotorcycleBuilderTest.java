import org.example.MotorcycleBuilder;
import org.example.Motorcycle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Builder pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Builder Pattern Tests")
class MotorcycleBuilderTest {
    
    @Test
    @DisplayName("Should throw exception when brand is missing")
    void shouldThrowExceptionWhenBrandIsMissing() {
        // Arrange & Act & Assert
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> motorcycleBuilder
                .setModel("fan")
                .setYear(2011)
                .build()
        );
        assertEquals("Invalid brand.", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception when model is missing")
    void shouldThrowExceptionWhenModelIsMissing() {
        // Arrange & Act & Assert
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> motorcycleBuilder
                .setBrand("honda")
                .setYear(2011)
                .build()
        );
        assertEquals("Invalid model.", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception when year is missing")
    void shouldThrowExceptionWhenYearIsMissing() {
        // Arrange & Act & Assert
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> motorcycleBuilder
                .setBrand("honda")
                .setModel("fan")
                .build()
        );
        assertEquals("Invalid year.", exception.getMessage());
    }

    @Test
    @DisplayName("Should build valid motorcycle")
    void shouldBuildValidMotorcycle() {
        // Arrange
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        
        // Act
        Motorcycle motorcycle = motorcycleBuilder
            .setBrand("honda")
            .setModel("fan")
            .setYear(2011)
            .build();
        
        // Assert
        assertNotNull(motorcycle);
        assertEquals("honda", motorcycle.getBrand());
        assertEquals("fan", motorcycle.getModel());
        assertEquals(2011, motorcycle.getYear());
    }
    
    @Test
    @DisplayName("Should build motorcycle with all optional fields")
    void shouldBuildMotorcycleWithAllOptionalFields() {
        // Arrange
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        
        // Act
        Motorcycle motorcycle = motorcycleBuilder
            .setBrand("honda")
            .setModel("fan")
            .setYear(2011)
            .setColor("red")
            .setDisplacement("125cc")
            .setPower("10hp")
            .setPrice(5000.0f)
            .build();
        
        // Assert
        assertNotNull(motorcycle);
        assertEquals("red", motorcycle.getColor());
        assertEquals("125cc", motorcycle.getDisplacement());
        assertEquals("10hp", motorcycle.getPower());
        assertEquals(5000.0f, motorcycle.getPrice());
    }
}

