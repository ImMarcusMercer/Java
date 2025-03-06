package Main;

public class Person {
    String Lname, Fname;
    int age;
    double Height, Weight;
    String PersonType;
    public Person(){}
    public Person(String Lname, String Fname, int age, double Height, double Weight, String PersonType)
    {
        this.Lname= Lname;
        this.Fname= Fname;
        this.age=age;
        this.Height= Height;
        this.Weight= Weight;
        this.PersonType= PersonType;
    }
    public String getLname() {
        return Lname;
    }
    public String getFname() {
        return Fname;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return Height;
    }
    public double getWeight() {
        return Weight;
    }
    public String getPersonType() {
        return PersonType;
    }
    /**Calculate Body Mass Index
     * @param - Weight of Person
     * @param - Height of Person in cm
     */
    public double getBMI()
        {
            //BMI = w/h^2
            double meter = this.Height /100;
            double BMI = this.Weight /(meter*meter);
            return BMI;
        }
    public String getFullname()
    {
        // return String.format("%s, %s", this.Lname, this.Fname);
        return this.Lname+this.Fname;
    }
    @Override
    public String toString()
    {
        return String.format("\nName: %s, %s\nAge: %d\nHeight: %s\nWeight: %s\nBody Mass Index: %f\nType: %s", this.Lname, this.Fname, this.age,this.Height,this.Weight,this.getBMI(),this.PersonType);
    }
}
