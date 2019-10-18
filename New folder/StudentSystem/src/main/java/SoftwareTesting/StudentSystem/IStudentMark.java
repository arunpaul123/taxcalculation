package SoftwareTesting.StudentSystem;

public interface IStudentMark {

	public double calculatemark(Student student);
	
	public String calculateGrade(Student student);
	
	public Boolean PassOrFail(Student student);
}
