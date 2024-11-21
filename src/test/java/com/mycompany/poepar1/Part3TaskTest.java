/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepar1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class Part3TaskTest {
    
    public Part3TaskTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTask method, of class Part3Task.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String developer = "";
        String taskName = "";
        int taskID = 0;
        int taskDuration = 0;
        String taskStatus = "";
        Part3Task instance = new Part3Task();
        instance.addTask(developer, taskName, taskID, taskDuration, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCompletedTasks method, of class Part3Task.
     */
    @Test
    public void testDisplayCompletedTasks() {
        System.out.println("displayCompletedTasks");
        Part3Task instance = new Part3Task();
        instance.displayCompletedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findLongestTask method, of class Part3Task.
     */
    @Test
    public void testFindLongestTask() {
        System.out.println("findLongestTask");
        Part3Task instance = new Part3Task();
        instance.findLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Part3Task.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "";
        Part3Task instance = new Part3Task();
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     
    /**
     * Test of searchTaskByName method, of class Part3Task.
     */
    @Test
    public void testSearchTaskByName2() {
        System.out.println("searchTaskByName");
        String taskName = "";
        Part3Task instance = new Part3Task();
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of searchTaskByName method, of class Part3Task.
     */
    @Test
    public void testSearchTaskByName3() {
        System.out.println("searchTaskByName");
        String taskName = "";
        Part3Task instance = new Part3Task();
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of searchTaskByName method, of class Part3Task.
     */
    @Test
    public void testSearchTaskByName4() {
        System.out.println("searchTaskByName");
        String taskName = "";
        Part3Task instance = new Part3Task();
        instance.searchTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Part3Task.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "";
        Part3Task instance = new Part3Task();
        instance.searchTasksByDeveloper(developerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class Part3Task.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskName = "";
        Part3Task instance = new Part3Task();
        instance.deleteTask(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayFullReport method, of class Part3Task.
     */
    @Test
    public void testDisplayFullReport() {
        System.out.println("displayFullReport");
        Part3Task instance = new Part3Task();
        instance.displayFullReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateTestData method, of class Part3Task.
     */
    @Test
    public void testPopulateTestData() {
        System.out.println("populateTestData");
        Part3Task instance = new Part3Task();
        instance.populateTestData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Part3Task.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Part3Task.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
