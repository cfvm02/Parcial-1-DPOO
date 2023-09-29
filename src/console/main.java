package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Dama;
import model.Rey;
import model.Torre;

public class main {
public main(String [] args) throws IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Escriba la pieza que desea mover (Rey, Dama, Alfil, Peon, Caballo, Torre) ");
	String pieza= reader.readLine();
	int posicionX =3;
	int posicionY =3;
		
	if (pieza== "Rey");
		Rey nuevoRey= new Rey(pieza,posicionX,posicionY);
	
	if (pieza== "Dama");
		Dama nuevaDama= new Dama(pieza,posicionX,posicionY);
	if (pieza== "Torre");{
		Torre nuevaTorre=new Torre(pieza,posicionX,posicionY);}
		
	
	
	
	
	
	// TODO Auto-generated constructor stub
}
}
