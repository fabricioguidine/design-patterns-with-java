import org.example.Student;
import org.example.Scholarship;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Observer pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Observer Pattern Tests")
class StudentTest {

    @Test
    @DisplayName("Should notify one student")
    void shouldNotifyOneStudent() {
        // Arrange
        Scholarship scholarship = new Scholarship("Undergraduate", 1000.0F, 1);
        Student student = new Student("John");
        
        // Act
        student.apply(scholarship);
        scholarship.publishResults();
        
        // Assert
        assertEquals("John, application updated for: Scholarship{course='Undergraduate', value=1000.0, quantity=1}", 
            student.getLastNotification());
    }

    @Test
    @DisplayName("Should notify multiple students")
    void shouldNotifyMultipleStudents() {
        // Arrange
        Scholarship scholarship = new Scholarship("Graduate", 1500.0F, 2);
        Student student1 = new Student("Peter");
        Student student2 = new Student("Mary");
        
        // Act
        student1.apply(scholarship);
        student2.apply(scholarship);
        scholarship.publishResults();
        
        // Assert
        assertEquals("Peter, application updated for: Scholarship{course='Graduate', value=1500.0, quantity=2}", 
            student1.getLastNotification());
        assertEquals("Mary, application updated for: Scholarship{course='Graduate', value=1500.0, quantity=2}", 
            student2.getLastNotification());
    }

    @Test
    @DisplayName("Should not notify student who did not apply")
    void shouldNotNotifyStudentWhoDidNotApply() {
        // Arrange
        Scholarship scholarship = new Scholarship("Undergraduate", 1000.0F, 1);
        Student student = new Student("John");
        
        // Act
        scholarship.publishResults();
        
        // Assert
        assertNull(student.getLastNotification());
    }

    @Test
    @DisplayName("Should notify students for specific scholarship only")
    void shouldNotifyStudentsForSpecificScholarshipOnly() {
        // Arrange
        Scholarship scholarship1 = new Scholarship("Undergraduate", 1000.0F, 1);
        Scholarship scholarship2 = new Scholarship("Graduate", 1500.0F, 2);
        Student student1 = new Student("John");
        Student student2 = new Student("Peter");
        
        // Act
        student1.apply(scholarship1);
        student2.apply(scholarship2);
        scholarship1.publishResults();
        
        // Assert
        assertEquals("John, application updated for: Scholarship{course='Undergraduate', value=1000.0, quantity=1}", 
            student1.getLastNotification());
        assertNull(student2.getLastNotification());
    }
}

