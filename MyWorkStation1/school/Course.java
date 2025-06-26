package school;


import exersices.Student;

public class Course {
	private Student student;
	
	
	public void addStudent(Student student) {
		this.student=student;
		System.out.println("Added student: "+student.getName());
	}

	public void displayStudentInfo() {
		if (student != null) {
			System.out.println("Student Name: "+ student.getName());
			System.out.println("Grade:"+ student.getGrade());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
