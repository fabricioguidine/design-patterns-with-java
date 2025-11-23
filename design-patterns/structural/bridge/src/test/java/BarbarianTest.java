import org.example.Barbarian;
import org.example.CharacterClass;
import org.example.Dwarf;
import org.example.Elf;
import org.example.Human;
import org.example.Race;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Bridge pattern implementation - Barbarian class.
 * 
 * @version 1.0
 */
@DisplayName("Bridge Pattern - Barbarian Tests")
class BarbarianTest {

    @Test
    @DisplayName("Should calculate value for Barbarian with Dwarf race")
    void shouldCalculateValueForBarbarianWithDwarfRace() {
        // Arrange
        Race race = new Dwarf();
        Barbarian barbarian = new Barbarian(1000.0f);
        barbarian.setRace(race);
        
        // Act
        float result = barbarian.calculateValue();
        
        // Assert
        assertEquals(2000.0f, result, 0.1f);
    }

    @Test
    @DisplayName("Should calculate value for Barbarian with Elf race")
    void shouldCalculateValueForBarbarianWithElfRace() {
        // Arrange
        Race race = new Elf();
        Barbarian barbarian = new Barbarian(1000.0f);
        barbarian.setRace(race);
        
        // Act
        float result = barbarian.calculateValue();
        
        // Assert
        assertEquals(3000.0f, result, 0.1f);
    }

    @Test
    @DisplayName("Should calculate value for Barbarian with Human race")
    void shouldCalculateValueForBarbarianWithHumanRace() {
        // Arrange
        Race race = new Human();
        Barbarian barbarian = new Barbarian(1000.0f);
        barbarian.setRace(race);
        
        // Act
        float result = barbarian.calculateValue();
        
        // Assert
        assertEquals(6000.0f, result, 0.1f);
    }
    
    @Test
    @DisplayName("Should allow changing race dynamically")
    void shouldAllowChangingRaceDynamically() {
        // Arrange
        Barbarian barbarian = new Barbarian(1000.0f);
        barbarian.setRace(new Dwarf());
        float value1 = barbarian.calculateValue();
        
        // Act
        barbarian.setRace(new Human());
        float value2 = barbarian.calculateValue();
        
        // Assert
        assertEquals(2000.0f, value1, 0.1f);
        assertEquals(6000.0f, value2, 0.1f);
        assertNotEquals(value1, value2);
    }
}

