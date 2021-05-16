import java.sql.Connection;
import java.sql.DriverManager;

class Conexion {
	private Connection con;

	Conexion() {
		con = null;
	}

	void conectar() {
		try {
			System.out.println("Estableciendo conexion");
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://C:/up/bd/prueba-db.accdb");
			System.out.println("Se realizo la conexion de la base de datos");
		} catch (Exception sqle) {
			System.out.println(sqle);
		}
	}
}

class AutosConexion {
	public static void main(String[] args) {
		Conexion c = new Conexion();
		c.conectar();
	}
}