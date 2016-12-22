package Code;

public class Admin extends User{
	
	public Admin(int ID, String name, String password, UserIdentity userIdentity)
	{
		super(ID, name, password, userIdentity);
	}
	
	public static void addCourse(Course course)
	{
		 CourseDB.getCourseDB().addCourse(course);
	}
	
	public static void deleteCourse(Course course)
	{
		CourseDB.getCourseDB().deleteCourse(course);
	}
	
	public static void modifyCourse(int courseID, String name, Teacher teacher, int maxCourseCapacity, 
			int grade, Department department, String time, String location)
	{
		CourseDB.getCourseDB().modifyCourse(courseID, teacher, name, maxCourseCapacity, grade, department, time, location);
	}
	
}
