package futbolManiakos;

public class paginaPrincipal {
	
	String clasificacion;
	String redSocial;
	String emailContacto;
	String mejorGol;
	
	
	public paginaPrincipal() {}
	public paginaPrincipal(String clasificacion, String redSocial, String emailContacto, String mejorGol) {
		this.clasificacion=clasificacion;
		this.redSocial=redSocial;
		this.emailContacto=emailContacto;
		this.mejorGol=mejorGol;
	}
	
	
	public void setClasificacion(String clasificacion) {
		this.clasificacion=clasificacion;
	}
	
	public void setRedSocial(String redSocial) {
		this.redSocial=redSocial;
	}
	
	public void setEmailContacto(String emailContacto) {
		this.emailContacto=emailContacto;
	}
	
	public void setMejorGol(String mejorGol) {
		this.mejorGol=mejorGol;
	}
	
	public String getClasificacion() {
		return this.clasificacion;
	}
	
	public String getRedSocial() {
		return this.redSocial;
	}
	
	public String getEmailContacto() {
		return this.emailContacto;
	}
	
	public String getMejorGol() {
		return this.mejorGol;
	}
	
	public void clicarSeccion() {
		
	}
}
