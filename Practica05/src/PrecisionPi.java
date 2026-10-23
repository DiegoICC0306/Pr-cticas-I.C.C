public class PrecisionPi {
	public static void main (String [] args) {
	
	double tolerancia = 0.001;
    int dardosLanzados = 0;
    int dardosAdentro = 0;
    double pi = 0.0;
    double error = Math.abs(Math.PI - pi);

    while (error >= tolerancia) {

        double x = Math.random();
        double y = Math.random();

        if (x * x + y * y <= 1) {
            dardosAdentro++;
        }

        dardosLanzados++;

        pi = 4.0 * dardosAdentro / dardosLanzados;

        error = Math.abs(Math.PI - pi);
    }

    System.out.println("Número de dardos lanzados: " + dardosLanzados);
    System.out.printf("Estimación final de PI: %.6f%n", pi);
}

}