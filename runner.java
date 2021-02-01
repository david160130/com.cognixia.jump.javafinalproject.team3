package com.cognixia.jump.employeeproject;

import java.util.Scanner;

public class runner {
    public static void main(String [] args){
    	
    	
//    	EmployeeList.saveEmployees();
    	
    	
    	
    	//Ask user if they want to access either the departments or the employees
    	Scanner scan = new Scanner(System.in);
    	
    	boolean exitLoop = true;
    	
		while(exitLoop) {
			
			
	    	System.out.println("Would you like to access the department or the employee values?"
	    			+ "\nDepartments\t- 1"
	    			+ "\nEmployees\t- 2"
	    			+ "\nQuit\t\t- 3");
	    	
	    	int selection = Integer.parseInt(scan.nextLine());
	    	
	    	switch(selection) {
			case 1:
				System.out.println("Departments were selected.");
				accessDepartments(scan);
				break;
			case 2:
				System.out.println("Employees were selected.");
				accessEmployees(scan);
				break;
			case 3:
				System.out.println("Exiting system...");
				exitLoop = false;
				break;
			default:
				System.out.println("An error has occurred, try again.");
				break;
	    	}
	    	
	    	
		}
    	scan.close();
    }
    
    public static void accessDepartments(Scanner scan) {
//    	System.out.println("Editing departments");
    	
    	boolean exitLoopDept = true;

//    	Scanner scan2 = new Scanner(System.in);
    	while(exitLoopDept) {

    		
        	System.out.println("Would you like to access the department or the employee values?"
        			+ "\nAdd a department\t- 1"
        			+ "\nUpdate a department\t- 2"
        			+ "\nRemove a department\t- 3"
        			+ "\nList a department\t- 4"
        			+ "\nSave a department\t- 5"
        			+ "\nLoad a department\t- 6"
        			+ "\nReturn to main menu\t- 7");

        	int select = Integer.parseInt(scan.nextLine());

			
        	switch(select) {
	    		case 1:
	    			System.out.println("Adding a department was selected.");
	    			DeptList.addDept(scan);
	    			break;
	    		case 2:
	    			System.out.println("Updating a department was selected.");
	    			DeptList.updateDept(scan);
	    			break;
	    		case 3:
	    			System.out.println("Removing a department was selected.");
	    			DeptList.removeDept(scan);
	    			break;
	    		case 4:
	    			System.out.println("Listing a department information was selected.");
	    			DeptList.listDept(scan);
	    			break;
	    		case 5:
	    			System.out.println("Saving the current department list was selected.");
	    			DeptList.saveEmployees();
	    			break;
	    		case 6:
	    			System.out.println("Loading a preexisting department list was selected.");
	    			DeptList.loadEmployees();
	    			break;
	    		case 7:
	    			System.out.println("Returning to main menu...");
	    			exitLoopDept = false;
	    			break;
	    		default:
	    			System.out.println("An error has occurred, returning to main menu.");
	    			exitLoopDept = false;
	    			break;
        	}
    	}
    	
    	
    	
    }
    
    
    public static void accessEmployees(Scanner scan) {
//    	System.out.println("Editing employees");

    	
    	boolean exitLoopEmployees = true;

//    	Scanner scan2 = new Scanner(System.in);
    	while(exitLoopEmployees) {
    		
        	System.out.println("Would you like to access the department or the employee values?"
        			+ "\nAdd an employee\t\t- 1"
        			+ "\nUpdate an employee\t- 2"
        			+ "\nRemove an employee\t- 3"
        			+ "\nList employees\t\t- 4"
        			+ "\nSave employees\t\t- 5"
        			+ "\nLoad employees\t\t- 6"
        			+ "\nReturn to main menu\t- 7");

        	int select = Integer.parseInt(scan.nextLine());

			
        	switch(select) {
	    		case 1:
	    			System.out.println("Adding employees was selected.");
	    			EmployeeList.addEmployee(scan);
	    			break;
	    		case 2:
	    			System.out.println("Updating an employee was selected.");
	    			EmployeeList.updateEmployee(scan);
	    			break;
	    		case 3:
	    			System.out.println("Removing an employee was selected.");
	    			EmployeeList.removeEmployee(scan);
	    			break;
	    		case 4:
	    			System.out.println("Listing employee information was selected.");
	    			EmployeeList.listEmployees(scan);
	    			break;
	    		case 5:
	    			System.out.println("Saving the current employee list was accepted.");
	    			EmployeeList.saveEmployees();
	    			break;
	    		case 6:
	    			System.out.println("Loading the a preexisting employee list was accepted.");
	    			EmployeeList.loadEmployees();
	    			break;
	    		case 7:
	    			System.out.println("Returning to main menu...");
	    			exitLoopEmployees = false;
	    			break;
	    		default:
	    			System.out.println("An error has occurred, returning to main menu.");
	    			exitLoopEmployees = false;
	    			break;
        	}
    	}
    	

    	
    	
    }
    

    
}

