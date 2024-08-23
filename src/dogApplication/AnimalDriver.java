package dogApplication;

import java.util.Scanner;

public class AnimalDriver {

	public static void main(String[] args) {
		Dog myDog = new Dog(true, 2, "Bob");
		Dog yourDog = new Dog(false, 8, "Abby");
		Dog dog3 = new Dog(false, 5, "Sweetie");
		Dog dog4 = new Dog(true, 12, "Twinkle");
		
		Scanner scan = new Scanner(System.in);
		
		AnimalShelterLinked shelterOne = new AnimalShelterLinked("Shelter One");
		
		shelterOne.addAnimalSorted(myDog);
		shelterOne.addAnimalSorted(yourDog);
		shelterOne.addAnimalSorted(dog3);
		shelterOne.addAnimalSorted(dog4);
		shelterOne.removeAnimal(dog3);
		
		System.out.println(shelterOne.toString());
		
		
		
		AnimalShelter shelter1 = new AnimalShelter("Shelter 1", 10);
		
		shelter1.addAnimal(myDog);
		shelter1.addAnimal(yourDog);
		shelter1.addAnimal(true, 5, "Pinkie");
		
		
		System.out.println(shelter1);
		
	
		System.out.print("Does shelter one contain my dog: ");
		System.out.println(shelter1.contains(myDog));
		
		System.out.print("If shelter one contains your dog, return the cage number: ");
		System.out.println(shelter1.cageNumber(yourDog));
		
		System.out.print("What is the minimum age of the dogs in shelter one: ");
		System.out.println(shelter1.minAge());

	}

}
