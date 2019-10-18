package com.IT3720.taxcalculation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
import org.mockito.Mockito;




public class Testtaxcalculation {
	
	
public class Testtaxcalculator {

		Taxcalculation tobj;
		ITaxcalculation mockobj;
		
		double  income;
		double expected, actual;
		
		@Before
		public void setUp() throws Exception {
			tobj = new Taxcalculation();
			 
			 income=14000;
				mockobj = Mockito.mock(ITaxcalculation.class);
				Mockito.when(mockobj.computeTax(income)).thenReturn(income);
				((Taxcalculation) tobj).emp(mockobj);
				
				expected = computeTax(income);
				actual = tobj.computeTax(income);
		}
	    public double computeTax(double income )
	    {
	    	double tax=0;
	    	double yearlyincome=14000;
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
	    
        @Test
		public final void testcomputeTax() {
			assertEquals(expected, actual);
		}
		
		@After
		public void tearDown() throws Exception {
			tobj = null;
		}

	


	
	
}



}
