import java.util.Scanner;

public class Main
{
    public static final Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
        Person Driver = new Person("Hitler", "Adolf", 40, 180, 79, "Dictator");
        Person Wife = new Person("Laden", "Bin", 40, 180, 79, "Dictator");
        Person Son1 = new Person("Mufasa", "Kille", 40, 180, 79, "Dictator");
        Person Son2 = new Person("Kingga", "Linoe", 40, 180, 79, "Dictator");
        Person Daughter1 = new Person("Jafar", "Abdul", 40, 180, 79, "Dictator");

        // Initiating new Vehicle, Car.
        Vehicle Car = new Vehicle("Tesla", "N1G6A", 5);
        // Loading Passengers 
        Car.addPassenger(Driver);
        System.out.println(Driver);
        Car.addPassenger(Wife);
        Car.addPassenger(Son1);
        Car.addPassenger(Son2);
        Car.addPassenger(Daughter1);

        //Displaying details
        System.out.println(Car);
        boolean check= Car.checkPassenger(Son1);
        Check(check);
        Car.removePassenger(Son1);
        boolean check2= Car.checkPassenger(Son1);
        Check(check2);
        System.out.println(Car);


        //Attempting to implement CRUD
        // while(true)
        // {
        //     System.out.print("1: View Vehicles\n2: View Passengers\n0: Retire\nEnter Choice: ");

        //     String choice = input.nextLine();
        //     switch(choice)
        //     {
        //         case "1"->{ 
        //             System.out.println("Cars");
        //         }
                
        //         case "2"-> {
        //             System.out.println("Passengers");
        //         }

        //         case "0"-> { 
        //             System.out.println("Exiting.....");break;
        //         }
        //     }
        //     break;
            
        // }
    }



    
    public static void Check(boolean checkVal)
    {
        // if(checkVal==true)
        // {
        //     System.out.println("Person is in the vehicle");
        // }
        // else
        // {
        //     System.out.println("Person is not in the vehicle");
        // }

        //Utilizing Ternary Operators
        System.out.println(checkVal?"Person is in the vehicle":"Person is not in the vehicle");
    }
}