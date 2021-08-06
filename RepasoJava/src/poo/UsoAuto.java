package poo;

import java.util.Scanner;

public class UsoAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		Auto auto1 = new Auto ();
		System.out.print("Ingrese un color: ");
		String dato = entrada.nextLine();
		auto1.setColor(dato);
		System.out.println(auto1.datosGenerales());
		System.out.println("Tiene asientos de cuero?");
		System.out.println("1: Si");
		System.out.println("2: No");
		dato = entrada.nextLine();
		switch (dato) {
			case "1": auto1.setAsientosCuero(true);
			break;
			case "2": auto1.setAsientosCuero(false);
			break;
			
		}
		System.out.println("Tiene climatizador? Ingrese Si o No");
		
		auto1.config_climatizador(entrada.nextLine());
		System.out.println(auto1.datoAsientos());
		System.out.println(auto1.datoClimatizador());
		System.out.println(auto1.calcPesoAuto());
		System.out.println("El precio del coche es de " + auto1.precioCoche());
	}

}
