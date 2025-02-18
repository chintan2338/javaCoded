//Handling The Exception Using Try Catch
//Runtime error

public class ExceptionFirst
{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;//0 pan mukine try karo
        int result = 0;
        try
        {
            result = num1 / num2;
            System.out.println("in try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("something went wrong.. "+ e);
        }
        
        System.out.println(result);
        System.out.println("Bye");        
    }
}
//OR
/*
public class ExceptionFirst
{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        try
        {
            result = num1 / num2;
            System.out.println("in try block");//-->અહીં try block પ્રિન્ટ જ નથી થતો આથી આપણે ટ્રાઈ બ્લોકની અંદર નોર્મલ સ્ટેટમેન્ટ લખતા નથી.કેમ કે તે exception આવતા પ્રિન્ટ થતા નથી.
        }
        catch(ArithmeticException e)//Exception obj //Exception e 
        {
            System.out.println("something went wrong.. "+ e);
        }
        
        System.out.println(result);
        System.out.println("Bye");        
    }
}
*/

//OR
/*
public class ExceptionFirst
{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        try
        {
            result = num1 / num2;
            System.out.println("in try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("something went wrong.. "+e);
        }
        
        System.out.println(result);
        System.out.println("Bye");        
    }
}
*/