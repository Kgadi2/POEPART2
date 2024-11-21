package com.mycompany.poepar1;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;

    private static List<Task> tasks = new ArrayList<>();
    private static int totalHours = 0;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }

    public Task() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String firstTwo = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String lastThree = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3).toUpperCase() : developerDetails.toUpperCase();
        return firstTwo + ":" + taskNumber + ":" + lastThree;
    }

    public String printTaskDetails() {
        return String.format("Task Status: %s\nDeveloper Details: %s\nTask Number: %d\nTask Name: %s\nTask Description: %s\nTask ID: %s\nDuration: %d hours",
                taskStatus, developerDetails, taskNumber, taskName, taskDescription, taskID, taskDuration);
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void addTasks() {
        String numTasksStr = JOptionPane.showInputDialog("How many tasks do you want to add?");
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        int numTasks = Integer.parseInt(numTasksStr);

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Entering details for Task " + (i + 1) + "\nTask Name:");

            String taskDescription;
            while (true) {
                taskDescription = JOptionPane.showInputDialog("Task Description (max 50 characters):");
                if (taskDescription.length() <= 50) {
                    JOptionPane.showMessageDialog(dialog, "Task successfully captured");
                    break;
                } else {
                    JOptionPane.showMessageDialog(dialog, "Please enter a task description of less than 50 characters");
                }
            }

            String developerDetails = JOptionPane.showInputDialog("Developer Details (First and Last Name):");
            String taskDurationStr = JOptionPane.showInputDialog("Task Duration (in hours):");
            int taskDuration = Integer.parseInt(taskDurationStr);

            String statusChoiceStr = JOptionPane.showInputDialog("Task Status:\n1) To Do\n2) Done\n3) Doing\nChoose a status:");
            int statusChoice = Integer.parseInt(statusChoiceStr);

            String taskStatus;
            switch (statusChoice) {
                case 1:
                    taskStatus = "To Do";
                    break;
                case 2:
                    taskStatus = "Done";
                    break;
                case 3:
                    taskStatus = "Doing";
                    break;
                default:
                    taskStatus = "To Do"; // Default status
            }
            
            Task task = new Task(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus);
            tasks.add(task);
            totalHours += taskDuration;

            JOptionPane.showMessageDialog(dialog, "Task Details:\n" + task.printTaskDetails());
        }

        JOptionPane.showMessageDialog(dialog, "Total hours for all tasks: " + totalHours);
        
        dialog.dispose();
    } 

    public static int returnTotalHours() {
        return totalHours;
    }
}