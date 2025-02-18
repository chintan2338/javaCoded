
public class IncDec {

	public static void main(String[] args) {
//		int a = 5;
//		int b = a++;
//		System.out.println(b);//5
		
//		int a = 5;
//		int b = ++a;
//		System.out.println(b);//6
		
		int a =5;
//		int b = a++ + ++a + --a;
		int b = a++ + ++a + ++a + a++ + --a + a--;
		System.out.println(a);
		System.out.println(b);

	}

}
