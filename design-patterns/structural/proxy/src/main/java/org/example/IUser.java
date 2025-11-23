package org.example;

import java.util.List;

/**
 * User interface for the Proxy pattern.
 * 
 * @version 1.0
 */
public interface IUser {
    /**
     * Gets personal data of the user.
     * 
     * @return list containing name, city, and CPF
     */
    List<String> getPersonalData();
    
    /**
     * Gets contact information of the user (requires administrator access).
     * 
     * @param administrator the administrator requesting the data
     * @return list containing phone and email
     */
    List<String> getContacts(Administrator administrator);
}

