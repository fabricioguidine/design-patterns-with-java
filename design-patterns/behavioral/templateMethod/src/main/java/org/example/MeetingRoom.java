package org.example;

/**
 * Meeting room implementation of the Template Method pattern.
 * 
 * @version 1.0
 */
public class MeetingRoom extends Room {
    @Override
    public Double getTime() {
        return 2.0;
    }

    @Override
    public String getType() {
        return "Meeting Room";
    }
}

