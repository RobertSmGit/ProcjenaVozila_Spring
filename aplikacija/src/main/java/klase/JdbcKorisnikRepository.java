package klase;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class JdbcKorisnikRepository implements KorisnikRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcKorisnikRepository(JdbcTemplate jdbcTemplate) {
		 this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Korisnik findOne(String nick) {
		// mora biti id, inace error
		return jdbcTemplate.queryForObject(("select id, username, ime, prezime, kId from user where username=?"), new KorisnikRowMapper(), nick);
	}

	@Override
	public List<Korisnik> findAll() {
		return jdbcTemplate.query("select id, username, ime, prezime, kId from user", new KorisnikRowMapper());
	}
	
	@Override
	public Korisnik findById(Integer id) {
		return jdbcTemplate.queryForObject("select id, username, ime, prezime, kId from user where kId=?", new KorisnikRowMapper(), id);
	}
	

	private static final class KorisnikRowMapper implements RowMapper<Korisnik> {

		public Korisnik mapRow(ResultSet rs, int rowNum) throws SQLException {
			String ime = rs.getString("ime");
			String prezime = rs.getString("prezime");
			String punoIme = ime+" "+prezime;
			String nick = rs.getString("username");
			int id = rs.getInt("id");
			Integer kId = rs.getInt("kId");
			return new Korisnik(id, nick, punoIme, kId);
		}
	}
}
