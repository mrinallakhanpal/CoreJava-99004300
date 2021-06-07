import java.util.Scanner;

class HotelRoom {

	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;

	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTraiff() {
		int res;

		res= numberOfSqFeet * getRatePerSqFeet();
		return res;
		
	}
	public int getRatePerSqFeet()
	{
		return 0;
	}
	
}

class DeluxeRoom extends HotelRoom{
	
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	public int getRatePerSqFeet()

	{
		if(hasWifi=true)
		{
			return ratePerSqFeet+2;
		}
		else
			return ratePerSqFeet;
	}
	
	
	
}

class DeluxeACRoom extends DeluxeRoom{
	
	protected int ratePerSqFeet;

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet,
			int ratePerSqFeet2) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
		this.ratePerSqFeet = 12;
	}
	
	
}

class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet()

	{
		if(hasWifi)
		{
			return ratePerSqFeet+2;
		}
		else
			return ratePerSqFeet;
	}
	
}


public class HotelRoomMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	   Scanner input = new Scanner(System.in);
	   System.out.println("Hotel Tariff Calculator");
       System.out.println(" 1. Deluxe Room\n 2. Deluxe AC Room\n 3. Suite AC Room");
       System.out.println("Select Room Type:");
       int choice=input.nextInt();
       switch(choice){
   	  case 1:
       System.out.println("Hotel Name:");
       String hotelName=input.next();
       System.out.println("Room Square Feet Area:");
       int numberOfSqFeet = input.nextInt();
       System.out.println("Room has TV (yes/no):");
       String tv = input.next();
       System.out.println("Room has Wifi (yes/no):");
       String wifi = input.next();
       if(wifi.equals("yes"))
       {  boolean hasWifi= true;
    	  DeluxeRoom r1= new DeluxeRoom(hotelName, numberOfSqFeet, false, false, numberOfSqFeet);
    	  
    	  r1.getRatePerSqFeet();
    	  System.out.println("Room Traiff per day is: "+r1.calculateTraiff());
       }
       else
       {
    	   boolean hasWifi = false;
    	   DeluxeRoom r1= new DeluxeRoom(hotelName, numberOfSqFeet, false, false, numberOfSqFeet);
     	  r1.getRatePerSqFeet();
     	 System.out.println("Room Traiff per day is: "+r1.calculateTraiff());
       }
       break;
   	case 2:
        System.out.println("Hotel Name:");
        String hotelName1=input.next();
        System.out.println("Room Square Feet Area:");
        int numberOfSqFeet1 = input.nextInt();
        System.out.println("Room has TV (yes/no):");
        String tv1 = input.next();
        System.out.println("Room has Wifi (yes/no):");
        String wifi1 = input.next();
        if(wifi1.equals("yes"))
        {  boolean hasWifi= true;
        DeluxeACRoom r2= new DeluxeACRoom(hotelName1, numberOfSqFeet1, hasWifi, hasWifi, numberOfSqFeet1, numberOfSqFeet1);
     	  
     	  
     	  System.out.println("Room Traiff per day is: "+r2.calculateTraiff());
        }
        else
        {
     	   boolean hasWifi = false;
     	  DeluxeACRoom r2= new DeluxeACRoom(hotelName1, numberOfSqFeet1, hasWifi, hasWifi, numberOfSqFeet1, numberOfSqFeet1);
      	  
      	 System.out.println("Room Traiff per day is: "+r2.calculateTraiff());
        }
        break;
   	case 3:
        System.out.println("Hotel Name:");
        String hotelName2=input.next();
        System.out.println("Room Square Feet Area:");
        int numberOfSqFeet2 = input.nextInt();
        System.out.println("Room has TV (yes/no):");
        String tv2 = input.next();
        System.out.println("Room has Wifi (yes/no):");
        String wifi2 = input.next();
        if(wifi2.equals("yes"))
        {  boolean hasWifi= true;
     	  
        SuiteACRoom r3= new SuiteACRoom(hotelName2, numberOfSqFeet2, hasWifi, hasWifi, numberOfSqFeet2);
     	  r3.getRatePerSqFeet();
     	  System.out.println("Room Traiff per day is: "+r3.calculateTraiff());
        }
        else
        {
     	   boolean hasWifi = false;
     	  SuiteACRoom r3= new SuiteACRoom(hotelName2, numberOfSqFeet2, hasWifi, hasWifi, numberOfSqFeet2); 
      	  r3.getRatePerSqFeet();
      	 System.out.println("Room Traiff per day is: "+r3.calculateTraiff());
        }
        break;
       default:
    	System.exit(0);
    	
   }
input.close();
}
}
