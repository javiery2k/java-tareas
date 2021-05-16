class Suma {
	private int numero1;
	private int numero2;

	Suma() {
		numero1 = 5;
		numero2 = 4;
	}

	void desplegar() {
		System.out.println(" PRIMER PROGRAMA REALIZADO EN JAVA ");
		System.out.println(" SUMATORIA DE DOS NUMEROS: " + (numero1 + numero2));
	}
}

public class Programa1 {
	public static void main(String[] args) {
		Suma s = new Suma();
		s.desplegar();
	}
}
