package defaultMehodInInterface;

interface Parent {
	default void sayHello() {
		System.out.println("Hello");
	}
}

class child implements Parent{
	@Override
	public void sayHello() {
		System.out.println("child say Hello");
	}
}

public class MyClass {
	
	public static void main(String[] args) {
		Parent p = new child();
		p.sayHello();
	}
	
}
