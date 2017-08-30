package studentManagement.controller;

import studentManagement.model.*;

public class StudentRunner
{
	public static void main(String[] args)
	{
		Student myStudent = new Student(true, "Jacob Wynn", 17, "Male", 12, 645750, 3.6);
		System.out.println(myStudent);
	}
}
