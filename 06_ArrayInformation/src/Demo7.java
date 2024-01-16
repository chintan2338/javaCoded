//Anonymous Array

/*
class Calc
{
	public int add(int x,int y)
	{
		int result=x+y;
		return result;
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		Calc obj = new Calc();
		int result=obj.add(5,2);
		System.out.println(result);

	}

}
*/
//OR

class Calc
{
	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		Calc obj = new Calc();
		int nums[]= {5,3,4,7};
		int result=obj.add(nums);
		System.out.println(result);

	}

}

//OR(Anonymous Array).
/*
class Calc
{
	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		Calc obj = new Calc();
		int result=obj.add(new int[]{5,3,4,7});
		System.out.println(result);

	}

}
*/