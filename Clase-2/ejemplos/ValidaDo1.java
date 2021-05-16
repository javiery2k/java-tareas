/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class XValidaDo1 {
	private int opc;

	void desplegar() throws IOException {
		do {
			System.out.println("1:Suma ");
			System.out.println("2:Rsta ");
			System.out.println("3:Multiplica ");
			System.out.println("4:Divide ");
			System.out.println("Introduzca la opcion: ");
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			opc = Integer.parseInt(entrada.readLine());
		} while (opc < 1 || opc > 4);
		System.out.println("Sali del Ciclo");
	}
}

public class ValidaDo1 {
	public static void main(String[] args) throws IOException {
		XValidaDo1 vd1 = new XValidaDo1();
		vd1.desplegar();
	}
}