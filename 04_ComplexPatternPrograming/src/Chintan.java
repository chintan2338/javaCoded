
public class Chintan {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++)
		{
			//c
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			//H
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==(n-1)/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			//I
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==(n-1)/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			//N
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			//T
			for(int j=0;j<n;j++)
			{
				if(i==0||j==(n-1)/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			//A
			for(int j=0;j<n;j++)
			{
				if(j==0&&i>0||j==n-1&&i>0||i==(n-1)/2||i==0&&j>0&&j<n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			//N
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
