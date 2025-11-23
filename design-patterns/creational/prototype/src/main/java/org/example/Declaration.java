package org.example;

/**
 * Represents a declaration that can be cloned using the Prototype pattern.
 * 
 * @version 1.0
 */
public class Declaration implements Cloneable {
    private String city;
    private Integer registrationNumber;

    /**
     * Constructs a Declaration with the given city and registration number.
     * 
     * @param city the city
     * @param registrationNumber the registration number
     */
    public Declaration(String city, Integer registrationNumber) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }
        if (registrationNumber == null || registrationNumber < 0) {
            throw new IllegalArgumentException("Registration number cannot be null or negative");
        }
        this.city = city;
        this.registrationNumber = registrationNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty");
        }
        this.city = city;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        if (registrationNumber == null || registrationNumber < 0) {
            throw new IllegalArgumentException("Registration number cannot be null or negative");
        }
        this.registrationNumber = registrationNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Declaration{" +
                "city='" + city + '\'' +
                ", registrationNumber=" + registrationNumber +
                '}';
    }
}

