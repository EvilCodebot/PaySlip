package com.example.restservice;

public class Employee {
    private String firstName;
    private String lastName;
    private Long annualSalary;
    private Float superRate;

    private Long grossIncome;
    private Long incomeTax;
    private Long netIncome;
    private Long superAUD;

    public Employee(String firstName, String lastName, Long annualSalary, Float superRate) {
        
		this.firstName = firstName;
		this.lastName = lastName;
        this.annualSalary = annualSalary;
        this.superRate = superRate;

        this.grossIncome = annualSalary/12;

        if (annualSalary <= 18200)
        {
        this.incomeTax = (long)0;
        } else if(annualSalary <= 37000)
        {
        this.incomeTax = Math.round(((annualSalary - 18200) * 0.19)/12);
        }
        else if(annualSalary <= 87000)
        {
        this.incomeTax = Math.round((3572 + (annualSalary - 37000) * 0.325)/12);
        }
        else if(annualSalary <= 180000)
        {
        this.incomeTax = (long)((19822 + (annualSalary - 87000) * 0.37)/12);
        }
        else 
        {
        this.incomeTax = (long)((54232 + (annualSalary - 180000) * 0.45)/12);
        }

        this.netIncome = this.grossIncome - this.incomeTax;
        this.superAUD = (long)((float)grossIncome * superRate);
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

    public Long getGrossIncome() {
		return grossIncome;
	}

    public Long getIncomeTax() {
		return incomeTax;
	}

    public Long getNetIncome() {
		return netIncome;
	}

    public Long getSuperAUD() {
		return superAUD;
	}
}
