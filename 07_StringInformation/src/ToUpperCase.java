import java.util.Scanner;
public class ToUpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter the string:");
		String str = scan.nextLine();
		char []array=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>='a'&&array[i]<='z')
			array[i]=(char)(array[i]-32);
		}
		str=new String(array);
		System.out.println(str);

	}

}
