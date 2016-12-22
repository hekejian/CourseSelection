package Code;

import java.util.ArrayList;

public class UserDB {
	
    private ArrayList<User> users = new ArrayList<User>();
	
	private static final UserDB USER_DB = new UserDB();
	private UserDB()
	{
		//创建一个默认管理员
		User admin = AdminFactory.getAdminFactory().createUser(123456, "Admin","123456", UserIdentity.Admin);
		users.add(admin);
		
	}
	public static UserDB getUserDB()
	{
		return USER_DB;
	}
	

	public synchronized boolean addUser(User user,int adminID, String adminPassword)
	{
		if (check(adminID, adminPassword)) 
		{
			users.add(user);
			return true;
		}
		return false;
	}
	
	public User getUser(int ID, String password, UserIdentity userIdentity)
	{
		for(User user : users)
		{
			if (user.check(ID, password) && user.getUserIdentity() == userIdentity) 
			{
				return user;
			}
		}
		return null;
	}
	
	
	public LoginState checkUser(int ID, String password, UserIdentity userIdentity) 
	{
		for(User user: users)
		{
			if (user.login(ID, password, userIdentity) == LoginState.LoginSuccess)
			{
				return LoginState.LoginSuccess;
			}
			else if (user.login(ID, password, userIdentity) == LoginState.IdentityFalse) 
			{
				return LoginState.IdentityFalse;
			}
			else if (user.login(ID, password, userIdentity) == LoginState.passwordfalse) 
			{
				return LoginState.passwordfalse;
			}
			
		}
		return LoginState.IDfalse;
	}
	
	private boolean check(int adminID, String adminPassword)
	{
		for(User user : users)
		{
			if (user.getUserIdentity() == UserIdentity.Admin && user.check(adminID, adminPassword)) 
			{
				return true;
			}
		}
		return false;
	}
}
