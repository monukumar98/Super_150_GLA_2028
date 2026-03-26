package Lec31;

public class Person {
	private int age = 16;
	private String name = "Raj";

//	public Person() {
//		// TODO Auto-generated constructor stub
//	}

//	public Person(int age) {
//		// TODO Auto-generated constructor stub
//	}

	public Person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0 || age > 90) {
				throw new Exception("Bklol age sahi nhi h");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("I am in finally  bolcks");
		}
	}
//	public void setAge(int age)throws Exception {
//		if (age < 0 || age > 90) {
//			throw new Exception("Bklol age sahi nhi h");
//		}
//		this.age = age;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
