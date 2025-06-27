package icraftKnowledgeJavaExersice;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	int i = 0;
	do {
				
			System.out.println("Hello Java");
				
		}
			
	while (i<5) ;
	i++;
	*/	
	int sum = 0;
	//int n = 1000;
	for (int i = 1; i<=1000; ++i ) {
	 sum = i*(i+1)/2;
	}
	System.out.println("the sum of all number is :" + sum );
	
	// do while loop with exersice.
	
	int n = 1;
	
	while(n<=5) {
		System.out.println("using do while i can print 1 to 5: " + n);
		n++;
	}
	
	//example 2 sum of positive number only using do while.
	
	int x = 2;
	
	int sumx=0;// sumx is jus variable name i created.. i can change it to anything ealse.
	
	while(x<1000) {
		sumx +=x; // add even numbers to sum
		x += 2;   // move to the next even numbers.
	}
	System.out.println("adding up even numbers up to 1000"+ sumx);
	}
}
