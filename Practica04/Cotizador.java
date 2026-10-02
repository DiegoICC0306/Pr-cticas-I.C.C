public class Cotizador{
	public static void main (String [] args){

		int precioCliente1 = 12899;

		String cliente1 = "Robbie Valentino";

		char clasificacionCliente1 = 'E';

		double tasaAnual = 0.15;

		double plazoCliente1 = 21.0 / 12;

		double interes = (precioCliente1 * (tasaAnual) * plazoCliente1);

		double total = precioCliente1 + interes;

		double mensualidades = (total / 21);



		System.out.printf("Bienvenido: %s\n Usted es de clasificación: %c\n Debe de intereses: %.2f\n Su total a pagar es: %.2f\n Y sus mensualidades serán de: %.2f\n", cliente1, clasificacionCliente1, interes, total, mensualidades);


	}
}