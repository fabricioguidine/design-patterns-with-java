import org.example.Library;
import org.example.SupplierFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test suite for the Flyweight pattern implementation.
 * 
 * @version 1.0
 */
@DisplayName("Flyweight Pattern Tests")
class LibraryTest {

    @Test
    @DisplayName("Should return inventory")
    void shouldReturnInventory() {
        // Arrange
        Library library = new Library();
        library.registerBook("The Death of Ivan Ilyich", 1.9f, "Penguin", "New York", "NY");
        library.registerBook("The Gay Science", 9.9f, "Penguin", "New York", "NY");
        library.registerBook("Leviathan", 3.88f, "HarperCollins", "New York", "NY");
        library.registerBook("Capital", 1600.0f, "Oxford", "Oxford", "UK");

        // Act
        List<String> result = library.listInventory();

        // Assert
        List<String> expected = Arrays.asList(
                "Book{name=The Death of Ivan Ilyich, price=$1.9, supplierName=Penguin, supplierCity=New York, supplierState=NY}",
                "Book{name=The Gay Science, price=$9.9, supplierName=Penguin, supplierCity=New York, supplierState=NY}",
                "Book{name=Leviathan, price=$3.88, supplierName=HarperCollins, supplierCity=New York, supplierState=NY}",
                "Book{name=Capital, price=$1600.0, supplierName=Oxford, supplierCity=Oxford, supplierState=UK}"
        );

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Should return supplier count")
    void shouldReturnSupplierCount() {
        // Arrange
        Library library = new Library();
        library.registerBook("The Death of Ivan Ilyich", 1.9f, "Penguin", "New York", "NY");
        library.registerBook("The Gay Science", 9.9f, "Penguin", "New York", "NY");
        library.registerBook("Leviathan", 3.88f, "HarperCollins", "New York", "NY");
        library.registerBook("Capital", 1600.0f, "Oxford", "Oxford", "UK");

        // Act
        int count = SupplierFactory.getSupplierCount();

        // Assert
        assertEquals(3, count);
    }
}

