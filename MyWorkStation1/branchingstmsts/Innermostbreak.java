package branchingstmsts;

public class Innermostbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for ( int i=1; i<=2; i++){
			for (int j= 0; j<=3; j++){
				if(j==2)
					break;
			System.out.print(j + " ");
	
			}
		}
	
	
	
	}

}
// instead of break; if i use continue; it will only jump one iteration