package unico;

public class Ej_03 {

	public static void main(String[] args) {
		/* Implementar un programa que permita introducir por teclado un número n y, a continuación, 
		 solicite al usuario que teclee n números. Realizar la media de los números positivos, la media de los negativos, 
		 y contar el número de ceros introducidos.
*/
		int a;
		a=Util.leerInt("Cantidad numeros");
		int[] x = new int[a];
		preguntaValores(x);
		mediaNum(x);
		numCeros (x);
	}
	public static void preguntaValores(int []x){
		for(int i=0; i< x.length; i++) {
			x[i] = Util.leerInt("Introduzca valor: " + (i +1) + "/" + x.length + ": ");
			}
		}
	public static String mediaNum(int[]x) {
		String r = null;
		for(int i=1; i< x.length; i++) {
			if(x[i]>0) {
			int pos = 0;
				pos ++;
				int sumaPositivos = pos + pos;
				double mediaPositivo = sumaPositivos/pos;
				r+= Util.leerString("Media de num positivos: "+ mediaPositivo);
			}
			if(x[i]<0) {
				int neg = 0;
				neg ++;
				int sumaNeg = neg + neg;
				double mediaNegativo = sumaNeg/neg;
				r+= Util.leerString("Media de num negativos: "+ mediaNegativo);
				}			
			
		}
		return r;
		
}
	public static String numCeros(int []x) {
		String r = null;
		for(int i=0; i< x.length; i++) {
			if (x[i] == 0) {
				int sumaCeros = 0;
				sumaCeros ++;
				r= Util.leerString("Total de ceros: "+ sumaCeros);
			}
		}
		
		return r;
		} 
}
