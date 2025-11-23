import org.example.Cleric;
import org.example.Dwarf;
import org.example.Elf;
import org.example.Human;
import org.example.Race;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Bridge pattern implementation - Cleric class.
 * 
 * @version 1.0
 */
@DisplayName("Bridge Pattern - Cleric Tests")
class ClericTest {

    @Test
    @DisplayName("Should calculate value for Cleric with Dwarf race")
    void shouldCalculateValueForClericWithDwarfRace() {
        // Arrange
        Race race = new Dwarf();
        Cleric cleric = new Cleric(1000.0f);
        cleric.setRace(race);
        
        // Act
        float result = cleric.calculateValue();
        
        // Assert
        assertEquals(2000.0f, result, 0.1f);
    }

    @Test
    @DisplayName("Should calculate value for Cleric with Elf race")
    void shouldCalculateValueForClericWithElfRace() {
        // Arrange
        Race race = new Elf();
        Cleric cleric = new Cleric(1000.0f);
        cleric.setRace(race);
        
        // Act
        float result = cleric.calculateValue();
        
        // Assert
        assertEquals(3000.0f, result, 0.1f);
    }

    @Test
    @DisplayName("Should calculate value for Cleric with Human race")
    void shouldCalculateValueForClericWithHumanRace() {
        // Arrange
        Race race = new Human();
        Cleric cleric = new Cleric(1000.0f);
        cleric.setRace(race);
        
        // Act
        float result = cleric.calculateValue();
        
        // Assert
        assertEquals(6000.0f, result, 0.1f);
    }
}

