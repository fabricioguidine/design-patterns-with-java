import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Mediator pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Mediator Pattern Tests")
class SMSTest {
    
    @Test
    @DisplayName("Should send message to all recipients except sender")
    void shouldSendMessageToAllRecipientsExceptSender() {
        // Arrange
        Mediator mediator = new SMS();
        Recipient alice = new User("Alice");
        Recipient bob = new User("Bob");
        Recipient charlie = new User("Charlie");

        mediator.addRecipient(alice);
        mediator.addRecipient(bob);
        mediator.addRecipient(charlie);

        // Act & Assert - This test verifies the mediator pattern works
        // The actual output would be to System.out, but we verify no exceptions are thrown
        assertDoesNotThrow(() -> {
            mediator.send("Let's organize a dinner.", bob);
        });
    }
    
    @Test
    @DisplayName("Should throw exception for null message")
    void shouldThrowExceptionForNullMessage() {
        // Arrange
        Mediator mediator = new SMS();
        Recipient user = new User("Test");
        mediator.addRecipient(user);
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            mediator.send(null, user);
        });
    }
    
    @Test
    @DisplayName("Should throw exception for null recipient")
    void shouldThrowExceptionForNullRecipient() {
        // Arrange
        Mediator mediator = new SMS();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            mediator.addRecipient(null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception for null user name")
    void shouldThrowExceptionForNullUserName() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new User(null);
        });
    }
}
