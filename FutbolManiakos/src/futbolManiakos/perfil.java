package futbolManiakos;

public class perfil {
	
	String nombre;
	int edad;
	
	
	public perfil() {}
	public perfil(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void moversePorPagina() {
		
	}
}
