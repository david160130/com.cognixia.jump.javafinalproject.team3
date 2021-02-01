package com.cognixia.jump.employeeproject;

import java.util.ArrayList;
import java.util.Scanner;
public class DeptList {
    private static ArrayList<Department> deptList = new ArrayList<>();
    
    
    public static void createDept() {
    	
    }

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
    
    public static void updateDept() {
    	
    }
    
    public static void removeDept() {
    	
    }
}
