/**
 * @author CassieSand
 * 
 * This class creates/modifies an animal object. The animal has three variables.
 * Age, name, and ID.
 */

package dogApplication;

public class Animal {
	private int age;
	private String name;
	private int ID;
	private static int animalID = 0;
	
	public Animal(int age, String name) {
		animalID ++;
		this.age=age;
		this.name=name;
		this.ID=animalID;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void newID() {
		animalID ++;
		this.ID=animalID;
	}
	
	public boolean equals(Animal other) {
		return this.ID == other.getID();
	}

	public String toString() {
		String output = "";
		output += "Animal Age: " + age + "\n";
		output += "Animal Name: " + name + "\n";
		output += "Animal ID: " + ID + "\n";
		return output;
	}
	
	public void eat() {
		System.out.println("Yum, yum.");
	}
	
	
	
}
