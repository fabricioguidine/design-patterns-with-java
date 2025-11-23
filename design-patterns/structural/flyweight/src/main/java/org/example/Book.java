package org.example;

/**
 * Represents a book in the Flyweight pattern.
 * 
 * @version 1.0
 */
public class Book {
    private String name;
    private Float price;
    private Supplier supplier;

    /**
     * Constructs a Book with the given information.
     * 
     * @param name the book name
     * @param price the book price
     * @param supplier the supplier (flyweight object)
     */
    public Book(String name, Float price, Supplier supplier) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price == null || price < 0) {
            throw new IllegalArgumentException("Price cannot be null or negative");
        }
        if (supplier == null) {
            throw new IllegalArgumentException("Supplier cannot be null");
        }
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    /**
     * Gets the book details including supplier information.
     * 
     * @return formatted book details
     */
    public String getDetails() {
        return "Book{" +
                "name=" + this.name +
                ", price=$" + this.price +
                ", supplierName=" + supplier.getName() +
                ", supplierCity=" + supplier.getCity() +
                ", supplierState=" + supplier.getState() +
                "}";
    }
}

