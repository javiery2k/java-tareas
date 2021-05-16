/**
 * @author Javier Moran - 8-757-1938
 * 
 */
class Suma1_1 {
	private int numero1;
	private int numero2;

	Suma1_1() {
		numero1 = 5;
		numero2 = 4;
	}

	void desplegar() {
		int suma;
		suma = numero1 + numero2;
		System.out.println(" PRIMER PROGRAMA REALIZADO EN JAVA ");
		System.out.println(" SUMATORIA DE DOS NUMEROS: " + suma);
	}
}

public class Programa1_1 {
	public static void main(String[] args) {
		Suma1_1 s = new Suma1_1();
		s.desplegar();
	}
}