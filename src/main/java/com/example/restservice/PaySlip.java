package com.example.restservice;

public class PaySlip {

    private Employee employee;
    private Long grossIncome;
    private Long incomeTax;
    private Long netIncome;
    private Long superAUD;

    public PaySlip(Employee employee, float[] taxBracket, float[] baseTax, double[] taxRate) {
        this.employee = employee;

        calculateGrossIncome();
        calculateIncomeTax(taxBracket, baseTax, taxRate);
        calculateNetIncome();
        calculateSuper();
    }

    void calculateGrossIncome()
    {
        grossIncome = (long)(Math.round(employee.getAnnualSalary()/12));
    }

    void calculateIncomeTax(float[] taxBracket, float[] baseTax, double[] taxRate)
    {
        incomeTax = 0L;
        for (int i = 0; i < taxBracket.length; i++) {
            if(employee.getAnnualSalary() > taxBracket[i])
            {   
                incomeTax = Math.round(( (baseTax[i] + (employee.getAnnualSalary() - taxBracket[i]) * taxRate[i])/12)) ;
            }
        }
    }

    void calculateNetIncome()
    {
        netIncome = grossIncome - incomeTax;
    }
    
    void calculateSuper()
    {
        superAUD = (long)((float)grossIncome * employee.getSuperRate());
    }

    public Employee getEmployee() {
		return employee;
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
