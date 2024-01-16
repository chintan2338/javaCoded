//Need Of Interface With Example
/*
class Laptop
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Developer 
{
	public void buildApp()
	{
		System.out.println("Building App");
		Laptop obj=new Laptop();//-->જ્યારે પણ company મા જઈશું ત્યારે નવું laptop મળશે.કારણ કે દરેક વખતે object બને છે. 
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Developer dev=new Developer();
		dev.buildApp();

	}

}
*/
//OR
/*
class Laptop
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Developer 
{
	Laptop obj=new Laptop();//-->અહી laptop object developer પર dependent છે. 
	public void buildApp()
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Developer dev=new Developer();
		dev.buildApp();

	}

}
*/
//OR

/*
class Laptop
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Developer 
{
	
	public void buildApp(Laptop obj)
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Laptop obj=new Laptop();
		Developer dev=new Developer();
		dev.buildApp(obj);

	}

}
//જ્યારે કોઈ ડેવલોપર કંપનીમાં આવશે ત્યારે બોલશે.you give me a લેપટોપ.પણ લેપટોપ જ  કેમ? કંપની ને જો desktop આપવું  હોય તો.

*/

//OR
/*
class Laptop
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Desktop
{
	public void compileCode()
	{
		System.out.println("You got 5 errors, faster");
	}
}
class Developer 
{
	
	public void buildApp(Desktop obj)
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		//Laptop obj=new Laptop();
		
		Desktop obj=new Desktop();
		Developer dev=new Developer();
		dev.buildApp(obj);

	}

}
//જ્યારે કોઈ ડેવલોપર કંપનીમાં આવશે ત્યારે બોલશે.you give me a Desktop.પણ Desktop જ  કેમ? કંપની ને જો laptop આપવું  હોય તો.
*/

//OR
/*
class Computer 
{
	public void compileCode()
	{
		
	}
}
class Laptop extends Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Desktop extends Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors, faster");
	}
}
class Developer 
{
	
	public void buildApp(Computer obj)
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		//Laptop obj=new Laptop();
		Computer obj=new Desktop();
		
		Developer dev=new Developer();
		dev.buildApp(obj);

	}

}
*/

//OR
/*
abstract class Computer 
{
	public abstract void compileCode();
	
}
class Laptop extends Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Desktop extends Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors, faster");
	}
}
class Developer 
{
	
	public void buildApp(Computer obj)
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		//Laptop obj=new Laptop();
		Computer obj=new Desktop();
		
		Developer dev=new Developer();
		dev.buildApp(obj);

	}

}
*/
//OR
/*
interface Computer 
{
	void compileCode();
	
}
class Laptop implements Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors");
	}
}
class Desktop implements Computer
{
	public void compileCode()
	{
		System.out.println("You got 5 errors, faster");
	}
}
class Developer 
{
	
	public void buildApp(Computer obj)
	{
		System.out.println("Building App");
		
		obj.compileCode();
	}
}
public class Main {

	public static void main(String[] args) 
	{
		//Laptop obj=new Laptop();
		Computer obj=new Desktop();
		
		Developer dev=new Developer();
		dev.buildApp(obj);

	}

}
*/