/**
 * @author Javier Moran - 8-757-1938
 * 
 */
class XTiposDatos {
	private boolean b;
	private char c;
	private byte j;
	private short k;
	private int m;
	private long n;
	private float x;
	private double y;
	private String facultad;

	XTiposDatos() {
		b = false;
		c = 'R';
		j = 127;
		k = 32767;
		m = 2147483647;
		n = 9223372036854775807L; // L es por long
		x = 3.14159265F; // F es por flota
		y = 3.141592653589793238;
		facultad = "Sistemas Computacionales";
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Fac = " + facultad);
	}
}

public class TiposDatos {
	public static void main(String[] args) {
		new XTiposDatos();
	}
}
