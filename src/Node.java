
public class Node {

	private Klijent data;
	private Node next;
	
	public Node(Klijent k) {
		this.data = k;
		this.next = null;
	}

	public Klijent getData() {
		return data;
	}

	public void setData(Klijent data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
