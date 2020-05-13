package futbolManiakos;

public class usuario {
	
	String nombreUsuario;
	String correo;
	String contraseña;
	
	
	public usuario() {}
	public usuario(String nombreUsuario, String correo, String contraseña) {
		this.nombreUsuario=nombreUsuario;
		this.correo=correo;
		this.contraseña=contraseña;
	}
	
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario=nombreUsuario;
	}
	
	public void setCorreo(String correo) {
		this.correo=correo;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña=contraseña;
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getCorreo() {
		return this.correo;
	}
	
	public String getContraseña() {
		return this.contraseña;
	}
	
	public void ponerComentarios() {
		
	}
}
