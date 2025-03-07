package Comparator;

import Main.Person;
import java.util.Comparator;
public class BMIComparator implements Comparator<Person>
{
    @Override
    public int compare(Person p1, Person p2)
    {
        return Double.compare(p1.getBMI(), p2.getBMI());
    }
}