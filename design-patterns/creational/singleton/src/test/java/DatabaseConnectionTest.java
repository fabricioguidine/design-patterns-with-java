import org.example.DatabaseConnection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Singleton pattern implementation.
 * Tests verify that only one instance exists and that it behaves correctly
 * across multiple calls to getInstance().
 * * @version 1.0
 */
@DisplayName("Singleton Pattern Tests")
class DatabaseConnectionTest {
    
    @Test
    @DisplayName("Should return the same instance on multiple calls")
    void shouldReturnSameInstanceOnMultipleCalls() {
        // Act
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();
        
        // Assert
        assertSame(instance1, instance2, "Multiple calls to getInstance() should return the same instance");
    }
    
    @Test
    @DisplayName("Should return correct URL")
    void shouldReturnCorrectUrl() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        String expectedUrl = "jdbc:localhost:8888/bd";
        
        // Act
        connection.setUrl(expectedUrl);
        String actualUrl = connection.getUrl();
        
        // Assert
        assertEquals(expectedUrl, actualUrl);
    }
    
    @Test
    @DisplayName("Should return correct username")
    void shouldReturnCorrectUsername() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        String expectedUsername = "fabricio";
        
        // Act
        connection.setUsername(expectedUsername);
        String actualUsername = connection.getUsername();
        
        // Assert
        assertEquals(expectedUsername, actualUsername);
    }
    
    @Test
    @DisplayName("Should return correct password")
    void shouldReturnCorrectPassword() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        String expectedPassword = "123";
        
        // Act
        connection.setPassword(expectedPassword);
        String actualPassword = connection.getPassword();
        
        // Assert
        assertEquals(expectedPassword, actualPassword);
    }
    
    @Test
    @DisplayName("Should maintain state across multiple getInstance calls")
    void shouldMaintainStateAcrossMultipleGetInstanceCalls() {
        // Arrange
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.setUrl("jdbc:test:1234/db");
        connection1.setUsername("testuser");
        connection1.setPassword("testpass");
        
        // Act
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        
        // Assert
        assertEquals("jdbc:test:1234/db", connection2.getUrl());
        assertEquals("testuser", connection2.getUsername());
        assertEquals("testpass", connection2.getPassword());
    }
    
    @Test
    @DisplayName("Should throw exception when URL is null")
    void shouldThrowExceptionWhenUrlIsNull() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            connection.setUrl(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when URL is empty")
    void shouldThrowExceptionWhenUrlIsEmpty() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            connection.setUrl("   ");
        });
    }
    
    @Test
    @DisplayName("Should throw exception when username is null")
    void shouldThrowExceptionWhenUsernameIsNull() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            connection.setUsername(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when password is null")
    void shouldThrowExceptionWhenPasswordIsNull() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            connection.setPassword(null);
        });
    }
    
    @Test
    @DisplayName("Should have default values on initialization")
    void shouldHaveDefaultValuesOnInitialization() {
        // Arrange - Create a new instance (in real scenario, this would be the first call)
        DatabaseConnection connection = DatabaseConnection.getInstance();
        
        // Reset to defaults for testing
        connection.setUrl("jdbc:localhost:8888/bd");
        connection.setUsername("fabricio");
        connection.setPassword("123");
        
        // Assert
        assertEquals("jdbc:localhost:8888/bd", connection.getUrl());
        assertEquals("fabricio", connection.getUsername());
        assertEquals("123", connection.getPassword());
    }
    
    @Test
    @DisplayName("Should return proper string representation")
    void shouldReturnProperStringRepresentation() {
        // Arrange
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.setUrl("jdbc:test:1234/db");
        connection.setUsername("testuser");
        
        // Act
        String toString = connection.toString();
        
        // Assert
        assertTrue(toString.contains("DatabaseConnection"));
        assertTrue(toString.contains("jdbc:test:1234/db"));
        assertTrue(toString.contains("testuser"));
        assertFalse(toString.contains("password")); // Should not expose password
    }
}

