package JavaFullCourse;

import java.util.Random;

public class generateRandomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Random random = new Random();
	
   // int x = random.nextInt(10000)+1;
   // double y = random.nextDouble(200)+1;
	// float z = random.nextFloat();
	//boolean b = random.nextBoolean();
	
	long l = random.nextLong(1000000000)+1;
	
	System.out.println(l);
	
	}

}
// i like it.. key here is importing Random on the class file
//import java.util.Random;
// then on main method.. we gonna call it.. like Random random = new Random();
// then we declair variables like int x = random.next();
//								 double y random.nextDouble(12); to limit ew put number in the parenthesis.