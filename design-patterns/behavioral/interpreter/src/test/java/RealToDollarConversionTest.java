import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for Real to Dollar conversion.
 * 
 * @version 1.0
 */
@DisplayName("Real to Dollar Conversion Tests")
class RealToDollarConversionTest {

    @Test
    @DisplayName("Should return converted value")
    void shouldReturnConvertedValue() {
        // Arrange
        RealToDollarConversion conversion = new RealToDollarConversion();
        conversion.setValue(4.90);
        conversion.setRate(0.1);

        // Act
        double result = conversion.calculateValue();
        
        // Assert
        assertEquals(0.96, Math.round(result * 100.0) / 100.0);
    }
}

