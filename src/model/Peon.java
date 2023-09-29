package model;

public class Peon implements Comportamiento {
	public String nombre;
	public String seleccionada;
	public int posicion;
	
	
	
	public Peon(String nombre, String seleccionnada, int posicion, String seleccionada) {
		super();
		this.nombre = nombre;
		this.seleccionada = seleccionada;
		this.posicion = posicion;
	}

	
	
	public void Mover1AdelanteYcomerdiagonal() {}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public int getPosicion() {
		return posicion;
	}
	@Override
	public String getSeleccionada() {
		// TODO Auto-generated method stub
		return seleccionada;
	}



	@Override
	public int getPosicionX() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getPosicionY() {
		// TODO Auto-generated method stub
		return 0;
	}

}
