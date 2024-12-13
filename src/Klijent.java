import java.util.Scanner;

public class Klijent {
	
	private int broj;
	private String vrstaKlijenta;
	private String vrstaTransakcije;
	
	public Klijent(String vrstaKlijenta, String vrstaTransakcije) {
		setVrstaKlijenta(vrstaKlijenta);
		this.vrstaTransakcije = vrstaTransakcije;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getVrstaKlijenta() {
		return vrstaKlijenta;
	}

	public void setVrstaKlijenta(String vrstaKlijenta) {
		Scanner input = new Scanner(System.in);
		while(!(vrstaKlijenta.equalsIgnoreCase("poslovni") || vrstaKlijenta.equalsIgnoreCase("privatni"))) {
			System.out.println("Klijent mora biti privatni ili poslovni! Unesite vrijednost ponovo. ");
			vrstaKlijenta = input.nextLine();
		}
		this.vrstaKlijenta = vrstaKlijenta;
	}

	public String getVrstaTransakcije() {
		return vrstaTransakcije;
	}

	public void setVrstaTransakcije(String vrstaTransakcije) {
		this.vrstaTransakcije = vrstaTransakcije;
	}

	@Override
	public String toString() {
		return "Klijent [broj=" + broj + ", vrstaKlijenta=" + vrstaKlijenta + ", vrstaTransakcije=" + vrstaTransakcije
				+ "]";
	}
	
}
