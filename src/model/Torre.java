package model;

public class Torre implements Comportamiento {
	public String nombre;
	
	public int posicionX;
	public int posicionY;
	
	
	
	public 	Torre(String nombre, int posicionX,int posicionY) {
		super();
		this.nombre = nombre;
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		
	}

	
	
	public void opcionesMoverUnoTodasDirecciones() {}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	

	



	@Override
	public int getPosicionX() {
		// TODO Auto-generated method stub
		return posicionX;
	}



	@Override
	public int getPosicionY() {
		// TODO Auto-generated method stub
		return posicionY;
	}

}
