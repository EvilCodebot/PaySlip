package com.example.restservice;

public class Employee {
  private String firstName;
  private String lastName;
  private Long annualSalary;
  private Float superRate;

  public Employee(String firstName, String lastName, Long annualSalary, Float superRate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.annualSalary = annualSalary;
    this.superRate = superRate;
  }

  public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

  public Long getAnnualSalary() {
      return annualSalary;
  }

  public Float getSuperRate(){
      return superRate;
  }
}
