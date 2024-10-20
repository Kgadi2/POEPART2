/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String firstTwo = taskName.substring(0, 2).toUpperCase();
        String lastThree = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return firstTwo + ":" + taskNumber + ":" + lastThree;
    }

    public String printTaskDetails() {
        return String.format("Task Status: %s\nDeveloper Details: %s\nTask Number: %d\nTask Name: %s\nTask Description: %s\nTask ID: %s\nDuration: %d hours",
                taskStatus, developerDetails, taskNumber, taskName, taskDescription, taskID, taskDuration);
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    // Getters and setters (omitted for brevity)
}
