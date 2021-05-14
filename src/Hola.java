import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
	 
		Scanner in = new Scanner(System.in);  
		System.out.println("Por favor ingresa un nombre: ");
		String name = in.nextLine();  
		
		System.out.println("Hola Mundo " + name);
 
	}
}
