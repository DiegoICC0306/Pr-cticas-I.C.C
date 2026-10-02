public class ProgramaNuevo{	
	public static void main(String[] args) {
	
/* En la línea 9, se está declarando una variable llamada "producto" que es de tipo String (cadena de texto) y el valor de esta variable es "Laptop para la carrera".
En la línea 10, se esta declarando una variable llamada "precio" que es de tipo int, y su valor es de 15000.
En la línea 11, se está declarando una variable llamada "descuento" que es de tipo into, y su valor es de 3000.
Finalmente, en la línea 14, se está declarando una variable llamada "meses" que es de tipo double (con punto decimal) y que vale 18.0.

*/

	String producto = "Laptop para la carrera";
	int precio = 15000;
	int descuento = 3000;
	double meses = 18.0;

	//Le estamos indicando al programa que imprima "=== Ficha de compra==="

	// System.out.println("=== Ficha de compra ===");

	//Le estamos indicando al programa que imprima "- Producto :" y luego le concatenamos lo que valga la variable de "producto"
	// System.out.println("- Producto : " + producto);	

	//Le indicamos al programa que imprima "- Precio con descuento :"

	// System.out.println("- Precio con descuento : " + (precio - descuento));

	//Le indicamos al sistema que imprima " - Plazo de pago en anios :" y luego que le concatene la división de meses entre 12.0

	// System.out.println("- Plazo de pago en anios : " + (meses / 12.0));

	/*Le indicamos al sistema que imprima "- Pago mensual :, luego se realiza la resta del valor de precio menos el valor de descuento,
	se hace la división del resultado entre 12.0, y finalmente este resultado se concatena con lo que se imprimió al comienzo.
	*/

	// System.out.printf("- Pago mensual : %.2f\n",((precio - descuento) / meses));

	//Le indica al programa que imprima "=== Fin de la ficha ==="

	// System.out.println("=== Fin de la ficha ==="); */
	System.out.printf ("=== Ficha de compra === \n - Producto : %s\n - Precio con descuento : %d\n - Plazo de pago en anios : %.1f\n - Pago Mensual : %.2f\n === Fin de la ficha ===", producto, (precio - descuento), (meses/12.0), (precio - descuento) / meses);
	}
}