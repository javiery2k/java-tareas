import java.io.*;

class ClaseConsulta {
	// crear un objeto de tipo archivo
	DataInputStream archivo = null;
	// creando e inicializando los campos del registro
	// observar que se debe usar clases numericas apropiadas

	private int cedula;
	private String nombre;
	private int edad;

	void desplegar() throws IOException {
		try {
			// * abriendo archivo para lectura */
			archivo = new DataInputStream(new FileInputStream("C:\\up\\estudiantes.txt"));
			// leyendo archivo

			while (true) {
				cedula = archivo.readInt();
				System.out.println("Cedula del Estudiante : " + cedula + " ");
				nombre = archivo.readUTF();
				System.out.println("Nombre de Estudiante: " + nombre + " ");
				edad = archivo.readInt();
				System.out.println("Edad de Estudiante: " + edad + " ");
				System.out.println('\n');
			}
		}

		catch (FileNotFoundException fnfe) {
			/* Archivo no encontrado */ } catch (EOFException e) {
		}
		archivo.close();
	}
}

class ArchivoSecuencialConsulta {
	public static void main(String[] args) throws IOException {
		ClaseConsulta c = new ClaseConsulta();
		c.desplegar();
	}
}