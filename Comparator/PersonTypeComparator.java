package Comparator;

import Main.Person;

public class PersonTypeComparator {
    public static int compare(Person p1, Person p2)
    {
        return p1.getPersonType().compareTo(p2.getPersonType());
    }
}
