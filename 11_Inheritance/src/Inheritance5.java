//Type of method in inheritance (122)
/*
class AeroPlane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()//overridden method
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane extends AeroPlane
{
    public void fly()// overriding method(પેરેન્ટ્સ ક્લાસમાં હોય પરંતુ તેને child class મા ચેન્જ કર્યું હોય તો તેને overridden મેથડ કહેવાય છે)
    {
        System.out.println("CargoPlane flies at lower hight");
    }
    public void carryGoods() //specialised method(પેરેન્ટ્સ ક્લાસમાં ના હોય પરંતુ ચાઈલ્ડ ક્લાસમાં હોય તેને specialised મેથડ કહેવાય છે.)
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane
{
    public void fly() // overriding method
    {
        System.out.println("PassengerPlane flies at medium hight");
    }
    public void carryPassenger() //specialised method
    {
        System.out.println("PassengerPlane carries passenger");
    }
}
public class Inheritance5 {
    public static void main(String[] args) 
    {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }
}
*/