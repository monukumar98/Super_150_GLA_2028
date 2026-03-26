package Lec31;



public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Student s = new Student();
		s.name = "Kaju";
		s.age = 20;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "raju";
		s1.age = 19;
		s1.Intro_yourSelf();
		s1.SayHey("Kamlesh");
		Student.MentorName();
	}
	static {
		System.out.println("hey mei static blcok main me hu ");
	}

}

