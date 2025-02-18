
import java.util.*;
//polymorphism ni andar Abstration ane final keyword joya pasi aa project samjay
//polymorphism & Abstration & final keyword pasi
abstract class Shape
{
    float area;  //badhama avato hato aetale parent class ma ek vakhat lakhi didho.
    abstract public void input();
    abstract public void compute();
    public void disp()
    {
        System.out.println("The area is "+ area);
    }
}

class Rectangle1 extends Shape
{
    float length;
    float breadth;
    
    public void input()
    {
        System.out.println("calculation of rectangle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Rectangle");
        length=scan.nextFloat();
        System.out.println("Please enter breadth of Rectangle");
        breadth=scan.nextFloat();
    }
    public void compute()
    {
        area=length*breadth;
    }
    
}
class Square1 extends Shape
{
    float length;
    
    public void input()
    {
        System.out.println("calculation of Square app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Rectangle");
        length=scan.nextFloat();
        
    }
    public void compute()
    {
        area=length*length;
    }
    
}
class Circle1 extends Shape
{
    float radius;
    
    public void input()
    {
        System.out.println("calculation of Circle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter radius of Circle");
        radius=scan.nextFloat();
        
    }
    public void compute()
    {
        area=3.14f*radius * radius;
    }
    
}
class Geometry
{
   public void poly(Shape ref)//loose-coupling
   {
        ref.input();
        ref.compute();
        ref.disp();
   } 
}

public class LaunchEffApp {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        Square1 sq = new Square1();
        Circle1 c = new Circle1();

        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(c);

    }
}
