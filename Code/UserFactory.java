package Code;

public interface UserFactory {
	public User createUser(int ID, String name, String password, UserIdentity userIdentity);
}
