package ar.com.unpaz.principal;
import ar.com.unpaz.model.*;
public class Inicio {

	public static void main(String[] args) {

		System.out.println("PROBANDO FETCH");	
		System.out.println("TITULO EN MAYUSCULA");
		System.out.println("CAMBIO DESDE GIT");		
		Proceso1 hilo1 = new Proceso1();
		hilo1.start();
		
		Proceso2 hilo2 = new Proceso2();
		hilo2.start();
		
			
		
	}

}
