package Code;

import java.util.ArrayList;

public class Teacher extends User{
	private Department department;
	private ArrayList<Course> courses;
	
	public Teacher(int ID, String name, String password, UserIdentity userIdentity)
	{
		super(ID, name, password, userIdentity);
		
	}
	
	public Teacher(int ID, String name, String password, UserIdentity userIdentity,Department department)
	{
		super(ID, name, password, userIdentity);
		this.department = department;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	
	public boolean addCourse(Course course)
	{
		for(Course course1 : courses)
		{
			if(course1.getTime().equals(course))
				return false;
		}
		courses.add(course);
		return true;
	}
	
	public String showCourse()
	{
		String s1 = "Course Name \t Course Department \t Course Time \t Course Location\n";
		String s2 = null;
		for(Course course : courses)
		{
			s2 += course.getName() + " \t " + course.getDepartment() + " \t " + course.getTime() + " \t " + course.getLocation() +" \n";
		}
		return s1 + s2;
	}
	
	public String showStudents(Course course)
	{
		String s1 = "Student ID \t Student Name \t Student Department\n";
		String s2 = null;
		for(Student student : course.getStudents())
		{
			s2 += student.getID() + " \t " + student.getName() + " \t " + student.getDepartment() +" \n";
		}
		return s1 + s2;
	}
	
	public void resetCourseCapacity(Course course, int maxCourseCapacity)
	{
		course.setMaxCourseCapacity(maxCourseCapacity);
	}
	
}
