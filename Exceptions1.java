package com.cognixia.jump.employeeproject;


public class Exceptions1 extends Exception {
	

	private String customCode;

	//

	
	public Exceptions1 (String customCode) {
		super();
		this.customCode = customCode;
	}
	
	public String getAgeCode() {
			return customCode;
	}
	
	public void setAgeCode(String customCode) {
			 customCode = "Employee must be 18 or older";
	}


	
	

}
