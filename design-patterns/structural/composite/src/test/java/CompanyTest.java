import org.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Composite pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Composite Pattern Tests")
class CompanyTest {
    
    @Test
    @DisplayName("Should return company employees hierarchy")
    void shouldReturnCompanyEmployeesHierarchy() {
        // Arrange
        Manager manager123 = new Manager("Alice Smith", "111.222.333-44", "HR Director");
        Collaborator collaborator789 = new Collaborator("John Smith", "222.333.444-55", "HR Analyst");
        Collaborator collaborator012 = new Collaborator("Mary Johnson", "333.444.555-66", "Recruitment Analyst");
        manager123.addSubordinate(collaborator789);
        manager123.addSubordinate(collaborator012);
        
        Manager manager456 = new Manager("Carl Williams", "444.555.666-77", "Communications Director");
        Manager manager789 = new Manager("Laura Brown", "555.666.777-88", "Marketing Director");
        Collaborator collaborator234 = new Collaborator("Robert Davis", "666.777.888-99", "Advertiser");
        Collaborator collaborator567 = new Collaborator("Mary Wilson", "777.888.999-00", "Social Media");
        manager789.addSubordinate(collaborator234);
        manager789.addSubordinate(collaborator567);
        manager456.addSubordinate(manager789);
        
        Manager ceo = new Manager("Peter Taylor", "888.999.000-11", "CEO");
        ceo.addSubordinate(manager123);
        ceo.addSubordinate(manager456);
        
        Company company = new Company();
        company.setEmployees(ceo);
        
        // Act
        String result = company.getEmployees();
        
        // Assert
        String expected = "Manager: Peter Taylor / CEO / 888.999.000-11\n" +
                "Manager: Alice Smith / HR Director / 111.222.333-44\n" +
                "Collaborator: John Smith / HR Analyst / 222.333.444-55\n" +
                "Collaborator: Mary Johnson / Recruitment Analyst / 333.444.555-66\n" +
                "Manager: Carl Williams / Communications Director / 444.555.666-77\n" +
                "Manager: Laura Brown / Marketing Director / 555.666.777-88\n" +
                "Collaborator: Robert Davis / Advertiser / 666.777.888-99\n" +
                "Collaborator: Mary Wilson / Social Media / 777.888.999-00\n";
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Should throw exception when company has no employees")
    void shouldThrowExceptionWhenCompanyHasNoEmployees() {
        // Arrange
        Company company = new Company();
        
        // Act & Assert
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            company.getEmployees();
        });
        assertEquals("No employees registered.", exception.getMessage());
    }
    
    @Test
    @DisplayName("Should throw exception when adding null subordinate")
    void shouldThrowExceptionWhenAddingNullSubordinate() {
        // Arrange
        Manager manager = new Manager("Test Manager", "123", "Manager");
        
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            manager.addSubordinate(null);
        });
    }
}

