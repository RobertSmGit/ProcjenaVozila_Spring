package klase;

import java.beans.PropertyEditorSupport;

public class KorisnikEditor extends PropertyEditorSupport {
	
	private KorisnikRepository korisnikRepository;
	
	public KorisnikEditor(KorisnikRepository korisnikRepository){
		this.korisnikRepository=korisnikRepository;
	}
	
	
	@Override
	public void setAsText(String text) {
		Korisnik k = null;
		
		for (Korisnik korisnik : korisnikRepository.findAll()) {
			if (korisnik.getId()==Integer.parseInt(text)) {
				k = korisnik;
				break;
			}
		}
		this.setValue(k);
	}


	@Override
	public String getAsText() {
		Korisnik k = (Korisnik) this.getValue();
		return (k != null ? Integer.toString(k.getId()) : "");
	}
}
