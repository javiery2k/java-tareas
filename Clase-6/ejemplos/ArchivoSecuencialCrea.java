import java.io.*;

class ClaseCrea {
	// crear un objeto de tipo archivo
	DataOutputStream archivo = null;
	// creando e inicializando los campos del registro
	// DataOutputStream archivo=new DataOutputStream(new
	// FileOutputStream("c:\\estudiantes.dat",true));
	private int cedula;
	private String nombre;
	private int edad;

	ClaseCrea() {
		cedula = 0;
		edad = 0;
		nombre = " ";
	}

	// creando objeto teclado para introducir datos
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	// Ciclo que permite: abrir archivo, capturar y grabar datos, dentro de un
	// bloque try
	void grabar() {
		try {
			// * Creando y grabando a un archivo */
			archivo = new DataOutputStream(new FileOutputStream("C:\\up\\estudiantes.txt", true));
			// se capturan datos mientras la cedula sea distinta de 0
			do {
				System.out.println("Introduce la cedula: ");
				cedula = Integer.parseInt(teclado.readLine());
				if (cedula == 0) {
					break;
				}
				System.out.println("Introduce el nombre: ");
				nombre = teclado.readLine();
				System.out.println("Introduce la edad: ");
				edad = Integer.parseInt(teclado.readLine());
				// grabando al archivo
				archivo.writeInt(cedula);
				archivo.writeUTF(nombre);
				archivo.writeInt(edad);
			} while (cedula != 0);
			archivo.close();
		} catch (FileNotFoundException fnfe) {
			/* Archivo no encontrado */ } catch (IOException ioe) {
			/* Error al escribir */ }
	}
}

class ArchivoSecuencialCrea {
	public static void main(String[] args) {
		ClaseCrea c = new ClaseCrea();
		c.grabar();
	} // cierra main
} // cierra clas