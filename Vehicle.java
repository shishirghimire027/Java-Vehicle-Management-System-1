public class Vehicle{
    // Vehicel is the parent class
    private int VehicleID;      //VehicleID attribute in int data type
    private String VehicleName;     //VehicleName attribute in String data type
    private String VehicleWeight;   //VehicleWeight attribute in String data type
    private String VehicleColor;    //VehicleColor attribute in String data type
    private String VehicleSpeed;    //VehicleSpeed attribute in String data type
    
    public Vehicle( int VehicleID, String VehicleName, String VehicleColor,String VehicleWeight){
        // Vehicle constructor initializing VehicleID, VehicleName, VehicleColor, VehicleWeight in parameters
        this.VehicleID = VehicleID;
        this.VehicleName = VehicleName;
        this.VehicleColor = VehicleColor;
        this.VehicleWeight  =  "";
    }
    public int getVehicleID(){      //Crossponding accesor method for VehicleID
        return this.VehicleID;
    }
    public String getVehicleName(){     //Crossponding accesor method for VehicleName
        return this.VehicleName;
    }
    public String getVehicleColor(){       //Crossponding accesor method for VehicleColor
        return this.VehicleColor;
    }
    public String getVehicleWeight(){       //Crossponding accesor method for VehicleWeight
        return this.VehicleWeight;
    }
    public String getVehicleSpeed(){        //Crossponding accesor method for VehicleSpeed
        return this.VehicleSpeed;
    }
    public void setVehicleSpeed(String VehicleSpeed){      //setter method for VehicleSpeed
        this.VehicleSpeed = VehicleSpeed;
    }
    public void setVehicleColor(String VehicleColor){       //setter method for Vehicle Color
        this.VehicleColor = VehicleColor;
    }
    public void display(){         //display method
        System.out.println("The Vehicle ID is " + VehicleID);
        System.out.println("The Vehicle Name is " + VehicleName);
        System.out.println("The Vehicle Color is " + VehicleColor);
        System.out.println("The Vehicle Speed is " + VehicleSpeed);
        if(VehicleWeight==""){
            System.out.println("The is empty");
        }
        else
        {
            System.out.println("The Vehicle Weight is " + VehicleWeight);
        }
}
}
