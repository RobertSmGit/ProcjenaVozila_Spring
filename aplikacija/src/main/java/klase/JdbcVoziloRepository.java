package klase;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class JdbcVoziloRepository implements VoziloRepository {
	
	private static final String SELECT_VOZILO = "select v.id, "
			+ "v.korisnik, v.automobilMarka, v.automobilModel, v.godiste, v.kilometraza, v.cijena, v.ocuvanost, v.oprema, v.motor, v.mjenjac, v.vlasnik, "
			+ "model.naziv, model.cijena, model.bId, "
			+ "marka.idKeyMarka, marka.marka, marka.markaId, "
			+ "k.id as korisnikId, k.username, k.ime, k.prezime, k.username, k.kId "
			+ "from Vozilo v, AutomobilModel model, AutomobilMarka marka, User k "
			+ "where v.automobilModel = model.naziv and v.korisnik = k.username and v.automobilMarka=marka.marka";
	
	private static final String SELECT_VOZILO_BY_ID = SELECT_VOZILO + " and v.id =?";
	
	private static final String SELECT_VOZILO_BY_KORISNICKO_IME = SELECT_VOZILO + " and v.korisnik =?";

	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcVoziloRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	 }

	
	@Override
	public List<Vozilo> findAll() {
		return jdbcTemplate.query(SELECT_VOZILO, new VoziloRowMapper());
	}

	@Override
	public Vozilo save(Vozilo vozilo) {
		Integer voziloId = insertVoziloAndReturnId(vozilo);
		return new Vozilo(voziloId, vozilo.getKorisnik(), vozilo.getAutomobilMarka(), vozilo.getAutomobilModel(), vozilo.getAutomobilKarakteristike(), vozilo.getCijena());
	}

	@Override
	public Vozilo findOne(Integer id) {
		try {
			return jdbcTemplate.queryForObject(SELECT_VOZILO_BY_ID, new VoziloRowMapper(), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

	@Override
	public List<Vozilo> findByKorisnickoIme(String korisnickoIme) {
		return jdbcTemplate.query(SELECT_VOZILO_BY_KORISNICKO_IME, new VoziloRowMapper(), korisnickoIme);
	}

	@Override
	public void delete(Integer id) {
		jdbcTemplate.update("delete from Vozilo where id=?", id);
	}
	
	
	
	private static final class VoziloRowMapper implements RowMapper<Vozilo> {
		/*
		 * Implementations must implement this method to map each row of data in the ResultSet. 
		 * This method should not call next() on the ResultSet; it is only supposed to map values of the current row.
		 * 
		 */
		 public Vozilo mapRow(ResultSet rs, int rowNum) throws SQLException {
			 
			/*
			 *  rs - the ResultSet to map (pre-initialized for the current row)
    		 *	rowNum - the number of the current row
			 */
			Integer id = rs.getInt("id");

			String naziv = rs.getString("naziv");
			double cijena = rs.getDouble("cijena");
			Integer bId = rs.getInt("bId");
			AutomobilModel automobilModel = new AutomobilModel(naziv, cijena, bId);
			
			String marka = rs.getString("marka");
			Integer markaId = rs.getInt("markaId");
			Integer idKeyMarka = rs.getInt("idKeyMarka");
			AutomobilMarka automobilMarka = new AutomobilMarka(idKeyMarka, marka, markaId);
			
			
			int godiste = rs.getInt("godiste");
			double kilometraza = rs.getDouble("kilometraza");
			String ocuvanost = rs.getString("ocuvanost");
			String oprema = rs.getString("oprema");
			String motor = rs.getString("motor");
			String mjenjac = rs.getString("mjenjac");
			String vlasnik = rs.getString("vlasnik");
			AutomobilKarakteristike automobilKarakteristike = new AutomobilKarakteristike(godiste, kilometraza, ocuvanost, oprema, motor, mjenjac, vlasnik);
			
			Integer korisnikId = rs.getInt("korisnikId");
			String korisnickoIme = rs.getString("username");
			String ime = rs.getString("ime");
			String prezime = rs.getString("prezime");
			Integer kId = rs.getInt("kId");
			Korisnik korisnik = new Korisnik(korisnikId, korisnickoIme, ime + prezime, kId);
			
		
			
			return new Vozilo(id, korisnik, automobilMarka, automobilModel, automobilKarakteristike, cijena);
			
			/*
			 * Returns: the result object for the current row
			 */
		 }
	}
	
	private Integer insertVoziloAndReturnId(Vozilo vozilo) {
		
		/*
		 * A SimpleJdbcInsert is a multi-threaded, reusable object providing easy insert capabilities for a table. 
		 * It provides meta data processing to simplify the code needed to construct a basic insert statement. 
		 * All you need to provide is the name of the table and a Map containing the column names and the column values. 
		 */
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("Vozilo"); // "Vozilo" - u bazi traza tablicu s tim imenom
		
		jdbcInsert.setGeneratedKeyName("id");

		Map<String, Object> args = new HashMap<String, Object>();
		
		args.put("korisnik", vozilo.getKorisnik().getNick());
		args.put("automobilModel", vozilo.getAutomobilModel().getNaziv());
		args.put("automobilMarka", vozilo.getAutomobilMarka().getMarka());
		args.put("cijena", vozilo.getAutomobilModel().getCijena());
		args.put("godiste", vozilo.getAutomobilKarakteristike().getGodiste());
		args.put("kilometraza", vozilo.getAutomobilKarakteristike().getKilometraza());
		args.put("ocuvanost", vozilo.getAutomobilKarakteristike().getOcuvanost());
		args.put("oprema", vozilo.getAutomobilKarakteristike().getOprema());
		args.put("motor", vozilo.getAutomobilKarakteristike().getMotor());
		args.put("mjenjac", vozilo.getAutomobilKarakteristike().getMjenjac());
		args.put("vlasnik", vozilo.getAutomobilKarakteristike().getVlasnik());
		
		Integer voziloId = jdbcInsert.executeAndReturnKey(args).intValue();
		
		return voziloId;
	}


}
