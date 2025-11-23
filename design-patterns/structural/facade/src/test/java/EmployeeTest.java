import org.example.Training;
import org.example.Certificate;
import org.example.Manager;
import org.example.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Facade pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Facade Pattern Tests")
class EmployeeTest {
    @Test
    @DisplayName("Should return cleared employee")
    void shouldReturnClearedEmployee() {
        // Arrange
        Employee employee = new Employee();
        
        // Act & Assert
        assertEquals(true, employee.isCleared());
    }

    @Test
    @DisplayName("Should return false due to training")
    void shouldReturnFalseDueToTraining() {
        // Arrange
        Employee employee = new Employee();
        Training.getInstance().addEmployeeWithoutTraining(employee);
        
        // Act & Assert
        assertEquals(false, employee.isCleared());
    }

    @Test
    @DisplayName("Should return false due to manager")
    void shouldReturnFalseDueToManager() {
        // Arrange
        Employee employee = new Employee();
        Manager.getInstance().addEmployeeWithoutTraining(employee);
        
        // Act & Assert
        assertEquals(false, employee.isCleared());
    }

    @Test
    @DisplayName("Should return false due to certificate")
    void shouldReturnFalseDueToCertificate() {
        // Arrange
        Employee employee = new Employee();
        Certificate.getInstance().addEmployeeWithoutTraining(employee);
        
        // Act & Assert
        assertEquals(false, employee.isCleared());
    }

    @Test
    @DisplayName("Should throw correct exception")
    void shouldThrowCorrectException() {
        // Arrange & Act & Assert
        NullPointerException exception = assertThrows(
            NullPointerException.class,
            () -> Training.getInstance().addEmployeeWithoutTraining(null)
        );
        assertEquals("Employee cannot be null.", exception.getMessage());
    }
}

