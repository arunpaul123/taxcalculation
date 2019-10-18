package SoftwareTesting.StudentSystem;

public class StudentMark implements IStudentMark {
	
	Student student = new Student();

	public double calculatemark(Student student) {
		double totalmark=0;
		double assignment1 = student.getAssignment1();
		double assignment2= student.getAssignment2();
		double assignment3= student.getAssignment3();
		totalmark = assignment1 * 0.2 + assignment2 * 0.2 + assignment3 * 0.2;
		return totalmark;
	}

	public String calculateGrade(Student student) {
		String result = "F";
		double totalmark = student.getTotalMark();
		if(totalmark >= 90) {
			result = "A+";
		}else if(totalmark >= 80 && totalmark <= 70) {
			result = "A";
		}
		return result;
	}

	public Boolean PassOrFail(Student student) {
		Boolean result = true;
		double assignment1 = student.getAssignment1();
		double assignment2= student.getAssignment2();
		double assignment3= student.getAssignment3();
		double totalmark = student.getTotalMark();
		double finalmark = student.getFinalMark();
		if(assignment1 == 0 && assignment2 == 0 && assignment3 == 0) {
			result = false;
		}else if(totalmark < 50) {
			result = false;
		}else if(finalmark < 16) {
			result = false;
		}
		return result;
	}

	public double calculatemark(double assignment1, double assignment2, double assignment3) {
		// TODO Auto-generated method stub
		return 0;
	}

}
