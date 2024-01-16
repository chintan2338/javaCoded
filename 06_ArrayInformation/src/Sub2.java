//16th Feb '23
import java.util.Scanner;
public class Sub2
{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of classes");
        // int classes=sc.nextInt();
        // System.out.println("Enter the number of student in each class");
        // int stCount=sc.nextInt();
        int [][] ar=new int[3][];

        ar[0]=new int[3];
        ar[1]=new int[2];
        ar[2]=new int[4];

        for(int i=0;i<ar.length;i++)
        {   
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.println("Please enter the marks of class " + i +" student " + j);
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println("the marks of student are as below");
        for(int i=0;i<ar.length;i++)
        {   
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
                
            }
            System.out.println();
        }
        
       
       
    }
}
