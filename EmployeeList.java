package com.cognixia.jump.employeeproject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    private static ArrayList<Employee> employee = new ArrayList<>();
    public static void addEmployee(Scanner in){
//        Scanner in = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = in.nextLine();
        System.out.println("Enter employee job title: ");
        String jobTitle = in.nextLine();
        System.out.println("Enter employee salary: ");
        int salary = Integer.parseInt(in.nextLine());
        System.out.println("Enter employee age: ");
        int age = 0;
        
        try {
         age = Integer.parseInt(in.nextLine());
        //have potential employee enter their age, if they are under 18
        //custom exception will be thrown
        if (age < 18) throw new Exceptions1 ("you must be 18 or older");
        
        }catch(Exceptions1 customCode) {
        	
        	customCode.getAgeCode();
        }
        
    
        
        
        System.out.println("Enter employee extension: ");
        int ext = Integer.parseInt(in.nextLine());
        Employee e = new Employee(name, jobTitle, salary, age, ext);
        employee.add(e);
        System.out.println(e);
//        in.close();
    }
    
    public static int findEmployee(Scanner in) {
    	
    	if(anyEmployees() == false) {
    		System.out.println("There are no employees in this department.");
    		return -1;
    	}
    	else {
//	    	Scanner in = new Scanner(System.in);
	    	System.out.println("Please enter the employee's ID");
	    	int desiredID = Integer.parseInt(in.nextLine());
//	    	in.close();
//	    	int index = -1;
	    	for(int i = 0; i < employee.size(); i++) {
	    		if(employee.get(i).getEmpId() == desiredID) {
	    			return i;
	    		}
	    	}
	    	
	    	return -1;
    	}
    }
    
    public static Employee findEmployee(int index) {
    	return employee.get(index);
    }
    
    public static void updateEmployee(Scanner in) {

    	if(anyEmployees() == false) {
    		System.out.println("There are no employees in this department.");
    	}
    	else {
	//        Employee e1 = new Employee("John", "Doe", 8943, "02/23/1995", 98423);
	//        Employee e2 = new Employee("John", "Doe", 8943, "02/23/1995", 98423);
	//        Employee e3 = new Employee("John", "Doe", 8943, "02/23/1995", 98423);
	//
	//    	employee.add(e1);
	//    	employee.add(e2);
	//    	employee.add(e3);
	//        
	//    	for(Employee a : employee) {
	//    		System.out.println(a);
	//    	}
	    	
	    	
//	    	Scanner in = new Scanner(System.in);
	    	
	    	int index = findEmployee(in);
	    	
	    	System.out.println("Selected employee: " + employee.get(index));
	    	
	    	
	    	System.out.println("Which value would you like to update?"
	    			+ "\nName\t- 1"
	    			+ "\nJobTitle\t- 2"
	    			+ "\nSalary\t- 3"
	    			+ "\nAge\t- 4"
	    			+ "\nExtension\t- 5");
	    	int updateValue = Integer.parseInt(in.nextLine());
	    	
	    	System.out.println("Selected employee " + employee.get(index));
	    	
	    	switch(updateValue) {
			case 1:
				System.out.println("Name selected. Input new name: ");
				employee.get(index).setName(in.nextLine());
				break;
			case 2:
				System.out.println("Job title selected. Input new job title: ");
				employee.get(index).setJobTitle(in.nextLine());
				break;
			case 3:
				System.out.println("Salary selected. Input new salary: ");
				employee.get(index).setSalary(Integer.parseInt(in.nextLine()));
				break;
			case 4:
				System.out.println("Date of birth selected. Input new age: ");
				employee.get(index).setAge(Integer.parseInt(in.nextLine()));
				break;
			case 5:
				System.out.println("Extension selected. Input new extension: ");
				employee.get(index).setExt(Integer.parseInt(in.nextLine()));
				break;
	    	}
//	    	in.close();
	    	
	//    	for(Employee a : employee) {
	//    		System.out.println(a);
	//    	}
    	}
    }
    
    public static void removeEmployee(Scanner in) {
    	
//    	Employee e1 = new Employee("John", "Doe", 8943, "02/23/1995", 98423);
//      	Employee e2 = new Employee("John", "Doe", 8943, "02/23/1995", 98423);
//      	Employee e3 = new Employee("John", "Doe", 8943, "02/23/1995", 98423);
//
//	  	employee.add(e1);
//	  	employee.add(e2);
//	  	employee.add(e3);
    	
    	if(anyEmployees() == false) {
    		System.out.println("There are no employees in this department.");
    	}
    	
    	else {

	//	      
	//	  	for(Employee a : employee) {
	//	  		System.out.println(a);
	//	  	}
		  	
		  	int index = findEmployee(in);
		  	employee.remove(index);
		  	
	//	  	for(Employee a : employee) {
	//	  		System.out.println(a);
	//	  	}
    	}
	  	
    }
    
    public static void listEmployees(Scanner in) {
    	if(anyEmployees() == false) {
    		System.out.println("There are no employees in this department.");
    	}
    	else {

    	  	int index = findEmployee(in);
    	  	System.out.println(employee.get(index));
    	  	
    	  	
    	}
	  	
    }
    
    public static boolean anyEmployees() {
    	if(employee.size() == 0) {
    		return false;
    	}
    	else {
    		return true;
    	}
    	
    }

}