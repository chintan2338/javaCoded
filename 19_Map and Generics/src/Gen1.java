//Generics in Java
import java.util.*;
/*
public class Gen1 
{
    public static void main(String[] args) 
    {
        //typesafety
        // String ar[]=new String[10];
        // ar[0]="Hyder";
        // ar[1]="PW";
        // //ar[2]=10; //CE (Ye String array me koi aur type add kiya to error aa jayegi.)

        // String name1=ar[0];
        // String name2=ar[1];

        //No typsesafety
        //Typesafety achived using generics
        ArrayList al=new ArrayList();

        al.add("Hyder");
        al.add("PW");

        al.add(10);

 
        String n1=(String)al.get(0); //typecasting
        String n2=(String)al.get(1);
        String n3=(String)al.get(2);
        
      //(koi developer hai jo aese arraylist mese data retrive kar raha hai
        // aur wo String me type cast kar raha hai aur numbur add kiya hoga to 
        //type ClassCastException Run time me  aa jayegi.)


    }
    
}*/

/*
public class Gen1 
{
    public static void main(String[] args) 
    {
        //No typsesafety
        //Typesafety achived using generics
        ArrayList<String> al=new ArrayList<String>();

        al.add("Hyder");
        al.add("PW");

        //al.add(10);  //ab ise add hi nahi kar sakate

 
//        String n1=(String)al.get(0); //typecasting
//        String n2=(String)al.get(1);
//        String n3=(String)al.get(2);
        
        //have aa rite retrive kari sakay se.
          String name1 = al.get(0);
          String name2 = al.get(1);

    }
    
}
*/