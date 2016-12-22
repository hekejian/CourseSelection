package Code;

import java.util.Scanner;

public class LoginControl {

	public static void main(String[] args) 
	{
		start();
	}
	
	public static void start()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("登陆请输入1，注册请输入2");
		boolean hasInput = false;
		int choose = input.nextInt();
		while (!hasInput) 
		{
			if (choose == 1) 
			{
				login();
				hasInput = true;
			}
			else if (choose == 2) 
			{
				signIn();
				hasInput = true;
			}
			else 
			{
				System.out.println("输入错误，请重新输入");
			}
		}
	}
	
	public static void login()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的账号：");
		int ID = input.nextInt();
		System.out.println("请输入你的密码：");
		String password = input.next();
		System.out.println(password);
		System.out.println("请输入你的身份，1 ：学生， 2：老师， 3：管理员");
		int identity = input.nextInt();
		
		if (identity == 1) 
		{
			//Student student = UserDB.getUserDB().checkStudent(ID, password);
			
		}
		
	}
	
	
	public static void signIn()
	{
		
	}
	
	public static void studentCheck()
	{
		
	}
}
