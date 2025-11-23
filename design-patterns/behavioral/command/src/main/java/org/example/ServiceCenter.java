package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Service center that manages and executes tasks using the Command pattern.
 * 
 * @version 1.0
 */
public class ServiceCenter {
    private List<Task> tasks = new ArrayList<>();

    /**
     * Executes a task and adds it to the history.
     * 
     * @param task the task to execute
     */
    public void executeTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        this.tasks.add(task);
        task.execute();
    }

    /**
     * Cancels the last complaint task.
     */
    public void cancelLastComplaint() {
        if (!tasks.isEmpty()) {
            Task task = this.tasks.get(this.tasks.size() - 1);
            task.cancel();
            this.tasks.remove(this.tasks.size() - 1);
        }
    }
}

