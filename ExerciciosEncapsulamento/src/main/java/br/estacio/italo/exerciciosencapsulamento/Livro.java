public class Livro{
	String titulo, autor, isbn;
	int numPaginas;
	float preco;
	
	//Construtor
	Livro(String titulo, String autor, String isbn, int numPaginas){
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
	}
	
	//Setters e Getters
	//Titulo
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	//Autor
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	//ISBN
	public void setISBN(String isbn){
		this.isbn = isbn;
	}
	
	public String getISBN(){
		return this.isbn;
	}
	
	//Numero de Paginas
	public void setNumPaginas(int numPaginas){
		this.numPaginas = numPaginas;
	}
	
	public int getNumPaginas(){
		return this.numPaginas;
	}
	
	//Preco
	public void setPreco(float preco){
		this.preco = preco;
	}
	
	public float getPreco(){
		return this.preco;
	}
}