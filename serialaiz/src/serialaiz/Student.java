package serialaiz;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = -1473069181952331307L;
	
	public static int id;
	private String name;
	private int age;
	public int mark;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.mark = 10;
		System.out.println("Student constryctor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "id" + id + "gender=" + gender + "]";
	}

	
	
}
