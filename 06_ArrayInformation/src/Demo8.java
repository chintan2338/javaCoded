//ArrayIndexOutOfBoundsException
/*
public class Demo8 {

	public static void main(String[] args) {
		
		int nums[]= {5,3,7,6};
		//System.out.println(nums[4]); -->error
		System.out.println(nums[nums.length-1]);
		System.out.println("Bye");

	}

}
*/
//OR
/*
public class Demo8 {

	public static void main(String[] args) {
		
		int nums[]= {5,3,7,6};
//		for(int i=0;i<nums.length;i++)
//		{
//			
//		}
		for(int n:nums)
		{
			System.out.println(n);
		}

	}

}
*/