package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Chain of Responsibility pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Chain of Responsibility Pattern Tests")
class ProcedureTest {
    FinancialDepartment financial;
    AdministrativeDepartment administrative;
    TechnicalSupportDepartment technical;
    Attendant attendant;

    @BeforeEach
    void setUp() {
        administrative = new AdministrativeDepartment(null);
        financial = new FinancialDepartment(administrative);
        technical = new TechnicalSupportDepartment(financial);
        attendant = new Attendant(technical);
    }

    @Test
    @DisplayName("Should return Attendant for new client registration")
    void shouldReturnAttendantForNewClientRegistration() {
        // Arrange & Act
        String result = attendant.registerProcedure(
            new ServiceOrder(RegistrationServiceOrderCreation.getRegistrationProcedure())
        );
        
        // Assert
        assertEquals("Attendant", result);
    }

    @Test
    @DisplayName("Should return Technical Support for ticket opening")
    void shouldReturnTechnicalSupportForTicketOpening() {
        // Arrange & Act
        String result = attendant.registerProcedure(
            new ServiceOrder(TicketServiceOrderCreation.getTicketProcedure())
        );
        
        // Assert
        assertEquals("Technical Support", result);
    }

    @Test
    @DisplayName("Should return Financial for invoice")
    void shouldReturnFinancialForInvoice() {
        // Arrange & Act
        String result = attendant.registerProcedure(
            new ServiceOrder(InvoiceServiceOrderCreation.getInvoiceProcedure())
        );
        
        // Assert
        assertEquals("Financial", result);
    }

    @Test
    @DisplayName("Should return Administrative for cancellation")
    void shouldReturnAdministrativeForCancellation() {
        // Arrange & Act
        String result = attendant.registerProcedure(
            new ServiceOrder(CancellationServiceOrderCreation.getCancellationProcedure())
        );
        
        // Assert
        assertEquals("Administrative", result);
    }
    
    @Test
    @DisplayName("Should return No Procedure for null service order")
    void shouldReturnNoProcedureForNullServiceOrder() {
        // Arrange & Act
        String result = attendant.registerProcedure(null);
        
        // Assert
        assertEquals("No Procedure", result);
    }
}

