import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=scan.nextInt();
		System.out.println("The age is "+age);
		
		System.out.println("enter the avg");
		float avg=scan.nextFloat();
		System.out.println("Avg is "+ avg);
		
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Name is "+name);
		
		

	}
}

