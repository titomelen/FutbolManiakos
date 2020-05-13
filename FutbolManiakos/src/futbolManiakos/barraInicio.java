package futbolManiakos;

public class barraInicio {
	
	int anchoBarra;
	int altoBarra;
	
	
	public barraInicio() {}
	public barraInicio(int anchoBarra, int altoBarra) {
		this.anchoBarra=anchoBarra;
		this.altoBarra=altoBarra;
	}
	
	
	public void setaAnchoBarra(int anchoBarra) {
		this.anchoBarra=anchoBarra;
	}
	
	public void setaAltoBarra(int altoBarra) {
		this.altoBarra=altoBarra;
	}
	
	public int getAnchoBarra(int anchoBarra) {
		return this.anchoBarra;
	}
	
	public int getAltoBarra(int altoBarra) {
		return this.altoBarra;
	}
	
	public void clicarBoton() {
		System.out.println("Clicando");
	}
}
