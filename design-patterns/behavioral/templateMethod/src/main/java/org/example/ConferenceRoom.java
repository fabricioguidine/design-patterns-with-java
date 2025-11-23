package org.example;

/**
 * Conference room implementation of the Template Method pattern.
 * 
 * @version 1.0
 */
public class ConferenceRoom extends Room {
    @Override
    public Double getTime() {
        return 2.0;
    }

    @Override
    public String getType() {
        return "Conference Room";
    }
}

