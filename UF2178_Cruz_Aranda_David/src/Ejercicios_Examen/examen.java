/**
 * 
 */
package Ejercicios_Examen;

/**
 * @author David
 *
 */
public class examen {

	/**
	 * Funcion para mostrar la matriz.
	 * @param 
	 */
	
	public static void mostrar_imcs(double matriz[][]) {



		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
		System.out.printf(" %.2f ", matriz[i][j]);
		}
		System.out.println();
		}


		}

	/**
	 * Matriz para calcular la media de los IMC de los pacientes
	 * @param 
	 */
	
	public static double media_paciente(double matriz[][], int n) {
		double med = 0;
		for (int i = 0; i < matriz[0].length; i++) {
			med += matriz[n][i];
		}
		return med/matriz[0].length;
	}
	
}


