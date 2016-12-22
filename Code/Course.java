package Code;

import java.util.ArrayList;

public class Course {
	private int CourseID;
	private ArrayList<Student> students;
	private Teacher teacher;
	private String name;
	private int maxCourseCapacity;
	private int grade;
	private Department department;
	private String time;
	private String location;
	
	public Course(int courseID, Teacher teacher, String name, int maxCourseCapacity,
			int grade, Department department, String time, String location) {
		CourseID = courseID;
		this.teacher = teacher;
		this.name = name;
		this.maxCourseCapacity = maxCourseCapacity;
		this.grade = grade;
		this.department = department;
		this.time = time;
		this.location = location;
	}

	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int courseID) {
		CourseID = courseID;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxCourseCapacity() {
		return maxCourseCapacity;
	}

	public void setMaxCourseCapacity(int maxCourseCapacity) {
		this.maxCourseCapacity = maxCourseCapacity;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public void deleteStudent(Student student)
	{
		students.remove(student);
	}
	
	public void showStudent()
	{
		for(Student student : students)
		{
			System.out.println(student.toString());
		}
		
	}
	
	
}
