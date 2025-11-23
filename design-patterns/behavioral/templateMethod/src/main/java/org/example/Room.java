package org.example;

/**
 * Abstract base class for rooms implementing the Template Method pattern.
 * 
 * @version 1.0
 */
public abstract class Room {
    private String number;
    private Boolean occupied;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    /**
     * Gets the time/duration for this room type.
     * 
     * @return the time value
     */
    public abstract Double getTime();

    /**
     * Gets the type of room.
     * 
     * @return the room type
     */
    public abstract String getType();

    /**
     * Gets information about the room.
     * 
     * @return formatted room information
     */
    public String getInfo() {
        return "{\n" +
                "   number: " + getNumber() + ",\n" +
                "   time: " + getTime() + ",\n" +
                "   type: " + getType() + "\n" +
                "}";
    }

    /**
     * Simulates the stay duration for a given number of days.
     * 
     * @param days the number of days
     * @return the calculated stay duration
     */
    public Double simulateStay(Integer days) {
        if (days == null || days < 0) {
            throw new IllegalArgumentException("Days cannot be null or negative");
        }
        return days * getTime();
    }
}

