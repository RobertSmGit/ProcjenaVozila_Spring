package klase;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"dodajVozilo"})
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "redirect:/unosPodataka?MarkaId=0&ModelNaziv=0";
	}
}
