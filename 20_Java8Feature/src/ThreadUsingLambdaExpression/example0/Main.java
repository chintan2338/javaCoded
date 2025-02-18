package ThreadUsingLambdaExpression.example0;

public class Main {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		Thread childThread = new Thread(myclass);
		childThread.run();
		for(int i=1;i<=10;i++) {
			System.out.println("Bye"+i);
		}
	}

}
