/**
 * 
 */
package Ejercicios_Examen;

import java.util.Scanner;

/**
 * Enlace al Git
   https://github.com/Dacrar/Ej1_Examen_Cruz_Aranda_David.git 
 * @author David
 *
 */
public class Ej1_Cruz_Aranda_David {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
	
		System.out.println("Tu peso en KG:");
		double peso = entrada.nextDouble();
		
		System.out.println("Tu altura en metros");
		double altura = entrada.nextDouble();
		
		
		double imc = peso / Math.pow(altura,2);
		
		String diagnostico;
		if (imc<18.5) {
			diagnostico="Bajo peso";
		}
		  else if (imc>=18.5 && imc<=24.99) {
			  diagnostico="peso Normal(Saludable)";
			
		} else if (imc>=25 && imc<=29.99) {
			diagnostico="Sobrepeso";
		} else if (imc>=30 && imc<=40) {
			diagnostico="Obesidad premórbida";

		} else {
			diagnostico="Obesidad";
		}
			
		System.out.printf("El paciente de %.2f kg y %.2f m de altura, tiene un IMC de %.2f y"
				+ " tiene un diagnóstico de %s",peso,altura,imc,diagnostico);
		
		  //Enlace al Git
		  /* https://github.com/Dacrar/Ej1_Examen_Cruz_Aranda_David.git */

	}

}
