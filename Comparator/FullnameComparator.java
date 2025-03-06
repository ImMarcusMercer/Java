package Comparator;

import Main.Person;

public class FullnameComparator {
    public static int compare(Person p1, Person p2)
    {
        return p1.getFullname().compareTo(p2.getFullname());
    }
}
