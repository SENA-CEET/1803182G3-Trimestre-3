package co.edu.sena.poo.tema03visibilidad.paquete2;

import co.edu.sena.poo.tema03visibilidad.paquete1.Mesa;


public class App {

	public static void main(String[] args) {
		Mesa mesa = new Mesa();
		MesaElectrica  mesa2 = new MesaElectrica();
		mesa2.prender(6);	
	}

}
