public class AutoRickshaw extends Vehicle{      
    //subclass of Vehicle class
    private int EngineDisplacement;
    private String Torque;
    private int NoOfSeats;
    private int FTankCapacity;          
    private String GroundClearance;         // attributes
    private int ChargeAmount;
    private String BookedDate;
    private boolean IsBooked;

    // values in parameters are initialized in AutoRickshaw constructor
public AutoRickshaw(int VehicleID, String VehicleName, String VehicleWeight, String VehicleColor, String VehicleSpeed,
int EngineDisplacement, String Torque, int FTankCapacity, String GroundClearance){
    super(VehicleID, VehicleName, VehicleWeight, VehicleColor);   
    
    
    VehicleColor = VehicleColor;
    VehicleSpeed = VehicleSpeed;
    
    this.EngineDisplacement = EngineDisplacement;
    this.Torque = Torque;
    this.FTankCapacity = FTankCapacity;
    this.GroundClearance = GroundClearance;
    
    
    super.setVehicleColor(VehicleColor);
    super.setVehicleSpeed(VehicleSpeed);
    
    
    this.IsBooked = false;
}
public int getEngineDisplacement(){     //Crossponding accesor method for EngineDisplacement
    return this.EngineDisplacement;
}
public String getTorque(){      //Crossponding accesor method for Torque
    return this.Torque;
}
public int getNoOfSeats(){      //Crossponding accesor method for NoOfSeats
    return this.NoOfSeats;
}
public int getFTankCapacity(){      //Crossponding accesor method for Fuel tank capacity
    return this.FTankCapacity;
}
public String getGroundClearance(){     //Crossponding accesor method for GroundClearance
    return this.GroundClearance;
}
public int getChargeAmount(){       //Crossponding accesor method for  chargeAmount
    return this.ChargeAmount;
}
public String getBookedDate(){      //Crossponding accesor method for BookedDate
    return this.BookedDate;
}
public boolean getIsBooked(){       //Crossponding accesor method for IsBooked
    return this.IsBooked;
}
public void setChargeAmount(int ChargeAmount){      //setter method  for ChargeAmount
    this.ChargeAmount = ChargeAmount;
}
public void setNoOfSeats(int NoOfSeats){        //setter method for NoOfSeats
    this.NoOfSeats = NoOfSeats;
}
public void BookAutoRickshaw(String BookedDate, int ChargeAmount, int NoOfSeats){       //Method to book an AutoRickshaw
    if(IsBooked == true){
        System.out.println("The Auto Rickshaw is booked");
        System.out.println("Status: " +IsBooked);
    }
    else{
        this.IsBooked = true;
        this.setChargeAmount(ChargeAmount);
        this.setNoOfSeats(NoOfSeats);
        this.BookedDate = BookedDate;
    }
}
public void Display(){      //Method to display
    super.display();        //Super keyword to call display method of Vehicle class
    if(IsBooked == true){
        System.out.println("The Engine Displacement is: " + EngineDisplacement);
        System.out.println("The torque is :" + Torque);
        System.out.println("The Number of Seats are :" + NoOfSeats);
        System.out.println("The total fuel tank capacity is :" + FTankCapacity);
        System.out.println("The Ground Clearance is :" + GroundClearance);
        System.out.println("The total charged amount is :" + ChargeAmount);
        System.out.println("The booking date is :" + BookedDate);
}
}
}
    

