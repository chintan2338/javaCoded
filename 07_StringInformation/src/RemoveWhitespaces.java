
//public class RemoveWhitespaces {
//
//	public static void main(String[] args) {
//		String newString = "    This is my java code    ";
//		
//		//System.out.println(newString.trim());
//		System.out.println(newString.replace(" ",""));		
//
//	}
//
//}

//OR

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String newString = "This is my java code";
		System.out.println("before removing :-" + newString);
		
		String noWhiteSpaceString = "";
		
		for(int i=0;i<newString.length();i++)
		{
			if(newString.charAt(i)!=' ' && newString.charAt(i)!='\t')
			{
				noWhiteSpaceString = noWhiteSpaceString + newString.charAt(i);
			}
		}
		System.out.println("After removing  :-"+noWhiteSpaceString);
	}

}

