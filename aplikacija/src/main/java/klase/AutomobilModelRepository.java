package klase;


import java.util.List;

public interface AutomobilModelRepository {
	
	List<AutomobilModel> findAll();
	AutomobilModel findOne(String test);
	List<AutomobilModel> findById(Integer id);

}
