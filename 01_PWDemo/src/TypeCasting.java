
public class TypeCasting {

	public static void main(String[] args) {
		int a=45;
		double b;
		b=a;
		System.out.println(b);
		//Implicit Type-casting (જાતે casting થાય છે int માંથી double મા  )
         
		
		double num1=45.5;
		int num2;
		num2=(int)num1;
		System.out.println(num2);
		//Explicit type-casting (અહી જાતે type casting થાય નહીં કેમકે double માંથી int  મા જતા compiler કહેશે કે ડબલ મોટું છે અને int નાનું  )
	
		int n1=12;
		int n2=5;
		float res = n1/n2;
		System.out.println(res);
	}

}



