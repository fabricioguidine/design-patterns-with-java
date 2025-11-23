import org.example.Declaration;
import org.example.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Prototype pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Prototype Pattern Tests")
class EmployeeTest {
    @Test
    @DisplayName("Should clone employee with deep copy of declaration")
    void shouldCloneEmployeeWithDeepCopyOfDeclaration() throws CloneNotSupportedException {
        // Arrange
        Employee employee = new Employee(9999, "John Smith", new Declaration("New York", 1));

        // Act
        Employee employeeClone = employee.clone();
        employeeClone.setRegistrationNumber(999);
        employeeClone.setName("Cloned Employee");

        // Assert
        assertEquals("Employee{registrationNumber=9999, name='John Smith', declaration=Declaration{city='New York', registrationNumber=1}}", 
            employee.toString());
        assertEquals("Employee{registrationNumber=999, name='Cloned Employee', declaration=Declaration{city='New York', registrationNumber=1}}", 
            employeeClone.toString());
    }
    
    @Test
    @DisplayName("Should throw exception for null name")
    void shouldThrowExceptionForNullName() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(1, null, new Declaration("City", 1));
        });
    }
    
    @Test
    @DisplayName("Should throw exception for null declaration")
    void shouldThrowExceptionForNullDeclaration() {
        // Arrange & Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(1, "Name", null);
        });
    }
}

