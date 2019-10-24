package locadora.app.filmes.model;

public class Filmes {
	
	private String nome;
	private String ano;
	private String genero;
	private String titulo;
	
	public Filmes() {
		super();
	}

	public Filmes(String nome, String ano, String genero, String titulo) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.genero = genero;
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	

}
