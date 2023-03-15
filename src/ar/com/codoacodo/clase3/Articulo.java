package ar.com.codoacodo.clase3;

/*
 java beans
*/
public class Articulo {

	private Long id;
	private String titulo;
	private Double precio;
	private String autor;
	private String img;
	
	//alt+shit+s
	public Articulo(Long id, String titulo, Double precio, String autor, String img) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.autor = autor;
		this.img = img;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", autor=" + autor + ", img=" + img
				+ "]";
	}
	
	//alt+shift+s
	
}
