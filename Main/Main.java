//Pulmones, Janamrc D.
//Jumao-as, Sertin Jay 

package Main;

import Comparator.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
    public static final Scanner input=new Scanner(System.in);
    public static  ArrayList<Person> Persons= new ArrayList<>();
    public static  ArrayList<Vehicle> Garage= new ArrayList<>();
    
    //Main Method
    public static void main(String[] args)
    {
        //Testing
        Person Driver = new Person("Hitler", "Adolf", 41, 189, 72, "Dictator");
        Person Wife = new Person("Laden", "Bin", 24, 110, 73, "Dictator");
        Person Son1 = new Person("Mufasa", "Kille", 20, 150, 49, "Dictator");
        Person Son2 = new Person("Kingga", "Linoe", 47, 169, 90, "Dictator");
        Person Daughter1 = new Person("Jafar", "Abdul", 14, 126, 40, "Dictator");

        Persons.add(Driver);
        Persons.add(Wife);
        Persons.add(Son1);
        Persons.add(Son2);
        Persons.add(Daughter1);

        // System.out.println(Driver.getFullname());

        // Initiating new Vehicle, Car.
        Vehicle Car = new Vehicle("Tesla", "N1G6A", 5);
        Garage.add(Car);
        // Loading Passengers 
        Car.addPassenger(Driver);
        Car.addPassenger(Wife);
        Car.addPassenger(Son1);
        Car.addPassenger(Son2);
        Car.addPassenger(Daughter1);

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
                case "1"->
                { 
                    Cars:
                    while(true)
                    {
                        System.out.println("\n1: View Vehicles\n2: Create New Vehicle\n0: Retire");
                        String choice1= Prompt("Enter Choice: ");
                        switch (choice1) 
                        {
                            case "1" -> {
                                showVehicles();
                                String vehicleChoice= Prompt("0: Return\nChoice:");
                                if(Integer.parseInt(vehicleChoice) >=0 && Integer.parseInt(vehicleChoice)<Garage.size())
                                {
                                    
                                }
                                switch (vehicleChoice) 
                                {
                                    case "0"->
                                    {
                                        break;
                                    }
                                }
                            }

                            case "2"-> {
                                Vehicle newVehicle = constructVehicle();
                                Garage.add(newVehicle);
                            }

                            case "0" -> {
                                break Cars;
                            }
                        }
                    }
                }
                //Person Options
                case "2"-> 
                {
                    SORTER:
                    while(true)
                    {
                        System.out.println();
                        showPassengers();
                        String choice2= Prompt("1: Create New Person\n2: Sort\n0: Retire\nChoice: ");
                        switch (choice2) 
                        {
                            
                            case "1"-> 
                            {
                                Person newPerson = createNewPerson();
                                Persons.add(newPerson);
                            }
                            case "2"->
                            {
                                System.out.print("=====Sort By=====\n1: Age\n2: By Body Mass Index\n3: Full Name\n4: Last Name\n5: Type\n0: Return\nChoice: ");
                                sorter:
                                while(true)
                                {
                                    String choice2_1 = input.nextLine();
                                    switch(choice2_1)
                                    {
                                        case "1"->{sortPeople(Persons, new AgeComparator());break sorter;}
                                        case "2"->{sortPeople(Persons, new BMIComparator());break sorter;}
                                        case "3"->{sortPeople(Persons, new FullnameComparator());break sorter;}
                                        case "4"->{sortPeople(Persons, new LastnameComparator());break sorter;}
                                        case "5"->{sortPeople(Persons, new PersonTypeComparator());break sorter;}
                                        case "0"->{break sorter;}
                                    }
                                }
                                
                            }
    
                            case "0" -> 
                            {
                                break SORTER;
                            }
                        }
                    }
                }
                //Exit
                case "0"-> { 
                    System.out.println("Exiting.....");break Main;
                }
            }
        }
    }
    public static String Prompt(String value)
    {
        System.out.print(value);
        String answer;
        answer = input.nextLine();
        return answer;
    }


    public static void showVehicles()
    {
        String garage = "======Garage=====";
        int count=1;
        for(Vehicle vehicle:Garage)
        {
            garage+="\n"+count+": "+vehicle.getName();
            count++;
        }
        garage+="\n";
        

        System.out.println(garage);
    }
    public static void showPassengers()
    {
        System.out.println("======Passengers=====");
        for (Person p : Persons) {
            System.out.println(p);}
    }
    
    public static void Check(boolean checkVal)
    {
        System.out.println(checkVal?"Person is in the vehicle":"Person is not in the vehicle");
    }
    

    public static Person createNewPerson()
    {
        System.out.print("Enter Last Name:");
        String Lname = input.nextLine();
        System.out.print("Enter First Name:");
        String Fname = input.nextLine();
        System.out.print ("Enter Age:");
        int age = input.nextInt();
        System.out.print("Enter Height(cm):");
        double Height =  input.nextDouble();
        System.out.print("Enter Weight(kg):");
        double Weight =  input.nextDouble();
        System.out.print("Enter Occupation:");
        String PersonType =  input.nextLine();

        return new Person(Lname, Fname, age, Height, Weight, PersonType);
    }


    public static Vehicle constructVehicle()
    {
        String Name;
        String PlateNum;
        int maxPass;
        System.out.println("Enter Vehicle Name: ");
        Name = input.nextLine();
        System.out.println("Enter Vehicle Plate Number: ");
        PlateNum=input.nextLine();
        System.out.println(Integer.valueOf("Enter Max Capacity: "));
        maxPass = input.nextInt();
        return new Vehicle(Name, PlateNum, maxPass);
    }
    public static void sortPeople(ArrayList<Person> people, Comparator<Person> comparator) 
    {
        people.sort(comparator);
    }
    
}
