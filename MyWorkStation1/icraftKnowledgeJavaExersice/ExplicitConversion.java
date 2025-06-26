package icraftKnowledgeJavaExersice;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double d = 120.04;
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Double value: "+d);
		System.out.println("Long value: "+l);
		System.out.println("Int value: "+i);
	}

}
/*
in java type casting is classified into two types,
1 widening Casting(implicit):

		byte--->short--->int--->long--->float--->double
		widening--->
		 		
2 Narrowing Casting(Explicitly done):
	
		double--->float--->long--->int--->short--->byte
		narrowing--->

*/