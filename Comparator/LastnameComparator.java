package Comparator;

import Main.Person;

public class LastnameComparator {
    public static int compare(Person p1, Person p2)
    {
        if(p1.getLname() > p2.getLname())
        {
            return 1;
        }
        else if(p1.getLname() < p2.getLname())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
