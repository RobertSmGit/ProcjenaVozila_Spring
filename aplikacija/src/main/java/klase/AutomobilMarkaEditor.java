package klase;

import java.beans.PropertyEditorSupport;

public class AutomobilMarkaEditor extends PropertyEditorSupport{
	
	private AutomobilMarkaRepository automobilMarkaRepository;
	
	public AutomobilMarkaEditor(AutomobilMarkaRepository automobilMarkaRepository){
		this.automobilMarkaRepository=automobilMarkaRepository;
	}
	
	@Override
	public void setAsText(String text) {
		AutomobilMarka aMarka = null;
		for (AutomobilMarka automobilMarka : automobilMarkaRepository.findAll()) {
			if (automobilMarka.getId()==Integer.parseInt(text)) {
				aMarka = automobilMarka;
				break;
			}
		}
		this.setValue(aMarka);
	}


	@Override
	public String getAsText() {
		AutomobilMarka aMarka = (AutomobilMarka) this.getValue();
		return (aMarka != null ? Integer.toString(aMarka.getId()) : "");
	}

}
