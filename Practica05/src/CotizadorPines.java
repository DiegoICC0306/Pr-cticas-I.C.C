public class CotizadorPines{
	public static void main (String [] args){

		int precioCliente1 = 12899;

		String cliente1 = "Robbie Valentino";

		char clasificacionCliente1 = 'E';

		double tasaAnual = 0.15;

		if(clasificacionCliente1 == 'P'){
			 tasaAnual -=0.02;
		}
		else if(clasificacionCliente1 == 'R'){
			 tasaAnual+=0.03;
		}
		else {
			 tasaAnual = tasaAnual;
		}

		double plazoCliente1 = 21.0 / 12;

		double interes = (precioCliente1 * (tasaAnual) * plazoCliente1);

		double total = precioCliente1 + interes;

		double mensualidades = (total / 21);

		double tasaMensual = tasaAnual/12.0;

		double capital = precioCliente1;


		if((clasificacionCliente1 != 'E' && clasificacionCliente1 != 'R' && clasificacionCliente1 != 'P') || (tasaAnual<=0 || plazoCliente1<=0 || interes<=0 || total<=0 || mensualidades<=0)){
			System.out.println("No eres un cliente");
		
		

		if(tasaAnual<=0){
			System.out.println("El valor de tasa anual es inválido: No puede ser menor o igual a cero");
		}


		if(plazoCliente1<=0){
			System.out.println("El valor del plazo es inválido: No puede ser menor o igual a cero");

		}


		if(interes<=0){
			System.out.println("El valor de interés es inválido: No puede ser menor o igual a cero");
		}

		
		if(total<=0){
			System.out.println("El valor del precio total a pagar es inválido: No puede ser menor o igual a cero");
		}

		

		if(mensualidades<=0){
			System.out.println("El valor de las mensualidades es inválido: No puede ser menor o igual a cero");
		}

	} else{

			System.out.printf("=========Bienvenido: %s=========\n Usted es de clasificación: %c\n Debe de intereses: %.2f\n Su total a pagar es: %.2f\n Y sus mensualidades serán de: %.2f\n", cliente1, clasificacionCliente1, interes, total, mensualidades);
		
		System.out.println("\nInterés compuesto con ciclo: ");
			for(int i=1;i<=21;i++){
			capital = capital*(1+tasaMensual);
			System.out.println("En el mes " + i + " se tiene un saldo de: " + capital);
		}
		double formula = (1 + tasaMensual);

		double saldoFinal = precioCliente1 * Math.pow(formula, 21);



		System.out.println("Interés compuesto con la fórumla: " + saldoFinal);

		double interesCompuesto = saldoFinal - precioCliente1;


		System.out.printf("Tasa aplicada = %.0f %%\nPréstamo = $%.2f\nMeses de pago = 21\nInterés simple = $%.2f\nTotal con interés simple = $%.2f\nInterés compuesto = $%.2f\nTotal con interés compuesto = $%.2f\n", tasaAnual * 100, (double) precioCliente1, interes, total, interesCompuesto, saldoFinal);

			}
		}
	}

	