import java.util.Scanner;
public class hypotnousMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	double x = 3.14;
		double y = -10;
		
		double z = Math.max(x,y);
		double n = Math.min(x,y);
		double z = Math.abs(y);
		double z = Math.round(x);
		double z = Math.Ceil(x); round up to the nearest highest number which is 4
		double z = Math.Floor(x); round up to the nearest lower number which is 3
		System.out.println(z);
		System.out.println(n);  
		System.out.println(y);   // this will print the value of absolute y absolute value means the number without the negative sign */
	//project  find the hypotenuse of c	

		double x;
		double y;
		double z;
		
		Scanner Scanner= new Scanner(System.in);
		
		System.out.println("Enter side x:");
		x = Scanner. nextDouble();
		System.out.println("Enter side y:");
		y= Scanner. nextDouble();
		
		z= Math.sqrt((x*x)+(y*y));
		System.out.println("the hypotnoous answer is :" +z);
		
		
	}

}
