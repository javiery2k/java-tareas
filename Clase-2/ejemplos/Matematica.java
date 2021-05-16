/**
 * @author Javier Moran - 8-757-1938
 * 
 */
class XMatematica {
	double a;
	double b;

	XMatematica() {
		a = 25;
		b = 5;
	}

	void calcular() {
		double pi = Math.PI;
		double raiz = Math.sqrt(a);
		double elevar = Math.pow(b, 2);
		System.out.println("El valor de PI es: " + pi);
		System.out.println("La raiz de a:" + raiz);
		System.out.println("El cuadrado de b:" + elevar);
		double x = 72.35699993;
		System.out.println(x + " es aprox. " + (double) Math.round(x * 100) / 100);
		System.out.println(x + " es aprox. " + Math.floor(x * 100) / 100);
	}
}

public class Matematica {
	public static void main(String[] args) {
		XMatematica mat = new XMatematica();
		mat.calcular();
	}
}