import org.example.FileManager;
import org.example.HTML;
import org.example.PDF;
import org.example.TXT;
import org.example.User;
import org.example.XML;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for the Strategy pattern implementation.
 * Tests verify that different file saving strategies work correctly
 * and can be used interchangeably.
 * * @version 1.0
 */
@DisplayName("Strategy Pattern Tests")
class UserTest {
    
    private User user;
    private String fileName;
    
    @BeforeEach
    void setUp() {
        user = new User();
        fileName = "document";
    }
    
    @Test
    @DisplayName("Should save file in HTML format")
    void shouldSaveFileInHTMLFormat() {
        // Act
        String result = user.saveHTML(fileName);
        
        // Assert
        assertEquals("File saved with *.HTML extension!", result);
    }
    
    @Test
    @DisplayName("Should save file in PDF format")
    void shouldSaveFileInPDFFormat() {
        // Act
        String result = user.savePDF(fileName);
        
        // Assert
        assertEquals("File saved with *.PDF extension!", result);
    }
    
    @Test
    @DisplayName("Should save file in TXT format")
    void shouldSaveFileInTXTFormat() {
        // Act
        String result = user.saveTXT(fileName);
        
        // Assert
        assertEquals("File saved with *.TXT extension!", result);
    }
    
    @Test
    @DisplayName("Should save file in XML format")
    void shouldSaveFileInXMLFormat() {
        // Act
        String result = user.saveXML(fileName);
        
        // Assert
        assertEquals("File saved with *.XML extension!", result);
    }
    
    @Test
    @DisplayName("Should use different strategies interchangeably")
    void shouldUseDifferentStrategiesInterchangeably() {
        // Act
        String htmlResult = FileManager.save(new HTML(), fileName);
        String pdfResult = FileManager.save(new PDF(), fileName);
        String txtResult = FileManager.save(new TXT(), fileName);
        String xmlResult = FileManager.save(new XML(), fileName);
        
        // Assert
        assertTrue(htmlResult.contains("HTML"));
        assertTrue(pdfResult.contains("PDF"));
        assertTrue(txtResult.contains("TXT"));
        assertTrue(xmlResult.contains("XML"));
    }
    
    @Test
    @DisplayName("Should throw exception when strategy is null")
    void shouldThrowExceptionWhenStrategyIsNull() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            FileManager.save(null, fileName);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when file name is null")
    void shouldThrowExceptionWhenFileNameIsNull() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            FileManager.save(new PDF(), null);
        });
    }
    
    @Test
    @DisplayName("Should throw exception when file name is empty")
    void shouldThrowExceptionWhenFileNameIsEmpty() {
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            FileManager.save(new PDF(), "   ");
        });
    }
    
    @Test
    @DisplayName("Should create different strategy instances")
    void shouldCreateDifferentStrategyInstances() {
        // Act
        HTML html1 = new HTML();
        HTML html2 = new HTML();
        PDF pdf = new PDF();
        
        // Assert
        assertNotSame(html1, html2);
        assertNotSame(html1, pdf);
        assertEquals(html1.save("test"), html2.save("test"));
    }
    
    @Test
    @DisplayName("Should handle different file names correctly")
    void shouldHandleDifferentFileNamesCorrectly() {
        // Act
        String result1 = FileManager.save(new PDF(), "report");
        String result2 = FileManager.save(new PDF(), "invoice");
        
        // Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertEquals(result1, result2); // Same format, different names should produce same message
    }
}