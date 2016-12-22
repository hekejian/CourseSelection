package Code;

public class CourseFactory 
{
	int courseID = 10001;
	private static final CourseFactory COURSE_FACTORY = new CourseFactory();
	private CourseFactory()
	{
		
	}
	
	public static CourseFactory getCourseFactory()
	{
		return COURSE_FACTORY;
	}
	
	public Course creatCourse(Teacher teacher, String name, int maxCourseCapacity,
			int grade, Department department, String time, String location)
	{
		
		Course course = new Course(courseID, teacher, name, maxCourseCapacity, grade, department, time, location);
		CourseDB.getCourseDB().addCourse(course);
		courseID ++;
		return course;
		
	}
	
	
	
}
