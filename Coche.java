package Entregable1.copy;

public class Coche {
//se declaran las variables
	
	private String modelo;
	private int Km;
	private String due�o;
	private Boolean reparado = false;
	
	public Coche(String modelo, int Km,String due�o) {
	this.modelo=modelo;
	this.Km=Km;
	this.due�o=due�o;
	this.reparado=false;
	
		
	}
	public String getModelo(){
		return modelo;
	}
	public int getKm() {
		return Km;
	}public boolean getreparado() {
		return reparado;
	
	}
	public String getDue�o() {
		return due�o;
	}
	public void setmodelo(String modelo) {
		this.modelo=modelo; 	
	}
	public void setKm(int Km) {
		this.Km=Km;
		
	}
	public void setdue�o(String due�o) {
		this.due�o=due�o; 
	}
	public void setreparado(boolean b) {
		reparado=b; 
		
	}
	public String toString() {
		if(reparado == true) {
			return "est� reparado";
		
		}else {
			return "no est� reparado";
		}	}
	
	


}
