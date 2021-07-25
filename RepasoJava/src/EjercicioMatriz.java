
public class EjercicioMatriz {
	
	public static void main (String []args) {
		
		/* El ejercicio constaba de representar de una planilla excel lo siguiente:
		Con un monto base de $10000, se queria obtener la ganancia anual de 4 años en diferentes intereses,
		del 10, 11, 12, 13, 14 y 15 porciento. Donde la ganancia del proximo año dependera de la ganancia del anterior
		Por ejemplo: 10000 con interes de 10% al primer año tendremos 11000, pero para el siguiente deberemos trabajar
		con esos 11000 que obtuvimos el anterior año.
		Debia verse de esta forma:
		 10%	 11%	
		11000	11700	..
		12100	12987	..
		 ..		 ..
		*/
		
		
		final double montoBase = 10000.00;
		double porcentaje = 0.09;
		
		//System.out.printf("%.2f %n", porcentaje);
		double [][] matriz = new double [4][6]; // Lo hago para 4 años en mi caso
		
		for (int c = 0; c < matriz[0].length; c++) {
			porcentaje += 0.01; // Preparo la primera vuelta para que de 0.1 y sacar porcentaje
			
			for (int f = 0; f < matriz.length; f++) {
				// Solo la primera vuelta usara el monto base
				if (f == 0) 
					matriz [f][c] = montoBase * (porcentaje + 1);
				else 
					// Calcula mediante el monto del año anterior
					matriz [f][c] = matriz [f-1][c] * (porcentaje + 1);
			}			
		}
		
		/*
		// Otra forma de realizarlo de Pildoras Informaticas
		double acumulado;
		double interes = 0.10;
		
		double [][] matriz = new double [4][6];
		
		for (int i=0; i< 4; i++) {
			matriz [i][0]= 10000; // El completa la primer fila con 10000
			acumulado = 10000;
			
			for (int j=1; j<6; j++) { // Trabaja columna por columna, gracias a la primer fila con 10000
				acumulado+= acumulado*interes;
				matriz[i][j]= acumulado;
				
			}
			interes+=0.01; // Prepara el interes de la siguiente columna
		}
		
		*/
		
		//Muestra la matriz
		for (int f = 0; f < matriz.length; f++) {
			System.out.println();
			
			for (int c = 0; c < matriz[0].length; c++) {
				double valor = matriz [f][c];
				System.out.printf("%.2f", valor);
				System.out.print("  ");
			}		
		}
	}
}
