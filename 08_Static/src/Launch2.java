
public class Launch2 {
	
	static int age;//first
	
	static {//second
		age=18;
		System.out.println("Static block first");
		System.out.println(age);
	}
	static void disp()
	{
		System.out.println("Static disp method main ke badh jab hum call karenege");
	}
	public static void main(String[] args) {
		
		System.out.println("Main method badhme");
		//disp();
	}

}


