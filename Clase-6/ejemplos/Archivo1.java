import java.io.*;

class ArchivoClaseFile {
	File objcfile;

	void asignar_archivo() {
		objcfile = new File("C:\\up\\images\\javier.jpg");
	}

	void desplegar_info() {
		if (objcfile.exists()) {
			System.out.println("Nombre del archivo " + objcfile.getName());
			System.out.println("Camino " + objcfile.getPath());
			System.out.println("Se puede leer " + objcfile.canRead());
			System.out.println("Se puede escribir " + objcfile.canWrite());
			System.out.println("Tamano en byte " + objcfile.length());
		}
		try {
			System.out.println("\n\n\n Presione enter para salir");
			System.in.read();
		} catch (Exception e) { 
		}
	}
}

public class Archivo1 {
	public static void main(String[] args) throws IOException {
		ArchivoClaseFile ar = new ArchivoClaseFile();
		ar.asignar_archivo();
		ar.desplegar_info();
	}
}