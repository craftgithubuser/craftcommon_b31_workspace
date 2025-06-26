package school;

 
// Student name with constructors and methods
	public class Student {
		
	private String name ;
	private int age;
	private int grade;

	// default constructors

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.grade = 0;

	}
	// with parameter

	public Student(String name, int age, int grade) {
		
		this.name=name;
		this.age=age;
		this.grade=0;
	}
	// public getter

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public  int getGrade() {
		return grade;
	}

	// setter method



	public void setName(String name) {
		this.name=name;
		
	}
	public void setAge(int age) {
		this.age=age;
	}

	public void setGrade(int grade) {
		this.grade=grade;
	}

	// with parameter 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student student1 = new Student ("Ashu bilishu", 23, 12);
			System.out.println("Student: "+ student1.getName()+"\n age: "+ student1.getAge() + "\n grade: "+student1.getGrade() );

		}

	}


