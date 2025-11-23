package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Real user implementation in the Proxy pattern.
 * 
 * @version 1.0
 */
public class User implements IUser {
    private String name;
    private String city;
    private String phone;
    private String email;
    private String cpf;

    /**
     * Constructs a User by loading from database using CPF.
     * 
     * @param cpf the user's CPF
     */
    public User(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF cannot be null or empty");
        }
        this.cpf = cpf;
        User user = Database.getUser(cpf);
        if (user == null) {
            throw new IllegalArgumentException("User not found in database");
        }
        this.name = user.name;
        this.city = user.city;
        this.phone = user.phone;
        this.email = user.email;
        this.cpf = user.cpf;
    }

    /**
     * Constructs a User with all information.
     * 
     * @param name the user's name
     * @param city the user's city
     * @param phone the user's phone
     * @param email the user's email
     * @param cpf the user's CPF
     */
    public User(String name, String city, String phone, String email, String cpf) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone cannot be null or empty");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF cannot be null or empty");
        }
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public List<String> getPersonalData() {
        return Arrays.asList(this.name, this.city, this.cpf);
    }

    @Override
    public List<String> getContacts(Administrator administrator) {
        if (administrator == null) {
            throw new IllegalArgumentException("Administrator cannot be null");
        }
        return Arrays.asList(this.phone, this.email);
    }
}

