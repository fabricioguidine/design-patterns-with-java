package org.example;

/**
 * Singleton pattern implementation for database connection.
 * Ensures that only one instance of the database connection exists throughout
 * the application lifecycle. This is useful for managing shared resources like
 * database connections, configuration objects, or logging services.
 * 
 * <p>This implementation uses eager initialization, where the instance is created
 * when the class is loaded. For thread-safe lazy initialization, consider using
 * double-checked locking or the Initialization-on-demand holder idiom.
 * * @version 1.0
 */
public class DatabaseConnection {
    
    // Database connection parameters
    private String url;
    private String username;
    private String password;
    
    // Singleton instance - eagerly initialized
    private static final DatabaseConnection instance = new DatabaseConnection();
    
    /**
     * Private constructor to prevent instantiation from outside the class.
     * Initializes default connection parameters.
     */
    private DatabaseConnection() {
        this.url = "jdbc:localhost:8888/bd";
        this.username = "fabricio";
        this.password = "123";
    }
    
    /**
     * Returns the singleton instance of DatabaseConnection.
     * This method provides global access to the single instance.
     * 
     * @return the singleton instance of DatabaseConnection
     */
    public static DatabaseConnection getInstance() {
        return instance;
    }
    
    /**
     * Gets the database URL.
     * 
     * @return the database URL
     */
    public String getUrl() {
        return url;
    }
    
    /**
     * Sets the database URL.
     * 
     * @param url the database URL to set
     * @throws IllegalArgumentException if url is null or empty
     */
    public void setUrl(String url) {
        if (url == null || url.trim().isEmpty()) {
            throw new IllegalArgumentException("URL cannot be null or empty");
        }
        this.url = url;
    }
    
    /**
     * Gets the database username.
     * 
     * @return the database username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Sets the database username.
     * 
     * @param username the database username to set
     * @throws IllegalArgumentException if username is null or empty
     */
    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;
    }
    
    /**
     * Gets the database password.
     * 
     * @return the database password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Sets the database password.
     * 
     * @param password the database password to set
     * @throws IllegalArgumentException if password is null
     */
    public void setPassword(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        this.password = password;
    }
    
    /**
     * Returns a string representation of the connection information
     * (without exposing sensitive data like password).
     * 
     * @return a string representation of the connection
     */
    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

