package rest_api;

import java.io.Serializable;

public class Detalle implements Serializable{
	private static final long serialVersionUID = 6285845014865471015L;
	private int anio;
	private String autor;
	private String editorial;
	private String isbn;
	private String nombre;
	private float precio;
	
	public void setAutor(String aut) {
		this.autor=aut;
	}
	public String getAutor() {
		return  this.autor;
	}
	public void setEditorial(String edit) {
		this.editorial=edit;
	}
	public String getEditorial() {
		return  this.editorial;
	}
	public void setIsbn(String isbn) {
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
	public void setPrecio(float prec) {
		this.precio=prec;
	}
	public float getPrecio() {
		return  this.precio;
	}
	public void setAnio(int ani) {
		this.anio=ani;
	}
	public int getAnio() {
		return  this.anio;
	}
}
