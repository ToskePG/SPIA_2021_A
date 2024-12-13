
public class Test {

	public static void main(String[] args) {
		
		CircularQueue q1 = new CircularQueue(5, "CKB");
		
		Klijent k1 = new Klijent("Privatni", "Uplata");
		Klijent k2 = new Klijent("Poslovni", "Uplata");
		Klijent k3 = new Klijent("Privatni", "Isplata");
		
		
		q1.enqueue(k1);
		q1.enqueue(k2);
		q1.enqueue(k3);
		q1.dequeue();
		q1.displayLine();
		

	}

}
