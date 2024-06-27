package Juego;

import java.util.Scanner;

public class main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// generar el núm aleatorio
		int aleatorio = 0;
		aleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(aleatorio);
		int intentos=0;
		int numElegido;
		
		do {
			
			//ingresar núm por teclado
			Scanner scanner = new Scanner(System.in);
			System.out.println("Elija un número del 1 al 10");
			numElegido = scanner.nextInt();
			generarLineaLarga();
			intentos++;//contador
			
			//comparar núm aleatorio con el núm ingresado
			if (aleatorio == numElegido) {
				System.out.println("Ha ganado! El número era " + aleatorio);
				generarLineaLarga();
				scanner.close();
			}
			else {
				//si el número ingresado es menor al aleatorio
				if (numElegido<aleatorio) {
					System.out.println("Número demasiado bajo");
					generarLineaLarga();
				}else{
					//si el número ingresado es mayor al aleatorio
					if(numElegido>aleatorio) {
						System.out.println("Número demasiado alto");
						generarLineaLarga();}
				       }
				}
		}//cierra do
		
		//hacer que se repita la operación
		while(intentos <5 & numElegido != aleatorio); //cierra do while
		if (numElegido != aleatorio) {
			System.out.println("Ha perdido! El número era " + aleatorio);
			generarLineaLarga();
		}
		scanner.close();	
		System.out.println("FIN DEL JUEGO");
		
	}//cierra public static

	public static void generarLineaLarga() {
		System.out.println("________________________________\n");
		}
}//cierra class main
