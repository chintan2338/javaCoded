import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//unchecked exception and checked exception (148)
public class ExceptionSixth {
    public static void main(String[] args) {
        int result = 7/0;//unchecked exception beacause -->compiler exception ને compile time vakhate check જ નથી કરતું.runtime વખતે જ check થશે. 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();//checked exception --> compiler exception ને check compile time  વખતે જ કરી લે છે.
        
        try 
        {
            String str = br.readLine();//IOException generate karega if we not handled
        } 
        catch (IOException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
