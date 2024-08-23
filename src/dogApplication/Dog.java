/**
 * @author cassandrasand
 * 
 * This class describes a dog. There are four variables.
 * 	Is the dog a bulldog, age, name, and ID.
 */

package dogApplication;

public class Dog extends Animal implements Comparable<Dog>{
	private boolean isBulldog;
	
	public Dog(boolean isBulldog, int age, String name) {
		super(age, name);
		super.newID();
		this.isBulldog = isBulldog;
	}
	
	public boolean getIsBulldog() {
		return isBulldog;
	}
	
	public void setIsBulldog(boolean value) {
		isBulldog = value;
	}
	
	@Override
	public String toString() {
		String output = "";
		output += super.getName() + "\t\t";
		output += super.getAge() + "\t\t";
		return output;
	}
	
	public void eat() {
		super.eat();
		System.out.println("I am eating dog food.");
	}

	
	@Override
	public int compareTo(Dog other) {
		return other.getID() - super.getID();
	}
	
}
