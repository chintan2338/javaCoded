//Constructor Execution in case of inheritance 
/*
class Demo1
{
    int a, b;
    
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        super();//by default super() mehtod hoti hai is we can not define
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y)
    {
        //super();
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe 
{
    public static void main(String[] args) 
    {
        
        Demo2 d=new Demo2();

    }
    
}*/

//OR

/*
class Demo1
{
    int a, b;
    
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        this(10,20);
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y)
    {
        //super();
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe 
{
    public static void main(String[] args) 
    {
        
        //Demo2 d=new Demo2();

        Demo2 d2=new Demo2(10,20);
    }
    
}
*/


//OR  
//Parent class Demo1 નો object બનાવ્યા વગર તેના parameterize constructor ને call કરવો છે. 
/*
class Demo1
{
    int a, b;
    
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        super(10,20);
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y)
    {
        //super();
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe 
{
    public static void main(String[] args) 
    {
        
        Demo2 d=new Demo2();

        //Demo2 d2=new Demo2(10,20);
    }
    
}
*/


//OR
/*
class Demo1
{
    int a, b;
    
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        this(10,20);
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y)
    {
        //super();
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class ConstructorExe 
{
    public static void main(String[] args) 
    {
        
        Demo2 d=new Demo2();

        //Demo2 d2=new Demo2(10,20);
    }
    
}

*/