package branchingstmsts;

public class ContinueInWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i= 1;
		while (i<10){
		if(i==5){
		i++;
		continue;
		}
		System.out.print(i+ " ");
		i++;
		}

	}

}
// because of continue statement five will be jumped 