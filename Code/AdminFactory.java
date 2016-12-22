package Code;

public class AdminFactory implements UserFactory{
	private static final AdminFactory ADMIN_FACTORY = new AdminFactory();

	private AdminFactory() {
		
	}
	
	public static AdminFactory getAdminFactory()
	{
		return ADMIN_FACTORY;
	}
	public User createUser(int ID, String name, String password, UserIdentity userIdentity) {
		Admin admin = new Admin(ID, name, password, userIdentity);
		return admin;
	}

}
