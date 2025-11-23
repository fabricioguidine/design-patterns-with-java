package org.example;

/**
 * Represents an administrator in the Proxy pattern.
 * 
 * @version 1.0
 */
public class Administrator {
    private String login;
    private boolean valid;

    /**
     * Constructs an Administrator with the given login and validation status.
     * 
     * @param login the administrator login
     * @param valid whether the administrator is valid/authenticated
     */
    public Administrator(String login, boolean valid) {
        if (login == null || login.trim().isEmpty()) {
            throw new IllegalArgumentException("Login cannot be null or empty");
        }
        this.login = login;
        this.valid = valid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null || login.trim().isEmpty()) {
            throw new IllegalArgumentException("Login cannot be null or empty");
        }
        this.login = login;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}

