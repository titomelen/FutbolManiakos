package futbolManiakos;

public class usuario {
	
	String nombreUsuario;
	String correo;
	String contrase�a;
	
	
	public usuario() {}
	public usuario(String nombreUsuario, String correo, String contrase�a) {
		this.nombreUsuario=nombreUsuario;
		this.correo=correo;
		this.contrase�a=contrase�a;
	}
	
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario=nombreUsuario;
	}
	
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a=contrase�a;
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getCorreo() {
		return this.correo;
	}
	
	public String getContrase�a() {
		return this.contrase�a;
	}
	
	public void ponerComentarios() {
		
	}
}
