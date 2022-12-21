package model;

public class Livro {
	private String idLivro;
	private String nomeLivro;
	private String disponivel;
	private String autor;
	private String Idioma;
	
	
	
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Livro(String idLivro, String nomeLivro, String disponivel, String autor, String Idioma ) {
		super();
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.disponivel = disponivel;
		this.autor = autor;
		this.Idioma = Idioma;
	}
	
	public String getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIdioma() {
		return Idioma;
	}
	public void setIdioma(String idioma) {
		Idioma = idioma;
	}
	
	
}

