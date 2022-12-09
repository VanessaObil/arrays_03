package unico;

import java.util.Scanner;

public class Util {
	public static int leerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
				int respuesta;
	
		System.out.print(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
	}
	public static double leerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		
		System.out.print(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;
	}
	public static String leerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		
		System.out.print(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;
	}
	public static void escribir (String texto) {
		System.out.print(texto);
		
	}
	public static float leerFloat(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		 float respuesta;
		
		System.out.print(pregunta);
		respuesta = Float.parseFloat(teclado.nextLine());
		return respuesta;
		}
	
	public static double escribirDouble (double texto) {
		System.out.print(texto);
		return texto;
		
	}
}
