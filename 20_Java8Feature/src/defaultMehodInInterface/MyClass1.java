package defaultMehodInInterface;

//Ambiguty aavase
//interface A{
//	default void sayHello() {
//		System.out.println("A say Hello");
//	}
//}
//
//interface B{
//	default void sayHello() {
//		System.out.println("B say Hello");
//	}
//}
//
//public class MyClass1 implements A,B {
//	public static void main(String[] args) {
//		MyClass1  myClass = new MyClass1();
//		myClass.sayHello();
//	}
//}

//OR

interface A{
	default void sayHello() {
		System.out.println("A say Hello");
	}
}

interface B{
	default void sayHello() {
		System.out.println("B say Hello");
	}
}

public class MyClass1 implements A,B {
	public static void main(String[] args) {
		MyClass1  myClass = new MyClass1();
		myClass.sayHello();
	}
	
	@Override
	public void sayHello() {
		//A.super.sayHello();
		//B.superSayHello();
		System.out.println("My own implementation");
	}
}
