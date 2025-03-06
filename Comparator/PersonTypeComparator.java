package Comparator;

import Main.Person;

public class PersonTypeComparator {
    public static int compare(Person p1, Person p2)
    {
        if(p1.getPersonType() > p2.getPersonType())
        {
            return 1;
        }
        else if(p1.getPersonType() < p2.getPersonType())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
