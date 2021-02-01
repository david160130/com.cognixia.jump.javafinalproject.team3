package com.cognixia.jump.employeeproject;

import java.util.ArrayList;
import java.util.Scanner;
public class DeptList {
    private static ArrayList<Department> deptList = new ArrayList<>();
    

    public static void addDept(Scanner in){
//        Scanner in = new Scanner(System.in);
        System.out.println("Enter Department name: ");
        String deptName = in.nextLine();
        System.out.println("Enter Department number: ");
        String deptNumber = in.nextLine();
        System.out.println("Enter Department budget: ");
        int budget = Integer.parseInt(in.nextLine());
        Department d = new Department(deptName, deptNumber, budget);
        deptList.add(d);
        System.out.println(d);
//        in.close();
    }
    
    public static int findDept(Scanner in) {
    	if(anyDept() == false) {
    		System.out.println("There are no departments in this company.");
    		return -1;
    	}
    	else {
	//    	 Scanner in = new Scanner(System.in);
	    	 System.out.println("Enter Department ID Number: ");
	    	 int desiredID = Integer.parseInt(in.nextLine());
	//    	 in.close();
	    	 for (int i = 0; i < deptList.size(); i++) {
	    		 if(deptList.get(i).getDeptID() == desiredID) {
	 //  			 System.out.println("The department index is " + i);
	    			 return i;
	    		 } 
	    	 }
	    	 return -1;
    	 
    	}
    }

    public static void updateDept(Scanner in) {
    	
    	if(anyDept() == false) {
    		System.out.println("There are no departments in this company.");
    	}
    	else {
	    	
	    	int index = findDept(in);
	//    	 Scanner in = new Scanner(System.in);
	    	 System.out.println("Selected department: " + deptList.get(index));
	     	
	     	
	     	System.out.println("Which value would you like to update?"
	     			+ "\nName\t- 1"
	     			+ "\nPhone Number\t- 2"
	     			+ "\nBudget\t- 3");
	
	     	int updateValue = Integer.parseInt(in.nextLine());
	     	
	     	System.out.println("Selected department " + deptList.get(index));
	     	
	     	switch(updateValue) {
	 		case 1:
	 			System.out.println("Name selected. Input new name: ");
	 			deptList.get(index).setName(in.nextLine());
	 			break;
	 		case 2:
	 			System.out.println("Phone Number selected. Input new phone number: ");
	 			deptList.get(index).setCell(in.nextLine());
	 			break;
	 		case 3:
	 			System.out.println("Budget selected. Input new budget: ");
	 			deptList.get(index).setBudget(Integer.parseInt(in.nextLine()));
	 			break;
	     	}
	//    	 in.close();
    	}
    }
    
    public static void removeDept(Scanner in) {
    	if(anyDept() == false) {
    		System.out.println("There are no departments in this company.");
    	}
    	else {
    		int index = findDept(in);
//   	 		Scanner in = new Scanner(System.in);
	    	System.out.println("You have selected " + deptList.get(index).getName());
	    	System.out.println("Is this the department you would like to delete?"
	     			+ "\nYes\t- 1"
	     			+ "\nNot- 2");
	    	
	    	int updateValue = Integer.parseInt(in.nextLine());
	    	
//	    	in.close();
	     	switch(updateValue) {
	 		case 1:
	 			System.out.println("The department has been deleted: ");
	 			deptList.remove(index);
	 			break;
	 		case 2:
	 			System.out.println("The deaprtment has not been deleted");
	 			break;
	     	}
    	}
 	     	
    	
    }
    
    
    public static void listDept(Scanner in) {
    	if(anyDept() == false) {
    		System.out.println("There are no departments in this company.");
    	}
    	else {
	   	  	int index = findDept(in);
	   	  	System.out.println(deptList.get(index));
    	}
	  	
    }
    
    public static void addEmpToDept(Scanner in) {
    	System.out.println("You have chosen to add an employee to a department");
    	int deptIndex = findDept(in);
    	System.out.println("You have chosen " + deptList.get(deptIndex).getName());
    	int empIndex = EmployeeList.findEmployee(in);
    	Employee e = EmployeeList.findEmployee(empIndex);
    	System.out.println("You have chosen employee: " + e.getName());
    	deptList.get(deptIndex).addEmployee(e);
    	e.setDeptID(deptList.get(deptIndex).getDeptID());
    }
    
    public static void removeEmpFromDept(Scanner in) {
    	System.out.println("You have chosen to remove an employee from a department");
    	int deptIndex = findDept(in);
    	System.out.println("You have chosen " + deptList.get(deptIndex).getName());
    	int empIndex = EmployeeList.findEmployee(in);
    	Employee e = EmployeeList.findEmployee(empIndex);
    	System.out.println("You have chosen employee: " + e.getName());
    	
    	System.out.println("Is this the employee you would like to delete from " + 
    	deptList.get(deptIndex).getName() + " ?"
     			+ "\nYes\t- 1"
     			+ "\nNot- 2");
    	
    	int updateValue = Integer.parseInt(in.nextLine());
    	
    	switch(updateValue) {
 		case 1:
 			System.out.println("The employee has been deleted: ");
 			deptList.get(deptIndex).removeEmployee(e);;
 			break;
 		case 2:
 			System.out.println("The employee has not been deleted");
 			break;
     	}
	}
    
    public static boolean anyDept() {
    	if(deptList.size() == 0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    }
    
    
}