package utilidades;

<<<<<<< HEAD
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
=======
import java.io.*;
>>>>>>> 136c5ba7430c459cc4cd26f4d0533950b58280f4

public class Leer {

	public static String dato() {
		String sdato = " ";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		return sdato;

	}

	public static int datoInt() {
		return Integer.parseInt(dato());
	}

	public static float datoFloat() {
		return Float.parseFloat(dato());
	}
//Leer un char por teclado

	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		return c;
	}

	public static long datoLong() {
		return Long.parseLong(dato());
	}

	public static short datoShort() {
		return Short.parseShort(dato());
	}

	public static double datoDouble() {
		return Double.parseDouble(dato());
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 136c5ba7430c459cc4cd26f4d0533950b58280f4
