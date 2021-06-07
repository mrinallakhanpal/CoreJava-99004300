import java.util.*;
class Vehicle {

	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;

	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void displayMake()
	{
		System.out.println("***"+make+"***");
	}
	
	public void displayBasicInfo()
	{
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Fuel Capacity:"+fuelCapacity);
		System.out.println("Cc:"+cc);
	}
	
	public void displayDeatilinfo()
	{
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
	
}



class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
        if(kickStartAvailable){
        System.out.println("Kick Start Available:YES");
	}
        else{
            System.out.println("Kick Start Available:NO");
        }
	}
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetaiInfo()
	{
	 System.out.println("Kick Start available(yes/no):"+kickStartAvailable);
	}
    
}
	
	
	


class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo()
	{
		System.out.println("Audio System:"+audioSystem);
    	System.out.println("Number of Doors:"+numberOfDoors);

	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}


public class VehicleMain {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int choice=sc.nextInt();
        	String make,number,audio,ftype,ksa;
        	int ftypech,capacity,cc,doors;
        	switch(choice){
            	case 1:
                System.out.println("Vehicle Make");
                make=sc.next();
                System.out.println("Vehicle Number");
                number=sc.next();
                System.out.println("Fuel Type: \n 1.Petrol \n 2.Diesel");
                ftypech=sc.nextInt();
                if(ftypech==1)
                {
                    ftype="Petrol";
                }
                else
                {
                    ftype="Diesel";
                }
                System.out.println("Fuel Capacity");
                capacity=sc.nextInt();
                System.out.println("Engine CC");
                cc=sc.nextInt();
                System.out.println("Audio System");
                audio=sc.next();
                System.out.println("Number of Doors");
                doors=sc.nextInt();
                FourWheeler car=new FourWheeler(make,number,ftype,capacity,cc,audio,doors);
                car.displayMake();
                car.displayBasicInfo();
                car.displayDetailInfo();
            	break;
            	case 2:
                System.out.println("Vehicle Make");
                make=sc.next();
                System.out.println("Vehicle Number");
                number=sc.next();
                System.out.println("Fuel Type: \n 1.Petrol \n 2.Diesel");
                ftypech=sc.nextInt();
                if(ftypech==1)
                {
                    ftype="Petrol";
                }
                else
                {
                    ftype="Diesel";
                }
                System.out.println("Fuel Capacity");
                capacity=sc.nextInt();
                System.out.println("Engine CC");
                cc=sc.nextInt();
                System.out.println("Kick Start Available");
                ksa=sc.next();
                
                if(ksa.equals("yes"))
                {
                TwoWheeler bike=new TwoWheeler(make,number,ftype,capacity,cc,true);
                bike.displayMake();
                bike.displayBasicInfo();
                bike.displayDetailInfo();
                }
                else
                {
                    TwoWheeler bike=new TwoWheeler(make,number,ftype,capacity,cc,false);
                    bike.displayMake();
                    bike.displayBasicInfo();
                    bike.displayDetailInfo();
                }
            break;
        }

        sc.close();
	}

}
