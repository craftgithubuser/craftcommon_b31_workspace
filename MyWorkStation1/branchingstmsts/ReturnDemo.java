package branchingstmsts;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int k=25; k<31; k++)	{
	//	ReturnDemo m1= new ReturnDemo();
	//	m1.checkEven(k);
		
		new ReturnDemo().checkEven(k);
		
		
	}
		
	}	
	public boolean checkEven(int a) {
		if (a%2 ==0) {
			System.out.println(a + " is even number");
		return true;
		
		}
	System.out.println(a+ " is odd number");
	return false;
	}

}
