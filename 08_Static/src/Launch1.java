
public class Launch1 {
	//static variable
	static int age;
	
	//static block
	static {
		age=18;
		System.out.println("Static block first");
		System.out.println(age);
	}
	//static method
	public static void main(String[] args) {
		
		System.out.println("Main method badhme");
	}

}
