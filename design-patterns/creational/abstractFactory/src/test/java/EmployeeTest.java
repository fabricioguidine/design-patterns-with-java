import org.example.AbstractFactory;
import org.example.Employee;
import org.example.InternalEmployeeFactory;
import org.example.OutsourcedEmployeeFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Abstract Factory pattern implementation.
 * Tests verify that the factory correctly creates families of related objects
 * for different employee types (internal and outsourced).
 * * @version 1.0
 */
@DisplayName("Abstract Factory Pattern Tests")
class EmployeeTest {
    
    @Test
    @DisplayName("Should create payroll for internal employee")
    void shouldCreatePayrollForInternalEmployee() {
        // Arrange
        AbstractFactory factory = new InternalEmployeeFactory();
        Employee employee = new Employee(factory);
        
        // Act
        String result = employee.generatePayroll();
        
        // Assert
        assertEquals("Payroll for Employee: Internal.", result);
    }
    
    @Test
    @DisplayName("Should create payroll for outsourced employee")
    void shouldCreatePayrollForOutsourcedEmployee() {
        // Arrange
        AbstractFactory factory = new OutsourcedEmployeeFactory();
        Employee employee = new Employee(factory);
        
        // Act
        String result = employee.generatePayroll();
        
        // Assert
        assertEquals("Payroll for Employee: Outsourced.", result);
    }
    
    @Test
    @DisplayName("Should create report for internal employee")
    void shouldCreateReportForInternalEmployee() {
        // Arrange
        AbstractFactory factory = new InternalEmployeeFactory();
        Employee employee = new Employee(factory);
        
        // Act
        String result = employee.generateReport();
        
        // Assert
        assertEquals("Report for Employee: Internal.", result);
    }
    
    @Test
    @DisplayName("Should create report for outsourced employee")
    void shouldCreateReportForOutsourcedEmployee() {
        // Arrange
        AbstractFactory factory = new OutsourcedEmployeeFactory();
        Employee employee = new Employee(factory);
        
        // Act
        String result = employee.generateReport();
        
        // Assert
        assertEquals("Report for Employee: Outsourced.", result);
    }
    
    @Test
    @DisplayName("Should throw exception when factory is null")
    void shouldThrowExceptionWhenFactoryIsNull() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(null);
        });
    }
    
    @Test
    @DisplayName("Should ensure factory creates compatible product families")
    void shouldEnsureFactoryCreatesCompatibleProductFamilies() {
        // Arrange
        AbstractFactory internalFactory = new InternalEmployeeFactory();
        AbstractFactory outsourcedFactory = new OutsourcedEmployeeFactory();
        
        Employee internalEmployee = new Employee(internalFactory);
        Employee outsourcedEmployee = new Employee(outsourcedFactory);
        
        // Act & Assert - Verify that each factory creates a consistent family
        assertTrue(internalEmployee.generatePayroll().contains("Internal"));
        assertTrue(internalEmployee.generateReport().contains("Internal"));
        
        assertTrue(outsourcedEmployee.generatePayroll().contains("Outsourced"));
        assertTrue(outsourcedEmployee.generateReport().contains("Outsourced"));
    }
    
    @Test
    @DisplayName("Should create different instances for each employee")
    void shouldCreateDifferentInstancesForEachEmployee() {
        // Arrange
        AbstractFactory factory1 = new InternalEmployeeFactory();
        AbstractFactory factory2 = new InternalEmployeeFactory();
        
        Employee employee1 = new Employee(factory1);
        Employee employee2 = new Employee(factory2);
        
        // Act
        String payroll1 = employee1.generatePayroll();
        String payroll2 = employee2.generatePayroll();
        
        // Assert
        assertEquals(payroll1, payroll2);
        assertNotSame(employee1, employee2);
    }
    
    @Test
    @DisplayName("Should create payroll and report independently")
    void shouldCreatePayrollAndReportIndependently() {
        // Arrange
        AbstractFactory factory = new InternalEmployeeFactory();
        
        // Act
        Payroll payroll = factory.createPayroll();
        Report report = factory.createReport();
        
        // Assert
        assertNotNull(payroll);
        assertNotNull(report);
        assertNotSame(payroll, report);
        assertTrue(payroll.generate().contains("Payroll"));
        assertTrue(report.generate().contains("Report"));
    }
}

