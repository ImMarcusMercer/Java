package sComparator;

public class BMIComparator
{
    public static int compare(Person p1, Person p2)
    {
        if(p1.getBMI() > p2.getBMI())
        {
            return 1;
        }
        else if(p1.getBMI() < p2.getBMI())
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}