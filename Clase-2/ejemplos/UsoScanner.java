/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.util.*;

class XUsoScanner {
	private String nombre;
	private int AnnodeNacimiento;
	private float altura;
	private double peso;
	private char opcion;

	void leer() {
		// Crear objeto Scanner
		Scanner sc = new Scanner(System.in);
		// Solicitar datos
		System.out.print("Ingrese nombre: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese año de nacimiento: ");
		AnnodeNacimiento = sc.nextInt();
		System.out.print("Ingrese altura: ");
		altura = sc.nextFloat();
		System.out.print("Ingrese opcion: ");
		opcion = sc.next().charAt(0);
		System.out.print("Ingrese Peso: ");
		peso = sc.nextDouble();
		System.out.println("LA OPCION FUE " + opcion + " EL NOMBRE ES " + nombre + " AÑO DE NACIMIENTO "
				+ AnnodeNacimiento + " LA ALTURA ES " + altura + " SU PESO ES " + peso);
		sc.close();
	}
}

public class UsoScanner {
	public static void main(String[] args) {
		XUsoScanner ne = new XUsoScanner();
		ne.leer();
	}
}