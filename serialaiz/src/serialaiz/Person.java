package serialaiz;

import java.io.Serializable;

public class Person /*implements Serializable*/ {
	
	protected transient boolean gender;
	
	public Person(){
		System.out.println("Person constryctor");
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
