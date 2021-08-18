package rest_api;

public class Prueba {

	
	public static void main(String[] args) {
        String[] keys;
        keys = new String[]{"user","password","categoria" };
        String[] values;
        values = new String[]{"pruebas1","12345678a","Libros" };
		Conexion conexion=new Conexion(keys,values,"getProd");
		 conexion.HacerConexion();
		 RespuestaGetProd respuesta= conexion.getRespuestaGetProd();
	        String status=respuesta.getStatus();
	        System.out.println(status);

	}

}
