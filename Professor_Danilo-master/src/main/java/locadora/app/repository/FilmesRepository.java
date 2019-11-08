package locadora.app.repository;

import org.springframework.data.repository.CrudRepository;

import locadora.app.filmes.model.Filmes;

public interface FilmesRepository extends CrudRepository<Filmes, String>{
	
}
