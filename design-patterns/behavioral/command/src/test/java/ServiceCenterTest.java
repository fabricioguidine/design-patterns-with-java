import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Command pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Command Pattern Tests")
class ServiceCenterTest {

    @Test
    @DisplayName("Should execute open ticket task")
    void shouldExecuteOpenTicketTask() {
        // Arrange
        ServiceCenter serviceCenter = new ServiceCenter();
        Ticket ticket = new Ticket(1, "Issue", "John Doe");
        Task task = new OpenTicketTask(ticket);
        
        // Act
        serviceCenter.executeTask(task);
        
        // Assert
        assertEquals("Complaint opened", ticket.getStatus());
    }

    @Test
    @DisplayName("Should execute close ticket task")
    void shouldExecuteCloseTicketTask() {
        // Arrange
        ServiceCenter serviceCenter = new ServiceCenter();
        Ticket ticket = new Ticket(1, "Issue", "John Doe");
        Task task = new CloseTicketTask(ticket);
        
        // Act
        serviceCenter.executeTask(task);
        
        // Assert
        assertEquals("Complaint closed", ticket.getStatus());
    }

    @Test
    @DisplayName("Should cancel last complaint")
    void shouldCancelLastComplaint() {
        // Arrange
        ServiceCenter serviceCenter = new ServiceCenter();
        Ticket ticket = new Ticket(1, "Issue", "John Doe");
        Task openTask = new OpenTicketTask(ticket);
        
        // Act
        serviceCenter.executeTask(openTask);
        assertEquals("Complaint opened", ticket.getStatus());
        serviceCenter.cancelLastComplaint();
        
        // Assert
        assertEquals("Complaint closed", ticket.getStatus());
    }

    @Test
    @DisplayName("Should throw exception when task is null")
    void shouldThrowExceptionWhenTaskIsNull() {
        // Arrange
        ServiceCenter serviceCenter = new ServiceCenter();
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            serviceCenter.executeTask(null);
        });
    }
}

