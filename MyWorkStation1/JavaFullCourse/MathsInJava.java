package JavaFullCourse;

public class MathsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.abs(value) is is absolute value of the variables value eg if i see any negative number abs birngs out the postive.
		// abs value of -10 is 10.. this is typical maths

	
	double x = 3.14;
	double y = -99;
	double z = 36;
	double m = 3.6;
	
	double a = Math.abs(y);	// abs refer to absolute 
	double b = Math.max(x, y);
	double c = Math.min(x, y);
	double d = Math.sqrt(z);	//sqrt refer to square root
	double e = Math.round(m);	
	double f = Math.ceil(x);	// ceiling gives us a result to round to the next up number
	double g = Math.floor(x);	// flooring gives us a result to the next down number
	
	System.out.println("your absolute number is: "+a);
	System.out.println("your max value is: "+b);
	System.out.println("your min value for out put c is: "+c);
	System.out.println("the square root for out put d is: "+d);
	System.out.println("the round value for out put e is: "+e);
	System.out.println("the ceiling value for out put f is: "+f);
	System.out.println("the flooring value for out put g is: "+g);
	
	// project do the code that calculate the hypothesis of triangle.
	
	}

}
