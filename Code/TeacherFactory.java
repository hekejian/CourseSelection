package Code;

public class TeacherFactory implements UserFactory{
	private static final TeacherFactory TEACHER_FACTORY = new TeacherFactory();
	
	private TeacherFactory()
	{
		
	}
	
	public static TeacherFactory getTeacherFactory()
	{
		return TEACHER_FACTORY;
	}
	

	public User createUser(int ID, String name, String password, UserIdentity userIdentity) {
		Teacher teacher = new Teacher(ID, name, password, userIdentity);
		return teacher;
	}

}
