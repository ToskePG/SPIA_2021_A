
public class CircularQueue {

	private Klijent[] red;
	private int front;
	private int rear;
	private int maxSize;
	private int brojKlijenta = 1;
	private String imeBanke;
	
	public CircularQueue(int maxSize, String imeBanke) {
		this.maxSize = maxSize;
		this.red = new Klijent[this.maxSize];
		this.front = -1;
		this.rear = -1;
		this.imeBanke = imeBanke;
	}

	public Klijent[] getRed() {
		return red;
	}

	public void setRed(Klijent[] red) {
		this.red = red;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getBrojKlijenta() {
		return brojKlijenta;
	}

	public void setBrojKlijenta(int brojKlijenta) {
		this.brojKlijenta = brojKlijenta;
	}

	public String getImeBanke() {
		return imeBanke;
	}

	public void setImeBanke(String imeBanke) {
		this.imeBanke = imeBanke;
	}
	
	public boolean isEmpty() {
		return front == -1;
	}
	
	public boolean isFull() {
		return (rear + 1) % maxSize == front;
	}
	
	public void enqueue(Klijent k) {
		if(isFull()) {
			System.out.println("Red je vec pun! ");
			return;
		}
		if(isEmpty()) {
			front = 0;
		}
		rear = (rear + 1) % maxSize;
		k.setBroj(brojKlijenta++);
		red[rear] = k;
	}
	
	public boolean dequeue() {
		if(isEmpty()) {
			System.out.println("Red je vec prazan. ");
			return false;
		}
		if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = (front + 1) % maxSize;
		}
		return true;
	}
	
	public void displayByTransakcija(String transakcija) {
		boolean indikator = false;
		if(transakcija.equalsIgnoreCase("privatni") || transakcija.equalsIgnoreCase("poslovni")) {
			if(isEmpty()) {
				System.out.println("Red je prazan");
				return;
			}else {
				int temp = front;
				while(temp != rear) {
					if(red[temp].getVrstaTransakcije().equalsIgnoreCase(transakcija)) {
						System.out.println(red[temp].toString());
						indikator = true;
					}
					temp = (temp + 1) % maxSize;
				}
				if(red[rear].getVrstaTransakcije().equalsIgnoreCase(transakcija)) {
					System.out.println(red[rear].toString());
					indikator = true;
				}
				if(indikator == false) {
					System.out.println("Nema klijenta koji cekaju ovu transakciju! ");
					return;
				}
				return;
			}
		}
		System.out.println("Tip transakcije nije validan. ");
		return;
	}
	
	public void displayLine() {
		System.out.println("Ime banke: " +this.imeBanke);
		if(isEmpty()) {
			System.out.println("Red je prazan.");
			return;
		}
		int temp = front;
		while(temp != rear) {
			System.out.println(red[temp].toString());
			temp = (temp + 1) % maxSize;
		}
		System.out.println(red[rear]);
	}
	
}
