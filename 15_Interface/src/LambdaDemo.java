/*
interface Car
{
	void drive();
}

public class LambdaDemo {

	public static void main(String[] args) 
	{
		Car obj=()->
			{
				System.out.println("Driving...");
			}
		;
		obj.drive();

	}

}
*/
//OR
/*
@FunctionalInterface
interface Car
{
	void drive();
}

public class LambdaDemo {

	public static void main(String[] args) 
	{
		Car obj=()->System.out.println("Driving...");
			
		
		obj.drive();

	}

}
*/

//OR
/*
interface Car
 {
     void drive(int avg);
 }


 public class LambdaDemo {
     public static void main(String[] args) {
         Car obj = new Car()
         {
             public void drive(int avg)
             {
                 System.out.println("drive.."+avg);
             }
         };
         obj.drive(16);
     }
 }
 */

//OR
/*
interface Car
 {
     void drive(int avg);
 }


 public class LambdaDemo {
     public static void main(String[] args) {
    	 
         Car obj = (int avg)->System.out.println("drive.."+avg);//car obj=(avg)->System.out.println("drive.."+avg);//Car obj = avg->System.out.println("drive.."+avg);
    
        
         obj.drive(16);
     }
 }
*/

//OR

//for two variable 
/*
interface Car
{
    void drive(int avg,int ts);
}


public class LambdaDemo {
    public static void main(String[] args) {
        Car obj = (avg,ts) -> System.out.println("drive.."+avg+":"+ts);
            
        
        obj.drive(16,140);
    }
}
*/