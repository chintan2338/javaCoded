package staticMethodInInterface;

//1
//interface A{
//	static void sayHello() {
//		System.out.println("Hello !");
//	}
//}
//
//public class MyClass {
//	public static void main(String[] args) {
//		A.sayHello();
//	}
//}

//2
//interface A{
//	static void sayHello() {
//		System.out.println("Hello !");
//	}
//	default void sayBye() {
//		System.out.println("Bye !");
//	}
//}
//
//public class MyClass implements A {
//	public static void main(String[] args) {
//		A.sayHello();
//		MyClass myclass = new MyClass();
//		myclass.sayBye();
//	}
//}

//3
interface A{
	static void sayHello() {
		System.out.println("Hello !");
	}
}

public class MyClass implements A{
	//ye sayHello() override nahi ho raha ye ek new method hai. because static method can not participate in inheritance.
	static void sayHello() {
		System.out.println("Hello there!");
	}
}
