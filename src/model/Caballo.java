package model;

public class Caballo implements Comportamiento {
	public String nombre;
	public String seleccionada;
	public int posicion;
	
	
	
	public Caballo (String nombre, String seleccionnada, int posicion, String seleccionada) {
		super();
		this.nombre = nombre;
		this.seleccionada = seleccionada;
		this.posicion = posicion;
	}

	
	
	public void opcionesMoverEnL(int posicion) {}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public int getPosicion() {
		// TODO Auto-generated method stub
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
