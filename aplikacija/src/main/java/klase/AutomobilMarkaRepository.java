package klase;

import java.util.List;

public interface AutomobilMarkaRepository {
	
		List<AutomobilMarka> findAll();
		AutomobilMarka findById(Integer id);
}
