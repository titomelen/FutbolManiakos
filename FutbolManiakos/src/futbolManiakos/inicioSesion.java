package futbolManiakos;

public class inicioSesion {
	
	String nombreUsuario;
	String contrase�a;
	
	
	public inicioSesion() {}
	public inicioSesion(String nombreUsuario, String contrase�a) {
		this.nombreUsuario=nombreUsuario;
		this.contrase�a=contrase�a;
	}
	
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario=nombreUsuario;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a=contrase�a;
	}
	
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
	
	public String getContrase�a() {
		return this.contrase�a;
	}
	
	public void crearUsuario() {
		System.out.println("Creando usuario");
	}
	
	public void crearContrase�a() {
		System.out.println("Creando contrase�a");
	}
}
