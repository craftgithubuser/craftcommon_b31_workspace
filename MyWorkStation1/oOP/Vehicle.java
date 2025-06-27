package oOP;

public class Vehicle {
int passangers; 
int fuelcup;
int mpg;


public static void main(String[] args) {
		// TODO Auto-generated method stub

Vehicle minivan = new Vehicle();// object creation of object declaration Classname objectname = new Classname();
Vehicle Sportscar = new Vehicle();// object creation
Vehicle Ntre = new Vehicle();// vehicle is the blue print or the class of the object minivan or Sport car or Ntre
//Vehicle v1 = minivan;
//Vehicle v2 = Sportscar;
//Vehicle v3 = Ntre;
int range1, range2, range3;{

// assigning the first vehicle
minivan.passangers = 7;
minivan.fuelcup = 21;
minivan.mpg = 21;



// assigning the second vehicle
Sportscar.passangers = 2;
Sportscar.fuelcup = 14;
Sportscar.mpg = 12;

// assigning the 3rd vehicle.
Ntre.passangers = 3;
Ntre.fuelcup = 100;
Ntre.mpg = 10;

//doing some maths
range1 = minivan.fuelcup * minivan.mpg;
range2 = Sportscar.fuelcup * Sportscar.mpg;
range3 = Ntre.fuelcup * Ntre.mpg;

//if(v1.range1>v2.range1) {
//	System.out.println();
}
System.out.println("minivan can carry  "+ minivan.passangers+"with a range of "+ range1);
System.out.println("Sportscar can cary "+ Sportscar.passangers + "with a range of "+ range2);
System.out.println("Ntre can carry  "+ Ntre.passangers+"with a range of "+ range3);
	


}

}
	
	
	
	
	
