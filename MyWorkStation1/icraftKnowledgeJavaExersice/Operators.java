package icraftKnowledgeJavaExersice;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  d, e;
		int a = 40;
		int b = 19;
		int c = 22;
		d =13;
		e = 12;
		boolean m, n;
		m = true;
		n = false;
		
		System.out.println(m && n);
		System.out.println(m || n);
		System.out.println("m && n"+ !(m && n));
		
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a != c);
		System.out.println(c>d);
		System.out.println(b>=e);
		System.out.println(c<d && d>e);
		
// assignment operands
		
		System.out.println( a=b) ;
			System.out.println( a=b);
		System.out.println(a+=b);
			System.out.println(a=a+b);
		System.out.println(a-=c);
			System.out.println(a=a-c);
		System.out.println(a*= d);
			System.out.println(a=a*d);
		System.out.println(a/=e);
			System.out.println(a=a/e);
		System.out.println(a%=c);
			System.out.println(a=a%c);
		
		
	}

}
