package klase;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Podaci {

	public static List<Integer> dodajGodista() {
		
		int trenutnaGodina = Year.now().getValue();
		
		List<Integer> godista = new ArrayList<Integer>();

		for(int i = trenutnaGodina; i >= (trenutnaGodina-23); i--) {
			godista.add(i);
		}
		
		return godista;
	}
	
	
	public static List<String> dodajStanjaVozila() {
		
		List<String> stanjaVozila = new ArrayList<String>();
		stanjaVozila.add("Odlična");
		stanjaVozila.add("Dobra");
		stanjaVozila.add("Loša");
		stanjaVozila.add("Karamboliran");
		
		return stanjaVozila;
	}
	
	public static List<String> dodajOpreme() {
		
		List<String> opremeVozila = new ArrayList<String>();
		opremeVozila.add("Osnovna oprema");
		opremeVozila.add("Srednja oprema");
		opremeVozila.add("Potpuna oprema");
				
		return opremeVozila;
	}
	
	public static List<String> dodajMotore() {
		
		List<String> motori = new ArrayList<String>();
		motori.add("Osnovni benzinski");
		motori.add("Srednji benzinski");
		motori.add("Najjači benzinski");
		motori.add("Osnovni dizelski");
		motori.add("Srednji dizelski");
		motori.add("Najjači dizelski");
		
		return motori;
	}
	
	public static List<String> dodajMjenjace() {
		
		List<String> mjenjaci = new ArrayList<String>();
		mjenjaci.add("Ručni");
		mjenjaci.add("Automatski");
		
		return mjenjaci;
	}
	
	public static List<String> dodajVlasnike() {
		
		List<String> vlasnici = new ArrayList<String>();
		vlasnici.add("Prvi vlasnik");
		vlasnici.add("Drugi vlasnik");
		vlasnici.add("Treći i više");
		
		return vlasnici;
	}
}
