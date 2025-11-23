package org.example;

/**
 * Command interface representing a task that can be executed and cancelled.
 * 
 * @version 1.0
 */
public interface Task {
    /**
     * Executes the task.
     */
    void execute();
    
    /**
     * Cancels the task.
     */
    void cancel();
}

