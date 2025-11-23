package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory for creating and reusing Supplier instances in the Flyweight pattern.
 * 
 * @version 1.0
 */
public class SupplierFactory {
    private static Map<String, Supplier> suppliers = new HashMap<>();

    /**
     * Gets a supplier by name, creating it if it doesn't exist.
     * 
     * @param name the supplier name
     * @param city the supplier city
     * @param state the supplier state
     * @return the supplier instance
     */
    public static Supplier getSupplier(String name, String city, String state) {
        Supplier supplier = suppliers.get(name);
        if (supplier == null) {
            supplier = new Supplier(name, city, state);
            suppliers.put(name, supplier);
        }
        return supplier;
    }

    /**
     * Gets the total number of unique suppliers.
     * 
     * @return the number of suppliers
     */
    public static Integer getSupplierCount() {
        return suppliers.size();
    }
}

