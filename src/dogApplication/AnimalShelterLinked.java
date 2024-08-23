package dogApplication;

public class AnimalShelterLinked {

	//instance variables
	private String name;
	private int shelterID;
	private static int numShelters;
	private DogNode head;
	private int manyNodes;
	
	//constructor
	public AnimalShelterLinked(String name) {
		numShelters ++;
		shelterID ++;
		this.name = name;
		this.shelterID = numShelters;
		
		head = null;
		manyNodes = 0;
	}
	
	//add method - adds a dog node and element to the Linked List
	public void addAnimal(Dog dogToAdd) {
		head = new DogNode(dogToAdd, head); //create new node object and set old head to object behind
		manyNodes ++;
	}
	
	public void addAnimalSorted(Dog dogToAdd) {
		if (head == null) //no elements in list
			head = new DogNode(dogToAdd, null);
		else if (dogToAdd.compareTo((Dog) head.getData()) > 0){ //Dog to Add should be inserted at beginning of list
			head = new DogNode(dogToAdd, head); //old head is put after new head
		}
		else { //Dog should be entered in middle or end
			DogNode previous = findPreviousNodeAdd(dogToAdd);
			previous.setLink(new DogNode(dogToAdd, previous.getLink()));
		}
		manyNodes ++;
	}
	
	private DogNode findPreviousNodeAdd(Dog dogToAdd) {
		DogNode cursor = head;
		while (cursor.getLink() != null && ((Dog) cursor.getLink().getData()).compareTo(dogToAdd) > 0) {
			cursor = cursor.getLink();
		}
		
		return cursor;
	}
	
	public void removeAnimal(Dog dogToRemove) {
		if (head != null && head.getData().equals(dogToRemove)) {
			head = head.getLink();
		}
		else if (head != null) {
			DogNode previous = findPreviousNodeRemove(dogToRemove);
			previous.setLink(previous.getLink().getLink());
		}
		manyNodes--;
	}
	
	private DogNode findPreviousNodeRemove(Dog dogToRemove) {
		DogNode cursor = head;
		while (cursor.getLink() != null && !(cursor.getLink().getData().equals(dogToRemove))) {
			cursor = cursor.getLink();
		}
		return cursor;
	}
	
	public String toString() {
		String output = "";
		output += "Shelter " + shelterID + " is named " + name + "\n";
		output += "Dog name" + "\t" + "Dog Age\n" ;
		output += "************************\n";
		
		DogNode cursor = head;
		while (cursor != null) {
			output += cursor.getData() + "\n";
			cursor = cursor.getLink();
		}
		return output;
	}
	
	
}
