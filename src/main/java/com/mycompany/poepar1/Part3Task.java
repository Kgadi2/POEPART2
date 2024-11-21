package com.mycompany.poepar1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */


public class Part3Task {
    private ArrayList<String> developers;
    private ArrayList<String> taskNames;
    private ArrayList<Integer> taskIDs;
    private ArrayList<Integer> taskDurations;
    private ArrayList<String> taskStatuses;

    public Part3Task() {
        developers = new ArrayList<>();
        taskNames = new ArrayList<>();
        taskIDs = new ArrayList<>();
        taskDurations = new ArrayList<>();
        taskStatuses = new ArrayList<>();
    }

    // Method to add a task to the arrays
    public void addTask(String developer, String taskName, int taskID, int taskDuration, String taskStatus) {
        developers.add(developer);
        taskNames.add(taskName);
        taskIDs.add(taskID);
        taskDurations.add(taskDuration);
        taskStatuses.add(taskStatus);
    }

    // a. Display tasks with status "Done"
    public void displayCompletedTasks() {
        System.out.println("Completed Tasks:");
        for (int i = 0; i < taskStatuses.size(); i++) {
            if (taskStatuses.get(i).equalsIgnoreCase("Done")) {
                System.out.println("Developer: " + developers.get(i) + 
                                   ", Task Name: " + taskNames.get(i) + 
                                   ", Duration: " + taskDurations.get(i) + " hours");
            }
        }
    }

    // b. Find task with longest duration
    public void findLongestTask() {
        if (taskDurations.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        int maxDurationIndex = 0;
        for (int i = 1; i < taskDurations.size(); i++) {
            if (taskDurations.get(i) > taskDurations.get(maxDurationIndex)) {
                maxDurationIndex = i;
            }
        }

        System.out.println("Longest Task:");
        System.out.println("Developer: " + developers.get(maxDurationIndex) + 
                           ", Duration: " + taskDurations.get(maxDurationIndex) + " hours");
    }

    // c. Search for a task by name
    public void searchTaskByName(String taskName) {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(taskName)) {
                System.out.println("Task Found:");
                System.out.println("Task Name: " + taskNames.get(i) + 
                                   ", Developer: " + developers.get(i) + 
                                   ", Status: " + taskStatuses.get(i));
                return;
            }
        }
        System.out.println("Task not found.");
    }

    // d. Search tasks by developer
    public void searchTasksByDeveloper(String developerName) {
        System.out.println("Tasks for Developer " + developerName + ":");
        boolean found = false;
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(developerName)) {
                System.out.println("Task Name: " + taskNames.get(i) + 
                                   ", Status: " + taskStatuses.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found for this developer.");
        }
    }

    // e. Delete a task by name
    public void deleteTask(String taskName) {
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(taskName)) {
                developers.remove(i);
                taskNames.remove(i);
                taskIDs.remove(i);
                taskDurations.remove(i);
                taskStatuses.remove(i);
                System.out.println("Task '" + taskName + "' deleted successfully.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    // f. Display full report of all tasks
    public void displayFullReport() {
        System.out.println("Full Task Report:");
        for (int i = 0; i < taskNames.size(); i++) {
            System.out.println("Task ID: " + taskIDs.get(i) + 
                               ", Task Name: " + taskNames.get(i) + 
                               ", Developer: " + developers.get(i) + 
                               ", Duration: " + taskDurations.get(i) + " hours" + 
                               ", Status: " + taskStatuses.get(i));
        }
    }

    // Method to populate test data
    public void populateTestData() {
        addTask("Mike Smith", "Create Login", 1, 5, "To do");
        addTask("Edward Harrison", "Create Add Features", 2, 8, "Doing");
        addTask("Samantha Paulson", "Create Reports", 3, 2, "Done");
        addTask("Glenda Oberholzer", "Add Arrays", 4, 11, "To Do");
    }

    // Optional: Main method for testing
    public static void main(String[] args) {
        Part3Task report = new Part3Task();
        report.populateTestData();

        // Demonstration of methods
        report.displayCompletedTasks();
        report.findLongestTask();
        report.searchTaskByName("Create Login");
        report.searchTasksByDeveloper("Samantha Paulson");
        report.displayFullReport();
    }
}