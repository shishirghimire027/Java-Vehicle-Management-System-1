public class ElectricScooter extends Vehicle{
    //sub class of Vehicle class
   private int Range;
   private int BatteryCapacity;
   private int Price;
   private String ChargingTime;     //attributes
   private String Brand;
   private String Mileage;
   private boolean hasPurchased;
   private boolean hasSold;
   
   //values in parameter are initialized  in ElectricScooter constructor
   public ElectricScooter(int VehicleID, String VehicleName, String VehicleWeight, String VehicleSpeed, String VehicleColor, int BatteryCapacity){
       super(VehicleID, VehicleName, VehicleWeight, VehicleColor);
       
       super.setVehicleSpeed(VehicleSpeed);
       super.setVehicleColor(VehicleColor);
       
       
       this.Range = 0;
       this.BatteryCapacity = BatteryCapacity;
       this.Price = 0;
       this.ChargingTime = "";
       this.Brand = "";
       this.Mileage = Mileage;
       this.hasPurchased = false;
       this.hasSold = false;
    }
    public int getRange(){      //Crossponding accesor method for Range
        return this.Range;
    }
    public int getBatteryCapacity(){        //Crossponding accesor method for BatteryCapacity
        return this.BatteryCapacity;
    }
    public int getPrice(){      //Crossponding accesor method for Price
        return this.Price;
    }
    public String getChargingTime(){        //Crossponding accesor method for ChargingTime
        return this.ChargingTime;
    }
    public String getBrand(){       //Crossponding accesor method for Brand
        return this.Brand;
    }
    public String getMileage(){     //Crossponding accesor method for Mileage
        return this.Mileage;
    }
    public boolean getHasPurchased(){       //Crossponding accesor method for HasPurchased
        return this.hasPurchased;
    }
    public boolean getHasSold(){        //Crossponding accesor method for HasSold
        return this.hasSold;
    }
    public void setBrand(String Brand){     //setter method for Brand
        if(hasPurchased != true){       //checking the value of Brand
            this.Brand = Brand;
        }
        else {
            System.out.println("Brand cannot be changed as it's already purchased");
        }
    }
    public void purchase( String Brand,int Price,String ChargingTime, String Mileage, int Range){   //method to purchase electric scooter
        if(hasPurchased == false){
            setBrand(Brand);
            this.hasPurchased = true;
            this.Range = Range;
            this.Price = Price;
            this.ChargingTime = ChargingTime;
            this.Mileage = Mileage;
        }
        else {
            System.out.println("The Electric Scooter is already purchased.");
        }
    }
    
    public void sell(int Price){        //method to sell the electric scooter
        if(hasSold == false){
            this.Price = Price;
            this.ChargingTime = "";
            this.Mileage = "";
            this.BatteryCapacity =0;
            this.Range =0;
            this.hasSold = true;
            this.hasPurchased = false; 
        }
        else{
            System.out.println("The Vehicle is Sold out");
        }
    }
    public void DISPLAY(){      //method to display
        super.display();        //super keyword to call the display method of Vehicle class
        if(hasPurchased==false){
            System.out.println("The Electric Scooter brand is: " + Brand);
            System.out.println("The battery capacity of electric scooter is: " + BatteryCapacity);
            System.out.println("The electric scooter gives the mileage of: " + Mileage);
            System.out.println("The range of electric scooter is: " + Range);
            System.out.println("The charging time of scooter is: " + ChargingTime);
        }
    }
}