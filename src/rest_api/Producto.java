package rest_api;

import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = 6285845014865471015L;
	private String isbn;
	private String nombre;
	
	public void setISBN(String isbn) {
		this.isbn=isbn;
	}
	public String getIsbn() {
		return  this.isbn;
	}
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	public String getNombre() {
		return  this.nombre;
	}
}
