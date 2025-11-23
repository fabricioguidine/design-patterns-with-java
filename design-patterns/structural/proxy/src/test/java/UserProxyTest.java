import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Proxy pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Proxy Pattern Tests")
class UserProxyTest {
    @BeforeEach
    void setUp() {
        Database.addUser(new User("Peter", "Belo Horizonte", "12345678", "peter@example.com", "111-111-111-11"));
        Database.addUser(new User("Ana", "São Paulo", "87654321", "ana@example.com", "999-99-999-99"));
    }
    
    @Test
    @DisplayName("Should return user personal data")
    void shouldReturnUserPersonalData() {
        // Arrange
        UserProxy user = new UserProxy("111-111-111-11");
        
        // Act
        var result = user.getPersonalData();
        
        // Assert
        assertEquals(Arrays.asList("Peter", "Belo Horizonte", "111-111-111-11"), result);
    }
    
    @Test
    @DisplayName("Should return user contacts")
    void shouldReturnUserContacts() {
        // Arrange
        Administrator admin = new Administrator("admin@example.com", true);
        UserProxy user = new UserProxy("999-99-999-99");
        
        // Act
        var result = user.getContacts(admin);
        
        // Assert
        assertEquals(Arrays.asList("87654321", "ana@example.com"), result);
    }
    
    @Test
    @DisplayName("Should throw exception for administrator without validation")
    void shouldThrowExceptionForAdministratorWithoutValidation() {
        // Arrange
        Administrator admin = new Administrator("admin@example.com", false);
        UserProxy user = new UserProxy("111-111-111-11");

        // Act & Assert
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> user.getContacts(admin)
        );
        assertEquals("Login not performed.", exception.getMessage());
    }
}

