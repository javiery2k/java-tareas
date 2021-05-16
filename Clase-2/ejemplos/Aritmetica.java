/**
 * @author Javier Moran - 8-757-1938
 * 
 */
class Operaciones {
	private int m, n;

	Operaciones(int xm, int xn) {
		m = xm;
		n = xn;
	}

	void ejecutar() {
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		int suma = m + n;
		System.out.println("m + n = " + suma);
		int resta = m - n;
		System.out.println("m - n = " + resta);
		int multiplicacion = m * n;
		System.out.println("m * n = " + multiplicacion);
		int division = m / n;
		System.out.println("m / n = " + division);
		int residuo = m % n;
		System.out.println("m % n = " + residuo);
	}
}

public class Aritmetica {
	public static void main(String[] args) {
		Operaciones op = new Operaciones(25, 7);
		op.ejecutar();
	}
}