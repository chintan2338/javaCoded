package rivision;
//discord code send by the that boy
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cricketer
{
    String name;
    int age;
    double avg;
    public Cricketer(String name, int age, double avg) {
        super();
        this.name = name;
        this.age = age;
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Cricketer [name=" + name + ", age=" + age + ", avg=" + avg + "]";
    }
}
class Alpha implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) 
    {
        if(((Cricketer)(o1)).avg>((Cricketer)(o2)).avg)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}
public class LaunchComparator {

    public static void main(String[] args) {

        ArrayList<Cricketer>clist=new ArrayList<>();
        clist.add(new Cricketer("Virat", 30, 65.32));
        clist.add(new Cricketer("Dhoni", 42, 75.82));
        clist.add(new Cricketer("Sachin", 47, 42.62));

        System.out.println(clist);

        Alpha a=new Alpha();

        Collections.sort(clist, a);


    }

}
