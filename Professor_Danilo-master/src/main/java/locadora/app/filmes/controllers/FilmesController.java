package locadora.app.filmes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import locadora.app.filmes.model.Filmes;
import locadora.app.repository.FilmesRepository;

@Controller
public class FilmesController {
	@Autowired
	private FilmesRepository fr;

	@RequestMapping(value = "/cadastrarFilmes", method = RequestMethod.GET)
	public String form() {
		return "filmes/formFilmes";
	}

	@RequestMapping(value = "/cadastrarFilmes", method = RequestMethod.POST)
	public String form(Filmes filme) {
		fr.save(filme);
		return "redirect:/cadastrarFilmes";
	}
	
	@RequestMapping("/filmes")
	public ModelAndView listaFilmes() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Filmes> filmes = fr.findAll();
		mv.addObject("filmes", filmes);
		return mv;
	}
}
