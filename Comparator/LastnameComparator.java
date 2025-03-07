package Comparator;

import Main.Person;
import java.util.Comparator;

public class LastnameComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2)
    {
        return p1.getLname().compareTo(p2.getLname());
    }
}
