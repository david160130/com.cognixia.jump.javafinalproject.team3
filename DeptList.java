package com.cognixia.jump.employeeproject;

import java.util.ArrayList;
import java.util.Scanner;
public class DeptList {
    private static ArrayList<Department> deptList = new ArrayList<>();
    

    public static void addDept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Department name: ");
        String deptName = in.nextLine();
        System.out.println("Enter Department number: ");
        String deptNumber = in.nextLine();
        System.out.println("Enter Department budget: ");
        int budget = Integer.parseInt(in.nextLine());
        Department d = new Department(deptName, deptNumber, budget);
        deptList.add(d);
        System.out.println(d);
        in.close();
    }
    
    public static int findDept() {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Enter Department ID Number: ");
    	 int desiredID = Integer.parseInt(in.nextLine());
    	 in.close();
    	 for (int i = 0; i < deptList.size(); i++) {
    		 if(deptList.get(i).getDeptID() == desiredID) {
 //  			 System.out.println("The department index is " + i);
    			 return i;
    		 } 
    	 }
    	 return -1;
    	 
    	
    }
    public static void updateDept() {
    	int index = findDept();
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("Selected employee: " + deptList.get(index));
     	
     	
     	System.out.println("Which value would you like to update?"
     			+ "\nName\t- 1"
     			+ "\nPhone Number\t- 2"
     			+ "\nBudget\t- 3");

     	int updateValue = Integer.parseInt(in.nextLine());
     	
     	System.out.println("Selected employee " + deptList.get(index));
     	
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
    	 in.close();
    	 
    }
    
    public static void removeDept() {
    	int index = findDept();
   	 	Scanner in = new Scanner(System.in);
    	System.out.println("You have selected " + deptList.get(index).getName());
    	System.out.println("Is this the department you would like to delete?"
     			+ "\nYes\t- 1"
     			+ "\nNot- 2");
    	
    	int updateValue = Integer.parseInt(in.nextLine());
    	
    	in.close();
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
    
    public static void addEmpToDept() {
    	System.out.println("You have chosen to add an employee to a department");
    	int deptIndex = findDept();
    	System.out.println("You have chosen " + deptList.get(deptIndex).getName());
    	int empIndex = EmployeeList.findEmployee();
    	Employee e = EmployeeList.findEmployee(empIndex);
    	System.out.println("You have chosen employee: " + e.getName());
    	deptList.get(deptIndex).addEmployee(e);
    	e.setDeptID(deptList.get(deptIndex).getDeptID());
    }
}
