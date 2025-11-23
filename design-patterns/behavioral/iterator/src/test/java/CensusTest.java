import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Iterator pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Iterator Pattern Tests")
class CensusTest {

    @Test
    @DisplayName("Should count active collaborators in department")
    void shouldCountActiveCollaboratorsInDepartment() {
        // Arrange
        Department department = new Department(
            new Collaborator("John 1", true),
            new Collaborator("John 2", false),
            new Collaborator("John 3", false),
            new Collaborator("John 4", true)
        );
        
        // Act
        int result = Census.countActiveCollaboratorsInDepartment(department);
        
        // Assert
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Should count total collaborators in department")
    void shouldCountTotalCollaboratorsInDepartment() {
        // Arrange
        Department department = new Department(
            new Collaborator("John 1", true),
            new Collaborator("John 2", false),
            new Collaborator("John 3", false),
            new Collaborator("John 4", false)
        );
        
        // Act
        int result = Census.countTotalCollaboratorsInDepartment(department);
        
        // Assert
        assertEquals(4, result);
    }
    
    @Test
    @DisplayName("Should return zero for null department")
    void shouldReturnZeroForNullDepartment() {
        // Act
        int activeCount = Census.countActiveCollaboratorsInDepartment(null);
        int totalCount = Census.countTotalCollaboratorsInDepartment(null);
        
        // Assert
        assertEquals(0, activeCount);
        assertEquals(0, totalCount);
    }
}

