package Lec31;

public class Student {

	int age;
	String name;

	public void Intro_yourSelf() {
		System.out.println("My name is " + this.name + " and age is " + this.age);
	}

	public void SayHey(String name) {
		System.out.println(name + " say  hey " + this.name);

	}

	public static void MentorName() {

		System.out.println("Monu Bhaiya" + " ");
	}
	static {
		System.out.println("hey mei static blcok1 me hu ");
	}
	static {
		System.out.println("hey mei static blcok2 me hu ");
	}
}










