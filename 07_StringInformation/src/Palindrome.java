
//public class Palindrome {
//
//	public static void main(String[] args) {
//		String str1 = "MADAM";
//		String str2 ="";
//		
//		for(int i=str1.length()-1;i>=0;i--)
//		{
//			str2=str2+str1.charAt(i);
//		}
//		
//		if(str1.equals(str2))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Non-Palindrome");
//		}
//	}
//
//}

//OR
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the string:-");
		String str1 = scan.next();
		String str2 ="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		
		if(str1.equals(str2))//if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Non-Palindrome");
		}
	}

}
