package com.day7.array;

public class StudentAgeManger {

	public static void main(String[] args) {
		
		int [] ageOfStudents = new int[5]; //index = 0 - 4
		
		//To insert or set data to array:
		ageOfStudents[0] = 23;
		ageOfStudents[1] = 20;
		ageOfStudents[2] = 33;
		ageOfStudents[3] = 31;
		ageOfStudents[4] = 25;

		//accessing array data:
		// while loop, for loop, for-each loop
		
//		for(int i=0; i<ageOfStudents.length; i++) {
//			
//			System.out.print(ageOfStudents[i] + " ");
//			
//		}
		
		for(int elt : ageOfStudents) {
		
			System.out.print(elt + " ");
			
		}
		

	}

}
