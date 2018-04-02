package klase;


import java.util.List;

public interface KorisnikRepository {
	
	List<Korisnik> findAll();
	Korisnik findOne(String nick);
	Korisnik findById(Integer id);
}
