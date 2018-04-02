package klase;

public class AutomobilKarakteristike {
	
	
	private int godiste;
	private double kilometraza;
	private String ocuvanost;
	private String oprema;
	private String motor;
	private String mjenjac;
	private String vlasnik;
	
	public AutomobilKarakteristike (int godiste, double kilometraza, String ocuvanost, String oprema, String motor, String mjenjac, String vlasnik) {
		this.godiste = godiste;
		this.kilometraza = kilometraza;	
		this.ocuvanost = ocuvanost;
		this.oprema = oprema;
		this.motor = motor;
		this.mjenjac = mjenjac;
		this.vlasnik = vlasnik;
	}
	
	public AutomobilKarakteristike() {}
	
	public int getGodiste() {
		return godiste;
	}
	
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	
	public double getKilometraza() {
		return kilometraza;
	}
	
	public void setKilometraza(double kilometraza) {
		this.kilometraza = kilometraza;
	}

	public String getOcuvanost() {
		return ocuvanost;
	}

	public void setOcuvanost(String ocuvanost) {
		this.ocuvanost = ocuvanost;
	}

	public String getOprema() {
		return oprema;
	}

	public void setOprema(String oprema) {
		this.oprema = oprema;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMjenjac() {
		return mjenjac;
	}

	public void setMjenjac(String mjenjac) {
		this.mjenjac = mjenjac;
	}

	public String getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}
	
}
