package rest_api;

import javax.ws.rs.core.Form;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
 
import org.glassfish.jersey.jackson.JacksonFeature;
public class Conexion {
	public String keysForm[];
	public String valuesForm[];
	public String action;
	public RespuestaGetProd respuestaGetProd;
	public RespuestaGetDetails respuestaGetDetails;
	public RespuestaGenerica respuestaGenerica;
	public Conexion(String keys[],String values[],String act) {
		this.keysForm=keys;
		this.valuesForm=values;
		this.action=act;
	}
	public void setAction(String act) {
		this.action=act;
	}
	public String getAction() {
		return this.action;
	}
	public void setKeysForm(String keys[]) {
		this.keysForm=keys;
	}
	public String[] getKeysForm() {
		return this.keysForm;
	}
	public void setValuesForm(String values[]) {
		this.valuesForm=values;
	}
	public String[] getValuesForm() {
		return this.valuesForm;
	}
	public void setRespuestaGetProd(RespuestaGetProd respuesta) {
		this.respuestaGetProd=respuesta;
	}
	public RespuestaGetProd getRespuestaGetProd() {
		return this.respuestaGetProd;
	}
	public void setRespuestaGetDetails(RespuestaGetDetails respuesta) {
		this.respuestaGetDetails=respuesta;
	}
	public RespuestaGetDetails getRespuestaGetDetails() {
		return this.respuestaGetDetails;
	}
	public void setRespuestaGenerica(RespuestaGenerica respuesta) {
		this.respuestaGenerica=respuesta;
	}
	public RespuestaGenerica getRespuestaGenerica() {
		return this.respuestaGenerica;
	}
	public void HacerConexion() {
		 Form form = new Form();
		 	for(int i=0;i < this.keysForm.length;i++) {
		 		form.param(this.keysForm[i], this.valuesForm[i]);
		 	}
			Client client = ClientBuilder.newClient().register(new JacksonFeature());
			if(this.action=="getProd"){
				RespuestaGetProd respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/getProd")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGetProd.class);
				this.respuestaGetProd=respuesta;
			}
			if(this.action=="getDetails") {
				RespuestaGetDetails respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/getDetails")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGetDetails.class);
				this.setRespuestaGetDetails(respuesta);
				
			}
			if(this.action=="setProd") {
				RespuestaGenerica respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/setProd")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGenerica.class);
				this.setRespuestaGenerica(respuesta);
				
			}
			if(this.action=="updateProd") {
				RespuestaGenerica respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/updateProd")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGenerica.class);
				this.setRespuestaGenerica(respuesta);
				
			}
			if(this.action=="updatePass") {
				RespuestaGenerica respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/updatePass")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGenerica.class);
				this.setRespuestaGenerica(respuesta);
			}
			if(this.action=="deleteProd") {
				RespuestaGenerica respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/deleteProd")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGenerica.class);
				this.setRespuestaGenerica(respuesta);
			}
			if(this.action=="login") {
				RespuestaGenerica respuesta = client
						.target("http://localhost:8081/proyectofinal/slim.php/login")
						.request(MediaType.APPLICATION_JSON).post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
						        RespuestaGenerica.class);
				this.setRespuestaGenerica(respuesta);
			}
			
			
		}
	

}
