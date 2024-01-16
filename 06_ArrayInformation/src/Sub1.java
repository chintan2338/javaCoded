//16th Feb '23(rivision)
import java.util.Scanner;
public class Sub1
{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes");
        int classes=sc.nextInt();
        System.out.println("Enter the number of student in each class");
        int stCount=sc.nextInt();
        int [][] ar=new int[classes][stCount];

        for(int i=0;i<ar.length;i++)
        {   
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.println("Please enter the marks of the student");
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
