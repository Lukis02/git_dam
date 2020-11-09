package Entregable1.copy;

public class Coche {
//se declaran las variables
	
	private String modelo;
	private int Km;
	private String dueño;
	private Boolean reparado = false;
	
	public Coche(String modelo, int Km,String dueño) {
	this.modelo=modelo;
	this.Km=Km;
	this.dueño=dueño;
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
	public String getDueño() {
		return dueño;
	}
	public void setmodelo(String modelo) {
		this.modelo=modelo; 	
	}
	public void setKm(int Km) {
		this.Km=Km;
		
	}
	public void setdueño(String dueño) {
		this.dueño=dueño; 
	}
	public void setreparado(boolean b) {
		reparado=b; 
		
	}
	public String toString() {
		if(reparado == true) {
			return "está reparado";
		
		}else {
			return "no está reparado";
		}	}
	
	


}
