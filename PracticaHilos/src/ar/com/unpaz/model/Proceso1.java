package ar.com.unpaz.model;

public class Proceso1 extends Thread{

	
	
	public void run() {
		for( int i = 0; i<1000; i++){
			System.out.println("Hilo N°1: " + 0);
		}
	
	}
	
}
