
public class Pattern11 {

	public static void main(String[] args) {
		int n=20;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j&&i>(n-1)/2||i==0&&j>=(n-1)/4&&j<=3*(n-1)/4||j==(n-1)/4&&i<=3*(n-1)/4||i==3*(n-1)/4&&j>=(n-1)/4&&j<=3*(n-1)/4||j==3*(n-1)/4&&i<=3*(n-1)/4)
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
