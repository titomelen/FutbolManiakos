package futbolManiakos;

public class inicioSesion {
	
	String nombreUsuario;
	String contraseña;
	
	
	public inicioSesion() {}
	public inicioSesion(String nombreUsuario, String contraseña) {
		this.nombreUsuario=nombreUsuario;
		this.contraseña=contraseña;
	}
	
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario=nombreUsuario;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña=contraseña;
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getContraseña() {
		return this.contraseña;
	}
	
	public void crearUsuario() {
		System.out.println("Creando usuario");
	}
	
	public void crearContraseña() {
		System.out.println("Creando contraseña");
	}
}
