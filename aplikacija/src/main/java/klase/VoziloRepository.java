package klase;

import java.util.List;


public interface VoziloRepository {
	
	List<Vozilo> findAll();
	Vozilo save(Vozilo vozilo);
	Vozilo findOne(Integer id);
	List<Vozilo> findByKorisnickoIme(String korisnickoIme);
	void delete(Integer id);
}
