package Comparator;

import Main.Person;

public class AgeComparator{
    public static int compare(Person p1, Person p2)
    {
        if(p1.getAge() > p2.getAge())
        {
            return 1;
        }
        else if(p1.getAge() < p2.getAge())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
