package Comparator;

import Main.Person;
import java.util.Comparator;

public class PersonTypeComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2)
    {
        return p1.getPersonType().compareTo(p2.getPersonType());
    }
}
