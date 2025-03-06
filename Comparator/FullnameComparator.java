package Comparator;

import Main.Person;

public class FullnameComparator {
    public static int compare(Person p1, Person p2)
    {
        if(p1.getFullname() > p2.getFullname())
        {
            return 1;
        }
        else if(p1.getFullname() < p2.getFullname())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
