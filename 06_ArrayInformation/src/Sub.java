//16th Feb '23
import java.util.Scanner;
public class Sub
{
    public static void main(String[] args) {
        int [] ar=new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("Please enter the marks of the student");
            ar[i]=sc.nextInt();
            
        }
        System.out.println("the marks of student are as below");
        for(int i=0;i<ar.length;i++)
        {
            
            System.out.print(ar[i]+" ");
        }
        
        
       
       
    }
}