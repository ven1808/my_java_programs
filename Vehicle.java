public class Vehicle
{
    // Public data members
    public String brandName;
    public String modelName;
    public String colour;
    public double price;
    public int passengerCapacity;
    public char fuelType;

    // Private data member
    private String mfgId;   // alphanumeric

    // Default constructor
    public Vehicle()
    {
        brandName = "Mercedes";
        modelName = "Class C";
        colour = "White";
        mfgId = "DHF8723";
        price = 0;
        passengerCapacity = 0;
    }

    // Parameterized constructor
    // to define a similar constructor, the sequence or the datatypes must be diff
    public Vehicle(String brandName, String modelName, double price)
    {
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
    }

//getter and setter methods are only for private data member

    // Another parameterized constructor
    public Vehicle(String brandName, int passengerCapacity, String colour)
    {
        this.brandName = brandName;
        this.passengerCapacity = passengerCapacity;
        this.colour = colour;
    }

    // Copy constructor - creates an exact copy of an existing object 
    public Vehicle(Vehicle v)
    {
        this.brandName = v.brandName;
        this.modelName = v.modelName;
        this.colour = v.colour;
        this.price = v.price;
        this.passengerCapacity = v.passengerCapacity;
        this.mfgId = v.mfgId;
    }

    // Getter and Setter for private member
    public void setMfgId(String mfgId)
    {
        this.mfgId = mfgId;
    }

    public String getMfgId()
    {
        return mfgId;
    }

    // Methods
    public void start()
    {
        System.out.println("This vehicle has started.");
    }

    public void drive()
    {
        System.out.println("This vehicle can be driven on all surfaces.");
    }

    public void stop()
    {
        System.out.println("Stop the ignition. You are at 0 kmph now!");
    }

    public float changeSpeed(float initSp)
    {
        if (initSp < 20)
            return initSp + 20;
        else
            return initSp - 20;
    }

    public float mileage(float fuelUsed, float distance)
    {
        if (fuelType == 'p')
        {
            float mileage = distance / fuelUsed;
            return mileage;
        }
        else
        {
            float mileage = distance / fuelUsed;
            return (mileage - (mileage/10));

        }
        
    }

    // Main method
    public static void main(String[] args)
    {
        // Vehicle 1
        // Constructor name must be the same as the class name
        // Constructor has no return type
        // This is a default constructor (no parameters)
        // Constructors can be overloaded (default, parameterized, copy)
        Vehicle v1 = new Vehicle();
        v1.brandName = "Honda";
        v1.modelName = "Accord";
        v1.colour = "Blue";
        v1.price = 2500000.45;
        v1.fuelType = 'p';
        v1.passengerCapacity = 5;
        v1.setMfgId("XYZ1234");

        //vehicleDetails(v1);

        // Vehicle 2
        Vehicle v2 = new Vehicle("Hyundai", "Creta", 2200000);
        v2.colour = "Silver";
        v2.passengerCapacity = 6;
        v2.setMfgId("ABC456");
        v2.fuelType = 'p';

        //vehicleDetails(v2);

        // Vehicle 3
        Vehicle v3 = new Vehicle();
        v3.brandName = "Bharat ";
        v3.modelName = "Ship";
        v3.colour = "Blue";
        v3.price = 250000000;
        v3.passengerCapacity = 300;
        v3.setMfgId("XYZ5678");
        v3.fuelType = 'd';

        //vehicleDetails(v3);

        // Vehicle 4 (copy constructor)
        Vehicle v4 = new Vehicle(v3);
        v4.brandName = "Hyundai";
        v4.colour = "Black";
        v4.setMfgId("HYN38746");
        v4.fuelType = 'd';

        //vehicleDetails(v4);
        
        System.out.println("Brand \t\tModel \t\tColour\t \tPrice \t\tCapacity\t\tMfgID\t\tMileage ");
        System.out.println("---------------------------------------------------------------");

        Vehicle[] myFleet = { v1, v2, v3, v4 };
        for (Vehicle v : myFleet)
        {
            vehicleDetails(v);
            
        }
}

    // Static method to print vehicle details
   public static void vehicleDetails(Vehicle v)
   {
    System.out.println(
        v.brandName + "\t\t" +
        v.modelName + "\t\t" +
        v.colour + "\t\t" +
        v.price + "\t\t" +
        v.passengerCapacity + "\t\t" +
        v.getMfgId() + "\t\t" +
        v.mileage(3, 12)
    );
       
   }

}