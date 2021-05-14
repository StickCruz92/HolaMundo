import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
	 
		int cantidad = 10;
		
		Scanner in = new Scanner(System.in);  
		System.out.println("Por favor ingresa un nombre: ");
		String name = in.nextLine();  
		
		System.out.println("Hola Mundo " + name);
 
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Hola Mundo " + name + " cantidad " + i);
		}
	}
}
