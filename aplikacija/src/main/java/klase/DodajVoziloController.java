package klase;

import java.security.Principal;
import java.time.Year;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"dodajVozilo"})
public class DodajVoziloController {
	
	@Autowired
	private AutomobilModelRepository automobilModelRepository;
	
	@Autowired
	private KorisnikRepository korisnikRepository;
	
	@Autowired
	private VoziloRepository voziloRepository;
	
	@Autowired
	private AutomobilMarkaRepository automobilMarkaRepository;
	
	@InitBinder
	public void dataBinding(WebDataBinder binder) {
		binder.registerCustomEditor(Korisnik.class, new KorisnikEditor(korisnikRepository));
		binder.registerCustomEditor(AutomobilModel.class, new AutomobilModelEditor(automobilModelRepository));
		binder.registerCustomEditor(AutomobilMarka.class, new AutomobilMarkaEditor(automobilMarkaRepository));
	}
	
	int markaId = 0;
	String modelNaziv=" ";
	
	
	@GetMapping("/unosPodataka")
	public String showForm(Model model, @RequestParam("MarkaId") int marId, @RequestParam("ModelNaziv") String modNaziv, SessionStatus sessionStatus ) {
		
		markaId = marId;
		modelNaziv = modNaziv;
		
		sessionStatus.setComplete();
		
		model.addAttribute("godista", Podaci.dodajGodista());	
		model.addAttribute("stanja", Podaci.dodajStanjaVozila());
		model.addAttribute("opreme", Podaci.dodajOpreme());
		model.addAttribute("motori", Podaci.dodajMotore());
		model.addAttribute("mjenjaci", Podaci.dodajMjenjace());
		model.addAttribute("vlasnici", Podaci.dodajVlasnike());
		
		model.addAttribute("korisnici", korisnikRepository.findAll());
		
		if(markaId > 0){
			model.addAttribute("prvaMarka", automobilMarkaRepository.findById(markaId));
		}
		else {
			model.addAttribute("prvaMarka", new AutomobilMarka(0, "Odaberite marku", 0));
		}
		
		model.addAttribute("marke", automobilMarkaRepository.findAll());
		
		if (markaId > 0){
			model.addAttribute("prviModel", automobilModelRepository.findOne("Odaberite model"));
			model.addAttribute("modeli", automobilModelRepository.findById(markaId));
			
			if(!modelNaziv.equals("0")) {
				model.addAttribute("prviModel", automobilModelRepository.findOne(modelNaziv));
			}
		}
		else {
			model.addAttribute("prviModel", automobilModelRepository.findOne("Odaberite model"));
		}		
	
		return "unosPodataka";
	}


