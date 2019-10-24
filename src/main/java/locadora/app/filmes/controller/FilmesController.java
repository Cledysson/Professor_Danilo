package locadora.app.filmes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmesController {
	
	@RequestMapping("/cadastrarFilmes")
	public String form() {
		return "filmes/formFilmes";
	}
}
