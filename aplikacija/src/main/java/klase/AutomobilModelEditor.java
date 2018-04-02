package klase;

import java.beans.PropertyEditorSupport;

public class AutomobilModelEditor extends PropertyEditorSupport {
	
	private AutomobilModelRepository automobilModelRepository;
	
	public AutomobilModelEditor(AutomobilModelRepository automobilModelRepository){
		this.automobilModelRepository = automobilModelRepository;
	}
	

	@Override
	public void setAsText(String text) {
		AutomobilModel aModel = null;

		for (AutomobilModel automobilModel : automobilModelRepository.findAll()) {
			if (automobilModel.getNaziv().equals(text)) {
				aModel = automobilModel;
				break;
			}
		}
		this.setValue(aModel);
	}


	@Override
	public String getAsText() {
		AutomobilModel aModel = (AutomobilModel) this.getValue();
		return (aModel != null ? aModel.getNaziv() : "");
	}

}
