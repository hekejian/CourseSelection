package Code;

public class StudentFactory implements UserFactory{
	
	private static final StudentFactory studentFactory = new StudentFactory();
	
	private StudentFactory()
	{
		
	}
	
	public static StudentFactory getStudentFactory()
	{
		return studentFactory;
	}

	public User createUser(int ID, String name, String password, UserIdentity userIdentity) {
		User student = new Student(ID, name, password, userIdentity);
		return student;
	}

}
