package rest_api;

import java.io.Serializable;

public class RespuestaGetProd implements Serializable{
	private static final long serialVersionUID = 6285845014865471015L;
	private int code;
	private String message;
	private Producto data[];
	private String status;
	
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
	public void setData(Producto dat[]) {
		this.data=dat;
	}
	
	public Producto[] getData() {
		return this.data;
	}
	public void setStatus(String status) {
		this.status=status;
	}
	public String getStatus() {
		return this.status;
	}
}
