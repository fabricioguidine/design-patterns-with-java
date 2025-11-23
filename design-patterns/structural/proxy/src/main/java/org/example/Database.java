package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Database class for storing user information in the Proxy pattern.
 * 
 * @version 1.0
 */
public class Database {
    private static Map<String, User> users = new HashMap<>();
    
    /**
     * Gets a user by CPF.
     * 
     * @param cpf the user's CPF
     * @return the user, or null if not found
     */
    public static User getUser(String cpf) {
        return users.get(cpf);
    }
    
    /**
     * Adds a user to the database.
     * 
     * @param user the user to add
     */
    public static void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        if (user.getCpf() == null || user.getCpf().trim().isEmpty()) {
            throw new IllegalArgumentException("User CPF cannot be null or empty");
        }
        users.put(user.getCpf(), user);
    }
}

