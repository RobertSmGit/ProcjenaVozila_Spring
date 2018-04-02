package klase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class JdbcAutomobilMarkaRepository implements AutomobilMarkaRepository{

	
private JdbcTemplate jdbcTemplate;
	
	public JdbcAutomobilMarkaRepository(JdbcTemplate jdbcTemplate) {
		 this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<AutomobilMarka> findAll() {
		return jdbcTemplate.query("select idKeyMarka, marka, markaId from automobilMarka", new AutomobilMarkaRowMapper());
	}
	
	@Override
	public AutomobilMarka findById(Integer id) {
		return jdbcTemplate.queryForObject("select idKeyMarka, marka, markaId from automobilMarka where markaId=?", new AutomobilMarkaRowMapper(), id);
	}
	
	
	private static final class AutomobilMarkaRowMapper implements RowMapper<AutomobilMarka> {

		public AutomobilMarka mapRow(ResultSet rs, int rowNum) throws SQLException {
			String marka = rs.getString("marka");
			int id = rs.getInt("idKeyMarka");
			Integer markaId = rs.getInt("markaId");
			return new AutomobilMarka(id, marka, markaId);
		}
	}
}
