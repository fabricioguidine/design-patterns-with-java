import org.example.Druid;
import org.example.Dwarf;
import org.example.Elf;
import org.example.Human;
import org.example.Race;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Bridge pattern implementation - Druid class.
 * 
 * @version 1.0
 */
@DisplayName("Bridge Pattern - Druid Tests")
class DruidTest {

    @Test
    @DisplayName("Should calculate value for Druid with Dwarf race")
    void shouldCalculateValueForDruidWithDwarfRace() {
        // Arrange
        Race race = new Dwarf();
        Druid druid = new Druid(1000.0f);
        druid.setRace(race);
        
        // Act
        float result = druid.calculateValue();
        
        // Assert
        assertEquals(2000.0f, result, 0.1f);
    }

    @Test
    @DisplayName("Should calculate value for Druid with Elf race")
    void shouldCalculateValueForDruidWithElfRace() {
        // Arrange
        Race race = new Elf();
        Druid druid = new Druid(1000.0f);
        druid.setRace(race);
        
        // Act
        float result = druid.calculateValue();
        
        // Assert
        assertEquals(3000.0f, result, 0.1f);
    }

    @Test
    @DisplayName("Should calculate value for Druid with Human race")
    void shouldCalculateValueForDruidWithHumanRace() {
        // Arrange
        Race race = new Human();
        Druid druid = new Druid(1000.0f);
        druid.setRace(race);
        
        // Act
        float result = druid.calculateValue();
        
        // Assert
        assertEquals(6000.0f, result, 0.1f);
    }
}

