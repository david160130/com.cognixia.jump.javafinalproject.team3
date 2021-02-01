package com.cognixia.jump.employeeproject;


public class Employee {

    private static int empIdCounter = 1;
    private  int empId = 0;
    private String name;
    private String jobTitle;
    private int salary;
    private int age;
    private int ext;
    private int deptID;


    public Employee(String name, String jobTitle, int salary, int age, int ext) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.age = age;
        this.ext = ext;
        this.empId = empIdCounter++;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExt() {
        return ext;
    }

    public void setExt(int ext) {
        this.ext = ext;
    }
    
//    public 
//    public static void updateEmployee() {
//    	
//    	
//    	
//    	
//    }

    @Override
    public String toString() {
        return empId + " " + this.name + " " + this.jobTitle + " " + this.salary + " " + this.age + " " + this.ext;
    }

	public int getDeptID() {
		return deptID;
	}


	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
}