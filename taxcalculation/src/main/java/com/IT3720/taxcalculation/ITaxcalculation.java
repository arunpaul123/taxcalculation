package com.IT3720.taxcalculation;

public interface ITaxcalculation  {
	public double computeTax(double income);
	public double weeklySalary(Employee income); 
	public double fortnightSalary(Employee income);
	public double computeKiwiSaver(double income);
	public double getyearlyIncome(double income );

}
