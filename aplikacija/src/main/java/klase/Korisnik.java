package klase;

public class Korisnik extends DodajVozilo {
	
	private int id;
	private Integer kId;
	private String nick,punoIme,ime,prezime;

	public Korisnik(int id, String nick, String punoIme, int kId){
		this.id=id;
		this.nick=nick;
		this.punoIme=punoIme;
		this.kId = kId;
	}
	
	
	public int getkId() {
		return kId;
	}

	public void setkId(int kId) {
		this.kId = kId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	

}
