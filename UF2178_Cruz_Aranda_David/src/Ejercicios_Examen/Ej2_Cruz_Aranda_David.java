/**
 * 
 */
package Ejercicios_Examen;

import java.util.Scanner;

/**
 * 
 * 
 * 
 * @author David
 *
 */
public class Ej2_Cruz_Aranda_David {

	/**
	 * Ejercicio 2 Apartado 4 donde creamos una funcion en la clase examen y lo mostramos en la clase Ej2_Cruz_Aranda_David
	 * Luego pedimos el numero del paciente y nos devolvera la media con el procedimiento que hemos creado en examen llamado
	 * media_paciente
	 * @param args
	 */
	
		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner(System.in);
			
			double imcs_pacientes [][] = {



					{15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},



					{38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},



					{33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},



					{32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}
			};
			
			
			System.out.println("Tabla IMC");
			examen.mostrar_imcs(imcs_pacientes);

			System.out.println("Introduzca el numero del paciente: ");
			int paciente = entrada.nextInt();
			
			while (paciente > imcs_pacientes.length-1) {
				System.out.println("Introduzca un numero de paciente valido");
				paciente = entrada.nextInt();
			}
			
			double media_pac = examen.media_paciente(imcs_pacientes, paciente);
			System.out.printf("La media de ICM del paciente %d es: %.2f", paciente, media_pac);
			

	

	}

}
