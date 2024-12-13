
public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push(Klijent k) {
		Node newNode = new Node(k);
		if(isEmpty()) {
			head = newNode;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
	
	public boolean ukloniKlijenta() {
		Node prev = null;
		if(isEmpty()) {
			System.out.println("Lista je prazna. ");
			return false;
		}
		Node temp = head;
		while(temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(null);
		return true;
	}
	
	public boolean ukloniPoVrijednosti(Klijent k) {
		Node prev = null;
		if(k.getVrstaKlijenta().equalsIgnoreCase("privatni")) {
			System.out.println("Privatni klijenti ne mogu biti uklonjeni! ");
			return false;
		}
		Node temp = head;
		while(temp.getNext() != null && temp.getData().getBroj() == k.getBroj()) {
			prev = temp;
			temp = temp.getNext();
		}
		if(temp.getNext() == null) {
			System.out.println("Taj klijent ne postiji.");
			return false;
		}
		prev.setNext(temp.getNext());
		return true;
	}

}
