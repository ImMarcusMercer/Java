import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static final Scanner input=new Scanner(System.in);
    public static final ArrayList<Person> Persons= new ArrayList<>();
    public static final ArrayList<Vehicle> Garage= new ArrayList<>();
    public static void main(String[] args)
    {
        Person Driver = new Person("Hitler", "Adolf", 40, 180, 79, "Dictator");
        Person Wife = new Person("Laden", "Bin", 40, 180, 79, "Dictator");
        Person Son1 = new Person("Mufasa", "Kille", 40, 180, 79, "Dictator");
        Person Son2 = new Person("Kingga", "Linoe", 40, 180, 79, "Dictator");
        Person Daughter1 = new Person("Jafar", "Abdul", 40, 180, 79, "Dictator");

        Persons.add(Driver);
        Persons.add(Wife);
        Persons.add(Son1);
        Persons.add(Son2);
        Persons.add(Daughter1);

        // // Initiating new Vehicle, Car.
        Vehicle Car = new Vehicle("Tesla", "N1G6A", 5);
        Garage.add(Car);
        // // Loading Passengers 
        // Car.addPassenger(Driver);
        // System.out.println(Driver);
        // Car.addPassenger(Wife);
        // Car.addPassenger(Son1);
        // Car.addPassenger(Son2);
        // Car.addPassenger(Daughter1);

        // //Displaying details
        // System.out.println(Car);
        // boolean check= Car.checkPassenger(Son1);
        // Check(check);
        // Car.removePassenger(Son1);
        // boolean check2= Car.checkPassenger(Son1);
        // Check(check2);
        // System.out.println(Car);


        //Attempting to implement CRUD
        Main:
        while(true)
        {
            
            System.out.print("=====LTO=====\n1: Vehicles\n2: Passengers\n0: Retire\nEnter Choice: ");

            String choice = input.nextLine();
            switch(choice)
            {
                //Vehicle options
                case "1"->{ 
                    System.out.println("1: View Vehicles\n2: Create New Vehicle\n0: Retire");
                    String choice1= Prompt("Enter Choice: ");
                    switch (choice1) {
                        case "1" -> {
                            showVehicles();
                        }

                        case "2"-> {
                            Vehicle newVehicle = constructVehicle();
                            Garage.add(newVehicle);
                        }

                        case "0" -> {
                            break;
                        }

                        default -> throw new AssertionError();
                        }
                }
                //Person Options
                case "2"-> {
                    System.out.println("1: View Passengers\n2: Create New Person\n0: Retire");
                    String choice2= Prompt("Enter Choice: ");
                    switch (choice2) {
                        case "1" -> {
                            showPassengers();
                        }

                        case "2"-> {
                            Person newPerson = createNewPerson();
                            Persons.add(newPerson);
                        }

                        case "0" -> {
                            break;
                        }

                        default -> throw new AssertionError();
                        }
                }
                //Exit
                case "0"-> { 
                    System.out.println("Exiting.....");break Main;
                }
            }
        }
    }
    public static void showVehicles()
    {
        String garage = "======Garage=====";
        for(Vehicle vehicle:Garage)
        {
            garage+="\n"+vehicle.getName();
        }
        garage+="\n";

        System.out.println(garage);
    }
    public static void showPassengers()
    {
        String res = "======Passengers=====";
        for(Person person:Persons)
        {
            res+="\n"+person.getFullname();
        }
        res+="\n";

        System.out.println(res);
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
    //Method Overloading
    public static String Prompt(String Value)
    {
        System.out.print(Value);
        return input.nextLine();
    }
    public static Integer Prompt(Integer Value)
    {
        System.out.print(Value);
        return input.nextInt();
    }
    public static Double Prompt(Double Value)
    {
        System.out.print(Value);
        return input.nextDouble();
    }


    public static Person createNewPerson()
    {
        String Lname = Prompt("Enter Last Name:");
        String Fname = Prompt("Enter Last Name:");
        int age = Prompt(Integer.valueOf("Enter Last Name:"));
        double Height = Prompt(Integer.valueOf("Enter Last Name:"));
        double Weight = Prompt(Integer.valueOf("Enter Last Name:"));
        String PersonType = Prompt("Enter Last Name:");

        return new Person(Lname, Fname, age, Height, Weight, PersonType);
    }


    public static Vehicle constructVehicle()
    {
        String Name;
        String PlateNum;
        int maxPass;
        Name = Prompt("Enter Vehicle Name: ");
        PlateNum = Prompt("Enter Vehicle Plate Number: ");
        maxPass = Prompt(Integer.valueOf("Enter Max Capacity: "));

        return new Vehicle(Name, PlateNum, maxPass);
    }
}