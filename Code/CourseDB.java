package Code;

import java.util.ArrayList;

public class CourseDB {
	
	private ArrayList<Course> courses;
	private static final CourseDB COURSE_DB = new CourseDB();
	private CourseDB()
	{
		
	}
	
	public static CourseDB getCourseDB()
	{
		return COURSE_DB;
	}
	
	public synchronized void addCourse(Course course)
	{
		courses.add(course);
	}
	
	public synchronized void deleteCourse(Course course)
	{
		courses.remove(course);
	}
	
	public synchronized void modifyCourse(int courseID, Teacher teacher, String name, int maxCourseCapacity,
			int grade, Department department, String time, String location)
	{
		 for(Course course : courses)
		 {
			 if (course.getCourseID() == courseID) 
			{
				 course.setTeacher(teacher);
				 course.setName(name);
				 course.setMaxCourseCapacity(maxCourseCapacity);
				 course.setGrade(grade);
				 course.setDepartment(department);
				 course.setTime(time);
				 course.setLocation(location);
				 break;
			}
		 }
	}
}
