public class EstimacionPi {
	public static void main (String [] args) {
	int dardosTotal = 1000000;
	int dardosLanzados = 0;
	int dardosAdentro = 0;
	while(dardosLanzados<=dardosTotal) {
		double x = Math.random();
		double y = Math.random();

		if (x * x + y * y <=1) {
			dardosAdentro += 1;
		}
		dardosLanzados += 1;
	}
	double pi = 4.0 * dardosAdentro / dardosTotal;
	System.out.println("Número de dardos: " + dardosTotal);
	System.out.println("Número de dardos que quedaron adentro: " + dardosAdentro);
	System.out.printf("Aproximación de PI: %.6f%n", pi);
	}
}