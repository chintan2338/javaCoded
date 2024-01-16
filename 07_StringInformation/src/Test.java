import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str1="chintan";
		String str2="";
		System.out.print("Enter the Sring:");
		str1=scan.nextLine();
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("non-Palindrome");
		}
	}

}
