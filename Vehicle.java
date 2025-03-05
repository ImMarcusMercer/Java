import java.util.ArrayList;

public class Vehicle {
    String Name, PlateNum;
    int maxPassengers;
    ArrayList<Person> Passengers;
    int passengerCount;
    public Vehicle(){}
    public Vehicle(String Name, String PlateNum, int maxPass)
    {
        this.Name=Name;
        this.PlateNum=PlateNum;
        this.maxPassengers=maxPass;
        this.Passengers= new ArrayList<>();
        this.passengerCount=0;
    }
    public String getName()
    {
        return  this.Name;
    }
    public void increasePassengers()
    {
        this.passengerCount +=1;
    }
    public void decreasePassengers()
    {
        this.passengerCount -=1;
    }
    public void addPassenger(Person newPassenger)
    {
        if(this.passengerCount < this.maxPassengers)
        {
            this.Passengers.add(newPassenger);
            this.increasePassengers();
            System.out.println("\n"+newPassenger.getFullname()+" has entered the "+this.Name+".");
        }
        else if(this.passengerCount >= this.maxPassengers)
        {
        System.out.println(newPassenger.getFullname()+" cannot enter. Vehicle is full!");
        }
    }
    public void removePassenger(Person newPassenger)
    {
        if(this.passengerCount <= 0)
        {
            System.out.println("Vehicle is already empty");
        }
        this.Passengers.remove(newPassenger);
        this.decreasePassengers();
        System.out.println("\n"+newPassenger.getFullname()+" has exited the Vehicle!");
    }

    /**Check if passenger is on the vehicle
     * 
     * @param PersontoCheck
     * @return True if PersontoCheck is in Vehicle, else false.
     */
    public boolean checkPassenger(Person PersontoCheck)
    {
        for(Person Passenger:Passengers)
        {
            if(Passenger==PersontoCheck)
            {
                return true;
            }
        }
        
        return false;
    }
    /**Sort passengers based on Last Name, Full Name, Age,
     * BMI, PersonType
     */
    public void sortPassengers()
    {

    }
    public void swapPassengers()
    {

    }
    public String getSeatArrangement()
    {
        int count=1;
        String result = "";
        for(Person passenger: this.Passengers)
        {
            result+="Seat "+count+": "+passenger.getFullname()+"\n";
            count+=1;
        }

        return result;
    }
    /**Name: (Vehicle Name)
     * Plate Number: (Vehicle Plate Number)
     * Max Capacity: (Vehicle Max Cap)
     * Passengers: (Number of current passengers)
     * List of Passengers
     */
    @Override
    public String toString()
    {
        return "\n=====Vehicle Datails=====\nVehicle Name: "+this.Name+"\nPlate Number: "+this.PlateNum+
        "\nMax Capacity: "+this.maxPassengers+"\nPassengers: "
        +this.passengerCount+"\n"+this.getSeatArrangement();
    }
}

