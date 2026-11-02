import java.util.Scanner;

public class PiInteractivo {
	public static void main (String [] args) {

	Scanner entrada = new Scanner(System.in);

	int dardosUsuario = 0;
	int dardosLanzados = 0;
	int dardosAdentro = 0;
	boolean datoNoValido = true;

	while(datoNoValido){
		System.out.println("Escribe un número entero positivo diferente de 0: ");
		if (entrada.hasNextInt()){
			dardosUsuario = entrada.nextInt();

			if(dardosUsuario <= 0){
				System.out.println("Tu número debe ser mayor o igual a 0.");
			}
			else {
				datoNoValido = false;
			}
		} 
		else { 
			entrada.next();
			System.out.println("No es un valor válido.");
		}
	}


	while(dardosLanzados<=dardosUsuario) {
		double x = Math.random();
		double y = Math.random();

		if (x * x + y * y <=1) {
			dardosAdentro += 1;
		}
		dardosLanzados += 1;
	}
	double pi = 4.0 * dardosAdentro / dardosUsuario;
	System.out.println("Número de dardos: " + dardosUsuario);
	System.out.println("Número de dardos que quedaron adentro: " + dardosAdentro);
	System.out.printf("Aproximación de PI: %.6f%n", pi);
	}
}
