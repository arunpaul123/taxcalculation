package com.IT3720.taxcalculation;

public class Taxcalculation implements ITaxcalculation {

	Employee emp;

	 public  double  computeKiwiSaver(Employee income )
	 {
	   double kiwiSaver=0;
	   double yearlyincome=this.getyearlyIncome(income.getIncome());
			   
		   kiwiSaver= yearlyincome*0.03;
		   
			   return kiwiSaver;
	 }
	   
	
	    public double getYearlyIncome(double income)
	    {
	    	double yearlyincome=0;
	    	if(income>=0 && income<=250)
	    	{
	    		yearlyincome=income*40*52;
	        } 
	    	else if(income>=251&&income<=5000)
	    	{
	    		yearlyincome= income*52;
	    	}
	    	else if(income>=5001)
	    	{
	    		yearlyincome=income;
	    	}
		 return yearlyincome;
	}
	    
	    
	    public double computeTax(double income )
	    {
	    	double tax=0;
	    	double yearlyincome=this.getYearlyIncome(income);
	    	if(yearlyincome>=0 && yearlyincome<=14000)
	    	{
	    		tax=yearlyincome*0.105;
	    	}
	    	else if(yearlyincome>=14000&&yearlyincome<=48000)
	    	{
	    		
	    		tax=(yearlyincome-14001)*17.5+14000*0105;
	    		
	    	}
	    	else if(yearlyincome >=70000)
	    	{
	    		tax=(yearlyincome-7001)*0.33 + (48000-14000)*0.175 + (70000-48001)*0.30 - 14000*0.105;
	    		
	    	}
	    	
	    	return tax;
	    }
	    	
	    	
	    		
	    	
	    
	 
	
	
	
	
		
	
	public double yearlyIncome(double income)
	{
		double yearlyIncome=0;
		return 0;
		
	}
	/**
	 * @param income
	 * @return
	 */
	

	
	public double weeklySalary(Employee income) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double fortnightSalary(Employee income) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public double getyearlyIncome(double income) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void emp(ITaxcalculation mockobj) {
		// TODO Auto-generated method stub
		
	}


	public double computeKiwiSaver(double income) {
		// TODO Auto-generated method stub
		return 0;
	}

}
