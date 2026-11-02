import java.util.Scanner;


public class BinarioInteractivo {
	public static void main(String [] args) {

	Scanner entrada = new Scanner(System.in);


		int numeroUsuario = -1;
	
		String numeroBinario = "";

		boolean datoInvalido = true;

		char continuar = 'S';

		boolean acabarCiclo = true;

		while(continuar== 'S' || continuar== 's'){
			datoInvalido = true;
			while(datoInvalido){
				System.out.println("Introduce un número entero positivo: ");
			if(entrada.hasNextInt()){
				numeroUsuario = entrada.nextInt();

				if (numeroUsuario < 0){
					System.out.println("Tu número debe ser positivo.");
				}
				else{
					datoInvalido = false;
				}
		}
				else{
					System.out.println("El dato ingresado no es un número/ no es entero.");
					entrada.next();
				}
	}
			
			numeroBinario = "";
			if(numeroUsuario == 0){
				numeroBinario = "0";
			}

			else{
				while(numeroUsuario>0){
			
			int residuo = numeroUsuario % 2;
			numeroBinario = residuo + numeroBinario;
			numeroUsuario = numeroUsuario / 2;
			}
		}
			System.out.println("Tu número en binario es:" + numeroBinario);

			System.out.print("¿Quieres intentar con otro número?(S/N)");
			continuar = entrada.next().charAt(0);
		
				}
		}

	}
