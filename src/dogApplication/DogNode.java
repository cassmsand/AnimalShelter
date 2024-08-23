package dogApplication;

public class DogNode<E> {
	//Instance variables
	private E data; //dog element to hold
	private DogNode<E> link; //object behind
	
	//Constructor
	public DogNode(E elementToHold, DogNode<E> objectBehind) {
		data = elementToHold;
		link = objectBehind;
	}

	//Getters and Setters
	public E getData() {
		return data;
	}

	public DogNode<E> getLink() {
		return link;
	}

	public void setData(E data) {
		this.data = data;
	}

	public void setLink(DogNode<E> link) {
		this.link = link;
	}
	

	
	
	
	
}
