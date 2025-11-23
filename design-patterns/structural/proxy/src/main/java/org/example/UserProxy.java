package org.example;

import java.util.List;

/**
 * Proxy implementation for User that controls access and lazy loading.
 * 
 * @version 1.0
 */
public class UserProxy implements IUser {
    private User user;
    private String cpf;

    /**
     * Constructs a UserProxy with the given CPF.
     * 
     * @param cpf the user's CPF
     */
    public UserProxy(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF cannot be null or empty");
        }
        this.cpf = cpf;
    }

    @Override
    public List<String> getPersonalData() {
        if (this.user == null) {
            this.user = new User(this.cpf);
        }
        return this.user.getPersonalData();
    }

    @Override
    public List<String> getContacts(Administrator administrator) {
        if (administrator == null) {
            throw new IllegalArgumentException("Administrator cannot be null");
        }
        if (!administrator.isValid()) {
            throw new IllegalArgumentException("Login not performed.");
        }
        if (this.user == null) {
            this.user = new User(this.cpf);
        }
        return this.user.getContacts(administrator);
    }
}

