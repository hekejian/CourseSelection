package Code;

public abstract class User {
	private int ID;
	private String name;
	private String password;
	private UserIdentity userIdentity;
	
	protected User(int ID, String name, String password, UserIdentity userIdentity)
	{
		this.ID = ID;
		this.name = name;
		this.password = password;
		this.userIdentity = userIdentity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setUserIdentity(UserIdentity userIdentity)
	{
		this.userIdentity = userIdentity;
	}
	
	public UserIdentity getUserIdentity()
	{
		return userIdentity;
	}
	
	public void resetPassword(String oldPassword, String newPassword){
		if(oldPassword.equals(password))
		{
			password = newPassword;
		}
	}
	
	public boolean check(int ID, String password)
	{
		if (this.ID == ID && this.password.equals(password))
		{
			return true;
		}
		return false;
	}
	
	public LoginState login(int ID, String password,UserIdentity identity)
	{
		if(this.ID == ID && this.password.equals(password) && userIdentity == identity)
		{
			return LoginState.LoginSuccess;
		}
		else if (this.ID == ID && this.password.equals(password) && userIdentity != identity) 
		{
			return LoginState.IdentityFalse;
		}
		else if (this.ID == ID && !this.password.equals(password)) 
		{
			return LoginState.passwordfalse;
		}
		else 
		{
			return LoginState.IDfalse;
		}
	}

	@Override
	public String toString() {
		return "UserID: " + ID + "\t UserName: " + name + " \t UserIdentity: " + userIdentity;
	}
	
	
}
