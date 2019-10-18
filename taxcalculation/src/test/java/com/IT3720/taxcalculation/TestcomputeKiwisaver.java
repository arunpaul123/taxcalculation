package com.IT3720.taxcalculation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestcomputeKiwisaver {

	Taxcalculation tobj;
	ITaxcalculation mockobj;
	double income;
	double expected,actual;
	
	 
	   
	@Before
	public void setUp() throws Exception {
		
		tobj=new Taxcalculation();
		
				income=14000;
				mockobj = Mockito.mock(ITaxcalculation.class);
		Mockito.when(mockobj.computeKiwiSaver(income)).thenReturn(computeKiwiSaver());
		tobj.emp(mockobj);
		expected=income*0.03;
		actual=tobj.computeKiwiSaver(income);
		
	}

	private Double computeKiwiSaver() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Test
	public void testcomputeKiwiSaver()
	{
		assertEquals(expected,actual);
		
		
	}
	@After
	public void tearDown() throws Exception {
		tobj=null;
	}

}
