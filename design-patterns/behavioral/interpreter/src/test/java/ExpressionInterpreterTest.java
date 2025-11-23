import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Interpreter pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Interpreter Pattern Tests")
class ExpressionInterpreterTest {

    @Test
    @DisplayName("Should calculate addition expression")
    void shouldCalculateAdditionExpression() {
        // Arrange & Act
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("5 + 10");
        
        // Assert
        assertEquals(15.0, interpreter.interpret());
    }

    @Test
    @DisplayName("Should calculate subtraction expression")
    void shouldCalculateSubtractionExpression() {
        // Arrange & Act
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("10 - 5");
        
        // Assert
        assertEquals(5.0, interpreter.interpret());
    }

    @Test
    @DisplayName("Should calculate multiplication expression")
    void shouldCalculateMultiplicationExpression() {
        // Arrange & Act
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("2 * 3 * 4");
        
        // Assert
        assertEquals(24.0, interpreter.interpret());
    }

    @Test
    @DisplayName("Should calculate division expression")
    void shouldCalculateDivisionExpression() {
        // Arrange & Act
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("20 / 5");
        
        // Assert
        assertEquals(4.0, interpreter.interpret());
    }

    @Test
    @DisplayName("Should calculate combined expression")
    void shouldCalculateCombinedExpression() {
        // Arrange & Act
        ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("8 / 2 * 3 + 1 - 2");
        
        // Assert
        assertEquals(11.0, interpreter.interpret());
    }

    @Test
    @DisplayName("Should throw exception for invalid element")
    void shouldThrowExceptionForInvalidElement() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> {
                ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("5 ^ 2");
                interpreter.interpret();
            }
        );
        assertEquals("Expression contains invalid element", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception for invalid expression")
    void shouldThrowExceptionForInvalidExpression() {
        // Arrange & Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> {
                ExpressionInterpreter interpreter = new ArithmeticExpressionInterpreter("2 +");
                interpreter.interpret();
            }
        );
        assertEquals("Invalid expression", exception.getMessage());
    }
    
    @Test
    @DisplayName("Should throw exception for null expression")
    void shouldThrowExceptionForNullExpression() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new ArithmeticExpressionInterpreter(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception for empty expression")
    void shouldThrowExceptionForEmptyExpression() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new ArithmeticExpressionInterpreter("");
        });
    }
}

