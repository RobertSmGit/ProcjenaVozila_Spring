package klase;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class JdbcAutomobilModelRepository implements AutomobilModelRepository {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcAutomobilModelRepository(JdbcTemplate jdbcTemplate) {
		 this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public AutomobilModel findOne(String naziv) {
		return jdbcTemplate.queryForObject("select naziv, cijena, bId from AutomobilModel where naziv=?", new AutomobilModelRowMapper(), naziv);
	}

	@Override
	public List<AutomobilModel> findAll() {
		return jdbcTemplate.query("select naziv, cijena, bId from AutomobilModel", new AutomobilModelRowMapper());
	}
	
	@Override
	public List<AutomobilModel> findById(Integer id) {
		return jdbcTemplate.query("select naziv, cijena, bId from AutomobilModel where bId=?", new AutomobilModelRowMapper(), id);
	}
	
	/*
	 *  RowMapper<T> is an interface used by JdbcTemplate for mapping rows of a ResultSet on a per-row basis.
	 *  Implementations of this interface perform the actual work of mapping each row to a result object, 
	 *  but don't need to worry about exception handling. SQLExceptions will be caught and handled by the calling JdbcTemplate.
	 *  Typically used either for JdbcTemplate's query methods or for out parameters of stored procedures. 
	 *  RowMapper objects are typically stateless and thus reusable; they are an ideal choice for implementing row-mapping logic in a single place. 
	 */
	private static final class AutomobilModelRowMapper implements RowMapper<AutomobilModel> {
		
		public AutomobilModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			String naziv = rs.getString("naziv");
			double cijena = rs.getDouble("cijena");
			Integer bId = rs.getInt("bId");
			return new AutomobilModel(naziv, cijena, bId);
		}
	}
}
