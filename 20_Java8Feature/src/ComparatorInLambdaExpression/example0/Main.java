package ComparatorInLambdaExpression.example0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(6);
		list.add(0);
		list.add(99);
		list.add(6);
//		Collections.sort(list, new MyClass());
		Collections.sort(list, (a,b)->b - a);//ye lambda expresion ka use kiya isiliye MyClass() ki jarurat nahi hai.
		System.out.println(list);
		

	}

}
