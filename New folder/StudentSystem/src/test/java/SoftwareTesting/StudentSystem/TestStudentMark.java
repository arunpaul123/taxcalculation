package SoftwareTesting.StudentSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestStudentMark extends StudentMark {
	
	double assignment1,assignment2,assignment3;
	IStudentMark mockobj;
	StudentMark tobj;
	double  expected, actual;
	
	@Before
	public void setUp() throws Exception {
		tobj = new StudentMark();
		assignment1=student.getAssignment1();
		assignment2=student.getAssignment2();
		assignment3=student.getAssignment3();
		
		mockobj = Mockito.mock(IStudentMark.class);
		Mockito.when(mockobj.calculatemark(student.totalMark(assignment1,assignment2,assignment3)).thenReturn(assignment1+assignment2+assignment3));
		tobj.student(mockobj);

	}

		@Test
		public  void Teststudenttest() {
			expected= assignment1+assignment2+assignment3;
			actual=tobj.calculatemark(assignment1,assignment2,assignment3);
			assertEquals(expected, actual);
			
		}
	@After
	public void tearDown() throws Exception {
		tobj=null;
		
	}
	}

	



