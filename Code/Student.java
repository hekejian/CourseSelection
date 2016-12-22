package Code;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends User{
	private ArrayList<Course> courses;
	private int grade;
	private Department department;
	
	public Student(int ID, String name, String password, UserIdentity userIdentity) 
	{
		super(ID, name, password, userIdentity);
		
	}
	public Student(int ID, String name, String password, UserIdentity userIdentity, int grade, Department department)
	{
		super(ID, name, password, userIdentity);
		this.grade = grade;
		this.department = department;
	}
	
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public boolean addCourse(Course course)
	{
		for(Course course1 : courses)
		{
			if (course1.getTime().equals(course.getTime())) 
				return false;
		}
		courses.add(course);
		return true;
	}
	
	public String showCourse()
	{
		//System.out.println(arg0);
		String s1 = "Student : " + getName() + "\t StudentID: " + getID() + "\t StudentDepartment: " + getDepartment() +"\n";
		String s2 = "Course Name \t Course Teacher \t Course Time \t Course Location \n";
		for(Course course : courses)
		{
			s2 += course.getName() + "\t " + course.getTeacher() + "\t " + course.getTime()+ "\t " +course.getLocation() + "\n";
		}
		return s1+s2;
		
	}
	
	public void dropCourse(Course course)
	{
		courses.remove(course);
	}
	
	public String toString() {
		return "StudentID : " + getID() + "\t Name : " + getName() + "\t Grade : " + getGrade() + "\t Department" + getDepartment();
	}
	
	
	
	
	
	
	
}
