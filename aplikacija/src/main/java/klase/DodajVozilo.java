package klase;


public class DodajVozilo {
	private int id;
	private Korisnik korisnik;
	private AutomobilModel automobilModel;
	private AutomobilMarka automobilMarka;
	private AutomobilKarakteristike automobilKarakteristike;
	
	public AutomobilKarakteristike getAutomobilKarakteristike() {
		return automobilKarakteristike;
	}
	public void setAutomobilKarakteristike(AutomobilKarakteristike automobilKarakteristike) {
		this.automobilKarakteristike = automobilKarakteristike;
	}
	
	public AutomobilMarka getAutomobilMarka() {
		return automobilMarka;
	}
	public void setAutomobilMarka(AutomobilMarka automobilMarka) {
		this.automobilMarka = automobilMarka;
	}
	
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	public AutomobilModel getAutomobilModel() {
		return automobilModel;
	}
	public void setAutomobilModel(AutomobilModel automobilModel) {
		this.automobilModel = automobilModel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
