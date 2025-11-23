package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Library that uses the Flyweight pattern to share supplier instances.
 * 
 * @version 1.0
 */
public class Library {
    private List<Book> inventory = new ArrayList<>();

    /**
     * Lists all books in the inventory.
     * 
     * @return list of book details
     */
    public List<String> listInventory() {
        List<String> bookDetails = new ArrayList<>();
        for (Book book : this.inventory) {
            bookDetails.add(book.getDetails());
        }
        return bookDetails;
    }

    /**
     * Registers a book in the library, reusing supplier instances when possible.
     * 
     * @param bookName the book name
     * @param price the book price
     * @param supplierName the supplier name
     * @param supplierCity the supplier city
     * @param supplierState the supplier state
     */
    public void registerBook(String bookName, Float price, String supplierName, String supplierCity, String supplierState) {
        Supplier supplier = SupplierFactory.getSupplier(supplierName, supplierCity, supplierState);
        Book book = new Book(bookName, price, supplier);
        inventory.add(book);
    }
}

