
public class Ternary1 {

	public static void main(String[] args) {
		
		int a=15
				;
		int b=20;
		int c=10;
//		int res=(a<b)?a:b;
//		System.out.println(res);
//		String result = (a<b)?"a is less":"b is less";
//		System.out.println(result);
		
//		int num=(a<b)?(a<c?a:c):(b<c?b:c);
//		System.out.println(num);
//		
//		if(a<b)
//		{
//			if(a<c)
//			{
//				System.out.println(a);
//			}
//			else
//			{
//				System.out.println(c);
//			}
//				
//		}
//		else
//		{
//			if(b<c)
//			{
//				System.out.println(b);
//			}
//			else
//			{
//				System.out.println(c);
//			}
//		}
		
		//OR
		
		// Using ternary operator without declaring a variable
		System.out.println("The smallest number is: " + (a < b ? (a < c ? a : c) : (b < c ? b : c)));
		    
		//OR
		
//		int x, y;  
//		x = 20;  
//		y = (x == 1) ? 61: 90;  
//		System.out.println("Value of y is: " +  y);  
//		y = (x == 20) ? 61: 90;  
//		System.out.println("Value of y is: " + y);  

		

	}

}
