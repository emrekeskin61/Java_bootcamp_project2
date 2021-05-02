
public class Main {

	public static void main(String[] args) {
		
		 User user = new User();
	        user.setId(1);
	        user.setFullName("yusf Keskin");
	        user.setPassword("1233");
	        user.setEmail("deneme634@gmail.com");
	        System.out.println(user.getFullName());

	        UserManager userManager = new UserManager();
	        userManager.login(user);
	        userManager.logout(user);


	        System.out.println("<<<<<<<<<>>>>>>>>");


	        Instructor instructor = new Instructor();
	        instructor.setId(2);
	        instructor.setFullName("Engin Demirog");
	        instructor.setEmail("engindemirog@hotmail.com");
	        instructor.setInstructorNumber("1234556");
	        instructor.setLectureGiven("Java");
	        System.out.println(instructor.getFullName());

	        InstructorManager instructorManager = new InstructorManager();
	        instructorManager.courseInformation(instructor);

	        System.out.println("<<<<<<<<<>>>>>>>>");


	        Student student = new Student();
	        student.setId(1);
	        student.setFullName("emre keskin");
	        student.setPassword("15963");
	        student.setStdNumber("38557252");
	        System.out.println(student.getFullName());

	        StudentManager studentManager = new StudentManager();
	        studentManager.add(student);
	        studentManager.delete(student);
	        studentManager.uptade(student);
	}

}
