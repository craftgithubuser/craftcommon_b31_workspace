package JavaFullCourse;

import java.util.Scanner;

public class ProjectCalculateHypnothesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// project -->> write code that calculate the hypnothesis of triangle.
				
		double x;
		double y;
		double z;
		double m;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter side X:");
		x = scanner.nextDouble();
		
		System.out.println("please enter side y:");
		y= scanner.nextDouble();
		
		// this is our calculation but now we gonna call Math.sqrt then we gonna past this formula	(x*x)+(y*y);
		// in the () of sqrt and we gonna assign it to z		
	
		z =	Math.sqrt((x*x)+(y*y));
		
		m= Math.ceil(z);
		
		System.out.println("The hypnotenous result for adjucent z is :" + m);
		
		scanner.close();// we always have to close scanner as i did it.we must .. never forget.
		
		
	
		
		
		
		
		
		
	}

}
