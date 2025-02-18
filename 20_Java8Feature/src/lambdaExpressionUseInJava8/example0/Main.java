package lambdaExpressionUseInJava8.example0;

public class Main {

	public static void main(String[] args) {
		
//		Employee employee = new SoftwareEngineer();
//		System.out.println(employee.getName());
		
		//or use lambda expression without any SoftwareEngineer class
		Employee se = () -> "Software Engineer";//functional interface = Lambda Expression
		System.out.println(se.getName());
		
		Employee editor = () -> "Editor";
		System.out.println(editor.getName());
	}

}