	@PostMapping("/unosPodataka")
	public String processForm(@ModelAttribute DodajVozilo dodajVozilo, Model model, Principal principal) {
		
		if (dodajVozilo.getKorisnik() == null) { // null je uvijek osim ako je admin logiran, jer admin moze birati korisnika
			for (Korisnik korisnik : korisnikRepository.findAll()) {
				if (korisnik.getNick().equals(principal.getName())) { // ako username korisnika iz baze odgovara username logiranog korisnika
					dodajVozilo.setKorisnik(korisnik);
					break;
				}
			}
		}
		procjeni(dodajVozilo);
		return "izracun";
	}
	
	
	DodajVozilo procjeni(DodajVozilo dodajVozilo) {
		
		int trenutnaGodina = Year.now().getValue();
			
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-1) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.90);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-2) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.78);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-3) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.67);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-4)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.57);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-5)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.47);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-6)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.42);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-7)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.37);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-8) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.33);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-9)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.29);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-10)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.26);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-11) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.24);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-12) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.21);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-13) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.19);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-14) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.17);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-15) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.15);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-16) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.13);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-17) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.11);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-18) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.095);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-19) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.08);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-20) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.072);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-21) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.065);
		
		if(dodajVozilo.getAutomobilKarakteristike().getGodiste() == trenutnaGodina-22) 
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.060);
		
		
		if(dodajVozilo.getAutomobilKarakteristike().getKilometraza() < 100000 && dodajVozilo.getAutomobilKarakteristike().getGodiste() < 2017)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.05);
		
		if(dodajVozilo.getAutomobilKarakteristike().getKilometraza() >= 200000 && dodajVozilo.getAutomobilKarakteristike().getKilometraza() < 300000)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.95);

		if(dodajVozilo.getAutomobilKarakteristike().getKilometraza() >= 300000 && dodajVozilo.getAutomobilKarakteristike().getKilometraza() < 500000)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.90);
		
		if(dodajVozilo.getAutomobilKarakteristike().getKilometraza() >= 500000)
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.85);
		
		
		if(dodajVozilo.getAutomobilKarakteristike().getOcuvanost().equals("Odlicna"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.1);
			
		if(dodajVozilo.getAutomobilKarakteristike().getOcuvanost().equals("Losa"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.8);
		
		if(dodajVozilo.getAutomobilKarakteristike().getOcuvanost().equals("Karamboliran"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.4);
		
		
		if(dodajVozilo.getAutomobilKarakteristike().getOprema().equals("Srednja oprema"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.1);
		
		if(dodajVozilo.getAutomobilKarakteristike().getOprema().equals("Potpuna oprema"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.25);
		
		
		if(dodajVozilo.getAutomobilKarakteristike().getMotor().equals("Srednji benzinski"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.1);
		
		if(dodajVozilo.getAutomobilKarakteristike().getMotor().equals("Najjači benzinski"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.25);
		
		if(dodajVozilo.getAutomobilKarakteristike().getMotor().equals("Osnovni dizelski"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.05);
		
		if(dodajVozilo.getAutomobilKarakteristike().getMotor().equals("Srednji dizelski"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.15);
		
		if(dodajVozilo.getAutomobilKarakteristike().getMotor().equals("Najjači dizelski"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.25);
		
		
		if(dodajVozilo.getAutomobilKarakteristike().getMjenjac().equals("Automatski"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*1.05);
		
		
		if(dodajVozilo.getAutomobilKarakteristike().getVlasnik().equals("Drugi vlasnik"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.96);
		
		if(dodajVozilo.getAutomobilKarakteristike().getVlasnik().equals("Treći i više"))
			dodajVozilo.getAutomobilModel().setCijena(dodajVozilo.getAutomobilModel().getCijena()*0.92);
		
					
		return dodajVozilo;
	}
	
	
	@RequestMapping(value="/unosPodataka", method=RequestMethod.GET, params="back")
	public String izmijeniPodatke(SessionStatus sessionStatus) {
		
		sessionStatus.setComplete();
		return "/novaBiljeska";
	}
	
		
	@ModelAttribute("dodajVozilo")
	public DodajVozilo getDodajVozilo() {
		return new DodajVozilo();
	}
	
	
	// vracanje sa zadnje na pocetnu preko gumba i punjenje default podatcima
	@RequestMapping(value="/unosPodataka", method=RequestMethod.GET, params="povratakNaPocetnu")
	public String povratakNaPocetnu(Model model){
		
		model.addAttribute("korisnici", korisnikRepository.findAll());
		model.addAttribute("modeli", automobilModelRepository.findAll());
		model.addAttribute("marke", automobilMarkaRepository.findAll());
		model.addAttribute("dodajVozilo", new DodajVozilo());
		
		return "redirect:/unosPodataka?MarkaId=0&ModelNaziv=0";
	}
	
	
	@RequestMapping(value="/spremljeneProcjene", method=RequestMethod.GET, params="pregledVozilaNaPocetnu")
	public String povratakNaPocetnuPregledProcjena(Model model){
		
		model.addAttribute("korisnici", korisnikRepository.findAll());
		model.addAttribute("modeli", automobilModelRepository.findAll());
		model.addAttribute("marke", automobilMarkaRepository.findAll());
		model.addAttribute("dodajVozilo", new DodajVozilo());
		
		return "redirect:/unosPodataka?MarkaId=0&ModelNaziv=0";
	}
	
	
	@RequestMapping(value="/unosPodataka", method=RequestMethod.GET, params="spremiProcjenu")
	public String spremiProcjenu(Model model, DodajVozilo dodajVozilo){
	
		int voziloId = dodajVozilo.getId();
		int korisnikId = dodajVozilo.getKorisnik().getId();
		int korisnikId2 = dodajVozilo.getKorisnik().getkId();
		String korisnikUserName = dodajVozilo.getKorisnik().getNick();
		String korisnikPunoIme = dodajVozilo.getKorisnik().getPunoIme();
		
		Korisnik korisnik = new Korisnik(korisnikId, korisnikUserName, korisnikPunoIme, korisnikId2);
			
		int markaIdPrimary = dodajVozilo.getAutomobilMarka().getId();
		int markaId = dodajVozilo.getAutomobilMarka().getMarkaId();
		String markaNaziv = dodajVozilo.getAutomobilMarka().getMarka();
		
		AutomobilMarka automobilMarka = new AutomobilMarka(markaIdPrimary, markaNaziv, markaId);
				
		String modelNaziv = dodajVozilo.getAutomobilModel().getNaziv();
		int modelId = dodajVozilo.getAutomobilModel().getbId();
		
		int godiste = dodajVozilo.getAutomobilKarakteristike().getGodiste();
		double kilometraza = dodajVozilo.getAutomobilKarakteristike().getKilometraza();	
		double modelCijena = dodajVozilo.getAutomobilModel().getCijena();
		String ocuvanost = dodajVozilo.getAutomobilKarakteristike().getOcuvanost();
		String oprema = dodajVozilo.getAutomobilKarakteristike().getOprema();
		String motor = dodajVozilo.getAutomobilKarakteristike().getMotor();
		String mjenjac = dodajVozilo.getAutomobilKarakteristike().getMjenjac();
		String vlasnik = dodajVozilo.getAutomobilKarakteristike().getVlasnik();
			
		AutomobilModel automobilModel = new AutomobilModel(modelNaziv, modelCijena, modelId);

		AutomobilKarakteristike automobilKarakteristike = new AutomobilKarakteristike (godiste, kilometraza, ocuvanost, oprema, motor, mjenjac, vlasnik);
		
		Vozilo vozilo = new Vozilo(voziloId, korisnik, automobilMarka, automobilModel, automobilKarakteristike, dodajVozilo.getAutomobilModel().getCijena());
		
		voziloRepository.save(vozilo);
		
		model.addAttribute("korisnici", korisnikRepository.findAll());
		model.addAttribute("modeli", automobilModelRepository.findAll());
		model.addAttribute("marke", automobilMarkaRepository.findAll());
		model.addAttribute("dodajVozilo", new DodajVozilo());
		
		return "redirect:/unosPodataka?MarkaId=0&ModelNaziv=0";
	}
	
	
	@GetMapping("/spremljeneProcjene")
	public String showSpremljenaVozila(Model model, Principal principal) {
		
		if(principal.getName().equals("admin")){
			model.addAttribute("vozilo", voziloRepository.findAll());
		}
		else{
			model.addAttribute("vozilo", voziloRepository.findByKorisnickoIme(principal.getName()));
		}
		
		return "spremljeneProcjene";
	}
	
	@RequestMapping(value="/spremljeneProcjene", method=RequestMethod.GET, params="obrisi")
	public String obrisiVozilo(Principal principal, Model model, @RequestParam(value="obrisi") int odabraniDelete ){
		
		if(principal.getName().equals("admin")){
				
				for(Vozilo vozilo : voziloRepository.findAll()) {
					if (vozilo.getId() == odabraniDelete) {
						voziloRepository.delete(odabraniDelete);
					}
				}
		}
		else{
			model.addAttribute("vozilo", voziloRepository.findByKorisnickoIme(principal.getName()));
		}
		
		return "redirect:/spremljeneProcjene";
	}
}


