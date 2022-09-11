package controller;

import view.main;

public class threadSapos extends Thread {
	static int PuloMaixmo = 25;
	static int DistanciaMaxima = 100;
	static int i = 1;

	public threadSapos() {
	}

	@Override
	public void run() {

		int SapoPulo = 0;
		int SapoLocal = 0;
		int contPulo = 0; //

		while (SapoLocal < DistanciaMaxima) {

			SapoPulo = (int) (Math.random() * PuloMaixmo) + 0;
			SapoLocal += SapoPulo;
			contPulo++;
			System.out.println("Sapo #" + getId() + " fez pulo de  " + SapoPulo + " metros.\n Metros restante:\n (" + SapoLocal + "|"+ DistanciaMaxima + ")\n");

		}

		System.err.println("=============Sapo #" + getId() + " chegou em " + i + "o ! Com " + contPulo + " pulos.=============\n");
		 i++;

	}

}