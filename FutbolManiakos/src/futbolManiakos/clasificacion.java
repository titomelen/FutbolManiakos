package futbolManiakos;

public class clasificacion {
	
	int NumLigas;
	String liga;
	String equipo;
	int puntos;
	
	
	public clasificacion() {}
	public clasificacion(int NumLigas, String liga, String equipo, int puntos) {
		this.NumLigas=NumLigas;
		this.liga=liga;
		this.equipo=equipo;
		this.puntos=puntos;
	}
	
	
	public void setNumLigas(int NumLigas) {
		this.NumLigas=NumLigas;
	}
	
	public void setLiga(String liga) {
		this.liga=liga;
	}
	
	public void setEquipo(String equipo) {
		this.equipo=equipo;
	}
	
	public void setPuntos(int puntos) {
		this.puntos=puntos;
	}
	
	public int getNumLigas() {
		return this.NumLigas;
	}
	
	public String getLiga() {
		return this.liga;
	}
	
	public String getEquipo() {
		return this.equipo;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public void sumarPunto() {
		
	}
	
	public void sumarTarjetaAmarilla() {
		
	}
	
	public void sumarTarjetaRoja() {
		
	}
}
