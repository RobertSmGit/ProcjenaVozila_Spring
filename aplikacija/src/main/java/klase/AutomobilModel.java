package klase;

public class AutomobilModel {
	
	
	private String naziv;
	private double cijena;
	private Integer bId;
	
	public AutomobilModel(String naziv, double cijena, int bId) {
		this.naziv = naziv;
		this.cijena = cijena;
		this.bId = bId;
	}

	
	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = Math.round(cijena*100)/100;
	}
	
	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
}
