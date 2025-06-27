package anotherpackage;

import school.Student;

public class TestAccess {

	 public static void main(String[] args) {
		 Student student = new Student();
		 student.setName("Selam lante");// works (public method)
		 //student.name= selam lante// error private field
		 //student age= 20// error private field
	
	 
	 }


}
	

