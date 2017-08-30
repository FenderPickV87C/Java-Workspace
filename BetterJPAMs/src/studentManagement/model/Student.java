package studentManagement.model;

public class Student 
{
	private boolean isCurrentStudent;
	private int gradeLevel;
	private int idNumber;
	private String name; 
	private String gender;
	private int age;
	private double gpa; 
	public Student()
	
	{
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = 000000;
		name = "";
		gender = "";
		age = 0;
		gpa = 0.0;
	}
	/**
	 * 
	 * @param isCurrentStudent
	 * @param gradeLevel
	 * @param idNumber
	 * @param name
	 * @param gender
	 * @param age
	 * @param gpa
	 */
	public Student(boolean isCurrentStudent, String name, int age, String gender, int gradeLevel, int idNumber, double gpa)
	{
		this.isCurrentStudent = isCurrentStudent;
		this.gradeLevel = gradeLevel;
		this.idNumber = idNumber;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.gpa = gpa; 
	}
	public String toString()
	{
		String str = "This person is not a current student.";
		if(isCurrentStudent)
		{	
		str = "Name:" + name + " " + "Age:" + age + " " + "Gender:" + gender + " " + "Grade Level:" + gradeLevel
				+ " " + "ID Number:" + idNumber + " " + "GPA:" + gpa;
		}
		return str;
	}
	
}
