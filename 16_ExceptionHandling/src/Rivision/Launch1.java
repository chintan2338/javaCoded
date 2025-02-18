package Rivision;
//by bikram khandelval

import java.util.Scanner;
class MyException extends Exception
{
	
}
class FaceBook
{
	String S1="vikram";
	int a=14432;
	String S2;
	int b;
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username");
		S2=scan.next();
		
		System.out.println("Enter your password");
		b=scan.nextInt();
	}
	public void validation() throws MyException
	{
		if(S1.equalsIgnoreCase(S2)&&(a==b))
		{
			System.out.println("Welcome to your accout");
		}
		else {
			MyException ME = new MyException();
			throw ME;
		}
	}
}

class FBCompany{
	public void checking()
	{
		FaceBook FB = new FaceBook();
		FB.input();
		try {
			FB.validation();
		} catch (MyException e) {
		
			System.out.println("This is not your accout");
		}
	}
}
public class Launch1 {

	public static void main(String[] args) 
	{
		FBCompany FBC = new FBCompany();
		FBC.checking();

	}

}

//only three triyal aape pasi kasu nahi aape.
/*
import java.util.Scanner;

class MyException extends Exception {}

class FaceBook {
    String S1 = "vikram";
    int a = 14432;
    String S2;
    int b;

    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        S2 = scan.next();

        System.out.println("Enter your password");
        b = scan.nextInt();
    }

    public void validation() throws MyException {
        if (S1.equalsIgnoreCase(S2) && (a == b)) {
            System.out.println("Welcome to your account");
        } else {
            throw new MyException();
        }
    }
}

class FBCompany {
    public void checking() {
        FaceBook FB = new FaceBook();

        for (int i = 0; i < 3; i++) {
            FB.input();
            try {
                FB.validation();
                break; // If validation succeeds, exit the loop
            } catch (MyException e) {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        System.out.println("You have exceeded the maximum number of attempts.");
    }
}

public class Launch1 {
    public static void main(String[] args) {
        FBCompany FBC = new FBCompany();
        FBC.checking();
    }
}*/
