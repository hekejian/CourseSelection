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
		System.out.println("��½������1��ע��������2");
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
				System.out.println("�����������������");
			}
		}
	}
	
	public static void login()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("����������˺ţ�");
		int ID = input.nextInt();
		System.out.println("������������룺");
		String password = input.next();
		System.out.println(password);
		System.out.println("�����������ݣ�1 ��ѧ���� 2����ʦ�� 3������Ա");
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
