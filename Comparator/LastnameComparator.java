package Comparator;

import Main.Person;

public class LastnameComparator {
    public static int compare(Person p1, Person p2)
    {
        return p1.getLname().compareTo(p2.getLname());
    }
}
