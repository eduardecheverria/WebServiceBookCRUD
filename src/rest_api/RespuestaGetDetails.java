package rest_api;

import java.io.Serializable;

public class RespuestaGetDetails implements Serializable{
	private static final long serialVersionUID = 6285845014865471015L;
	private int code;
	private String message;
	private Detalle data;
	private String status;
	private boolean oferta;
	
	public void setCode(int co) {
		this.code=co;
	}
	public int getCode() {
		return this.code;
	}
	public void setMessage(String me) {
		this.message=me;
	}
	public String getMessage() {
		return this.message;
	}
	public void setData(Detalle dat) {
		this.data=dat;
	}
	
	public Detalle getData() {
		return this.data;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public String getStatus() {
		return this.status;
	}
	public void setOferta(boolean ofer) {
		this.oferta=ofer;
	}
	public boolean getOferta() {
		return this.oferta;
	}
}
