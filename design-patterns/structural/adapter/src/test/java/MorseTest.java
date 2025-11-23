import org.example.Morse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Adapter pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Adapter Pattern Tests")
class MorseTest {

    @Test
    @DisplayName("Should return Morse code for zero")
    void shouldReturnMorseCodeForZero() {
        // Arrange
        Morse morse = new Morse();
        
        // Act
        morse.setNumber("-----");
        String result = morse.getNumber();
        
        // Assert
        assertEquals("-----", result);
    }

    @Test
    @DisplayName("Should convert integer to Morse code")
    void shouldConvertIntegerToMorseCode() {
        // Arrange
        Morse morse = new Morse();
        
        // Act
        morse.setNumber("5");
        String result = morse.getNumber();
        
        // Assert
        assertEquals("-----", result);
    }
    
    @Test
    @DisplayName("Should convert Morse code to integer")
    void shouldConvertMorseCodeToInteger() {
        // Arrange
        Morse morse = new Morse();
        
        // Act
        morse.setNumber("-----");
        int result = morse.getNum();
        
        // Assert
        assertEquals(0, result);
    }
    
    @Test
    @DisplayName("Should handle different Morse code values")
    void shouldHandleDifferentMorseCodeValues() {
        // Arrange
        Morse morse = new Morse();
        
        // Act & Assert
        morse.setNumber(".----");
        assertEquals(1, morse.getNum());
        
        morse.setNumber("..---");
        assertEquals(2, morse.getNum());
        
        morse.setNumber("...--");
        assertEquals(3, morse.getNum());
    }
}
