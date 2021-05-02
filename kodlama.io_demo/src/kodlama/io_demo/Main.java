package kodlama.io_demo;

public class Main {

	public static void main(String[] args) {
		User user1=new User();
		user1.email="emre123";
		user1.registrationDate="132112";
		
		Student student1=new Student();
		student1.ponint=100;
		student1.firstName="Emre";
		
		Instructor instructor1=new Instructor();
		instructor1.salary=7500;
		instructor1.lastName="Hakkı";
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		userManager.add(user1);
		studentManager.add(student1);
		instructorManager.add(instructor1);
		
	}

}
