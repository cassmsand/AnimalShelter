/**
 * @author cassandrasand
 * 
 * This class creates an animal shelter object. The shelters have four variables.
 * 	Name, total cages, number of animals, and a shelter ID.
 */

package dogApplication;

import java.util.Iterator;

public class AnimalShelter implements Iterable<Dog>{
	private String name;
	private Dog[] cages;
	private int numAnimals;
	private static int numShelters;
	private int shelterID;
	
	public AnimalShelter(String name, int numAnimals) {
		numShelters ++;
		this.name = name;
		this.numAnimals = 0;
		cages = new Dog[numAnimals];
		shelterID = numShelters;	
	}
	
	public void addAnimal(Dog dogToAdd) {
		cages[numAnimals++] = dogToAdd;
	}
	
	/**
	 * @param isBulldog is the animal a bull dog, true or false
	 * @param age the age of the animal
	 * @param name the name of the animal
	 */
	public void addAnimal(boolean isBulldog, int age, String name) {
		Dog dogToAdd = new Dog(isBulldog, age, name);
		addAnimal(dogToAdd);
	}
	/**
	 * @param dogObject the dog that may be in the shelter
	 * @return if the dog object is found in the cages, the return is true
	 */
	public boolean contains(Dog dogObject) {
		for (int i = 0 ; i < numAnimals ; i++) {
			if (cages[i].equals(dogObject))
				return true;
		}
		return false;
	}
	
	/**
	 * @param dogObject dog that may be in the shelter
	 * @return if the dog is found in the cages, the index of cages[] is returned for that dog
	 */
	public int cageNumber(Dog dogObject) {
		for (int i = 0; i < numAnimals; i++) {
			if (cages[i].equals(dogObject))
				return i;
		}
		return -1;
	}
	
	/**
	 * @return returns the youngest age of the animals in the cages of the shelter
	 */
	public int minAge() {
		int youngest = cages[0].getAge();
		for (int i = 0; i < numAnimals; i++) {
			if (cages[i].getAge() < youngest)
				youngest = cages[i].getAge();
		}
		return youngest;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumAnimals() {
		return numAnimals;
	}
	
	public int getShelterID() {
		return shelterID;
	}
	
	public boolean equals(AnimalShelter other) {
		if (shelterID == other.getShelterID()) {
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		String output = "";
		output += "Shelter number " + shelterID;
		output += " named " + name;
		output += " has the following animals available: \n";
		output += "Name\tAge\n";
		output += "***********\n";
		for (int i = 0; i < numAnimals ; i++)
			output += cages[i] + "\n";
		return output;
	}

	@Override
	public Iterator<Dog> iterator() {
		return new DogIterator();
	}
	
	private class DogIterator implements Iterator<Dog> {
		
		int cursor = 0;

		@Override
		public boolean hasNext() {
			return cursor < numAnimals;
		}

		@Override
		public Dog next() {
			return cages[cursor++];
		}
		
	}
	
}
