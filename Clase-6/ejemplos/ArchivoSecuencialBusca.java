import java.io.*;

class ClaseBusca {

	DataInputStream archivo = null;

	private int cedula;
	private String nombre;
	private int edad;

	void buscar() throws IOException {
		try {
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Cedula a buscar: ");
			int cedulabuscar = Integer.parseInt(teclado.readLine());

			archivo = new DataInputStream(new FileInputStream("C:\\up\\estudiantes.txt"));

			while (true) {
				cedula = archivo.readInt();
				nombre = archivo.readUTF();
				edad = archivo.readInt();
				if (cedulabuscar == cedula) {
					System.out.println("Cedula del Estudiante : " + cedula + " ");
					System.out.println("Nombre de Estudiante: " + nombre + " ");
					System.out.println("Edad de Estudiante: " + edad + " ");
					System.out.println('\n');
				}
			}
		}

		catch (FileNotFoundException fnfe) {
			/* Archivo no encontrado */ } catch (EOFException e) {
		}
		archivo.close();
	}
}

public class ArchivoSecuencialBusca {
	public static void main(String[] args) throws IOException {
		ClaseBusca b = new ClaseBusca();
		b.buscar();
	} // cierra main
} // cierra clase