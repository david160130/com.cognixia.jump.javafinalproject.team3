package com.cognixia.jump.employeeproject;

import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name;
    private String cell;
    private int budget;
    private int sizeOfDept = 0;
    private static int idCounter = 1;
    private int deptID;
    private ArrayList<Employee> deptList = new ArrayList<>();

    public Department(String name, String cell, int budget) {
        this.name = name;
        this.cell = cell;
        this.budget = budget;
        this.deptID = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getSizeOfDept() {
        return sizeOfDept;
    }

    public void setSizeOfDept(int sizeOfDept) {
        this.sizeOfDept = sizeOfDept;
    }

	public int getDeptID() {
		return deptID;
	}

	public void addEmployee(Employee emp){
        deptList.add(emp);
        sizeOfDept++;
    }
	
	public void removeEmployee(Employee emp) {
		for (int i = 0; i < deptList.size(); i++ ) {
			if (deptList.get(i) == emp) {
				deptList.remove(i);
			}
		}
	}

    @Override
    public String toString(){
        return this.name + " " + this.cell + " " + this.budget + " " + this.sizeOfDept;
    }
}