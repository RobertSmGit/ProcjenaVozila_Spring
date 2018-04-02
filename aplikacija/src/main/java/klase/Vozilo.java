package klase;


public class Vozilo {
	int id;
	double cijena;
	Korisnik korisnik;
	AutomobilMarka automobilMarka;
	AutomobilModel automobilModel;
	AutomobilKarakteristike automobilKarakteristike;
	
	public Vozilo(int id, Korisnik korisnik, AutomobilMarka automobilMarka, AutomobilModel automobilModel, AutomobilKarakteristike automobilKarakteristike, double cijena){
		this.id=id;
		this.cijena = cijena;
		this.korisnik = korisnik;
		this.automobilMarka = automobilMarka;
		this.automobilModel = automobilModel;
		this.automobilKarakteristike = automobilKarakteristike;
	}
	
	
	
	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

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
