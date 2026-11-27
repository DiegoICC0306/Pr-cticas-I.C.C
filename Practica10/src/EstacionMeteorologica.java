/**
 * Modela una estacion meteorologica universitaria que almacena y procesa
 * las temperaturas diarias (en grados Celsius) de un periodo de monitoreo.
 *
 * @author Diego Emiliano Sánchez Chávez / Luis Angel Lopez Perez
 * @version 2.0
 */
public class EstacionMeteorologica {

    // ATRIBUTOS 
    // POR HACER 

    private String nombreEstacion;
    private double[] temperaturas;
    // CONSTRUCTORES

   /**
     * Inicializa la estacion con el nombre predeterminado "Estacion UNAM"
     * y reserva espacio para una semana (7 dias), marcando cada posicion
     * inicialmente sin lectura registrada (-300.0).
     */
    public EstacionMeteorologica() {
         this.nombreEstacion = "Estacion UNAM";
        this.temperaturas = new double[7];
        for(int i = 0; i < temperaturas.length; i++){
            temperaturas[i] = -300.0;
        }
        // POR HACER (1.1): Inicializa nombre, arreglo e inicializa todas las casillas con ciclo for.
    }
        
        // POR HACER (1.1): Inicializa nombre, arreglo e inicializa todas las casillas con ciclo for.

    // POR HACER (Parte 5.3): Redacta la documentacion Javadoc para este constructor y los metodos restantes.
     /**
     * Inicializa la estacion con el nombre predeterminado "Estacion UNAM"
     * y reserva espacio para una semana (7 dias), marcando cada posicion
     * inicialmente sin lectura registrada (-300.0).
     * @param nombreEstacion Nombre de la sede del monitoreo
     * @param numDias Numero de dias que abarca el tiempo de monitoreo
     */

    public EstacionMeteorologica(String nombreEstacion, int numDias) {
         if(nombreEstacion == null || nombreEstacion.length() <= 0){
        this.nombreEstacion = "Estacion UNAM";
    }else{
        this.nombreEstacion = nombreEstacion;
        }
        if(numDias <= 0){
            this.temperaturas = new double[7];
        }
        else{
            this.temperaturas = new double[numDias];
        }
        
        for(int i=0; i < this.temperaturas.length; i++){
            this.temperaturas[i] = -300.0;
        }
    }
        // POR HACER (1.2): Valida nombreEstacion y numDias; crea el arreglo e inicializa sus casillas en -300.0.

    // METODOS DE CONSULTA Y REGISTRO (PARTE 1)
/**
 * Consulta el nombre asignado a la estacion meteorologica.
 *
 * @return Nombre de la estacion.
 */
    public String getNombreEstacion() {
        // POR HACER (1.3)
        return this.nombreEstacion;    }
/**
 * Consulta la cantidad total de dias configurados en el periodo.
 *
 * @return Numero de dias del arreglo de temperaturas.
 */
    public int getNumeroDias() {
        // POR HACER (1.3)
         return this.temperaturas.length;
    }

    /**
     * Registra la temperatura de un dia especifico en grados Celsius.
     * Solo modifica el arreglo si el indice es valido y la temperatura esta
     * dentro del rango fisico ambiental [-90.0, 60.0].
     *
     * @param indiceDia Posicion del dia a registrar (desde 0 hasta N - 1).
     * @param temp Temperatura ambiental registrada en grados Celsius.
     * @return true si el dato fue valido y se almaceno; false en caso contrario.
     */
    public boolean registrarTemperatura(int indiceDia, double temp){
     if (indiceDia >= 0 && indiceDia < this.temperaturas.length && temp >= -90.0 && temp <= 60.0) {
        this.temperaturas[indiceDia] = temp;
        return true;
    }
    return false;
    }
    /**
 * Obtiene la temperatura almacenada en un dia especifico del periodo.
 *
 * @param indiceDia Posicion del dia a consultar.
 * @return Temperatura registrada en grados Celsius.
 */
    public double obtenerTemperatura(int indiceDia) {
    if (indiceDia >= 0 && indiceDia < this.temperaturas.length) {
        return this.temperaturas[indiceDia];
    }
    return -300.0;
    }
    
    // METODOS ESTADISTICOS (PARTE 2)
    /**
     * Calcula el promedio de las temperaturas registradas durante el monitoreo.
     *
     * @return Temperatura promedio en grados Celsius.
     */

    /**
     * Calcula el promedio de temperatura del periodo en la escala solicitada.
    *
    * @param escala Escala de salida (Escala.CELSIUS o Escala.FAHRENHEIT).
    * @return Temperatura promedio en la escala indicada.
    */

    public double calcularPromedio() {
        double suma = 0.0;
        for (int i = 0; i < temperaturas.length; i++){
            suma = suma + temperaturas[i];
        }
        return suma / temperaturas.length;
        // POR HACER (2.1): Suma todas las temperaturas con un ciclo for y calcula el promedio.
    }
 /**
 * Busca y devuelve la temperatura mas alta registrada en el periodo.
 *
 * @return Temperatura maxima en grados Celsius.
 */
    public double obtenerMaxima() {
        double maximaTemp = temperaturas[0];
        for(int i = 1; i < temperaturas.length; i++){
            if(temperaturas[i] > maximaTemp){
                maximaTemp = temperaturas[i];
            }
        }
        return maximaTemp;
    }
/**
 * Cuenta cuantos dias tuvieron una temperatura estrictamente mayor al umbral.
 *
 * @param umbral Temperatura de referencia en grados Celsius.
 * @return Cantidad de dias que superaron estrictamente el umbral.
 */
    public int contarDiasCalurosos(double umbral) {
        int contador = 0; 
        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] > umbral){
                contador++;
            }
        }
        // POR HACER (2.3): Cuenta cuantos dias superan estrictamente 'umbral'.
        return contador;
    }
/**
 * Genera una cadena de texto con el resumen estadistico de la estacion.
 *
 * @return Resumen con nombre, dias, promedio y temperatura maxima.
 */
    @Override
    public String toString() {
        // POR HACER (2.4): Formato exacto:
        // "Estacion: <nombreEstacion> | Dias: <N> | Promedio: <prom> C | Maxima: <max> C"
        return "Estacion: " + getNombreEstacion() + " | Dias: " + 
        getNumeroDias() + " | Promedio: " + calcularPromedio() + " C | Maxima: "
        + obtenerMaxima() + " C";
    }

    // CONVERSION DE ESCALAS (PARTE 3)
 /**
 * Convierte una lectura de temperatura de grados Celsius a grados Fahrenheit.
 *
 * @param celsius Temperatura en grados Celsius.
 * @return Temperatura equivalente en grados Fahrenheit.
 */

    public static double convertirAFahrenheit(double celsius) {
        return celsius * 1.8 + 32.0;
    }
    public double calcularPromedio(Escala escala){
        double promedioCelsius = calcularPromedio();
        if (escala == Escala.FAHRENHEIT) {
            return convertirAFahrenheit(promedioCelsius);
        }
            return promedioCelsius;
        }
    

    // RETOS (PARTE 4)

  public int buscarPrimerDiaHelada() {
        // Recorre el arreglo y devuelve el indice del primer dia con temp <= 0.0
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] <= 0.0) {
                return i;
            }
        }
        return -1;
    }
    /**
    * Calcula la mayor diferencia absoluta de temperatura entre dos dias consecutivos.
    *
    * @return Mayor variacion termica entre dias seguidos, o 0.0 si hay menos de 2 dias.
    */
    public double mayorCambioConsecutivo() {
        // POR HACER (4.2): Calcula la mayor variacion |t[i+1] - t[i]| entre dias seguidos.
        if (temperaturas.length < 2){
    return 0.0;}
    double mayorCambio = 0.0;
    //Ciclo va hasta length -1 ya que comparamos i con i + 1
    for (int i = 0; i < temperaturas.length - 1; i++){
        double cambioActual = Math.abs(temperaturas[i + 1] - temperaturas[i]);
    
        if (mayorCambio < cambioActual){
        mayorCambio = cambioActual;
    }
    }
    return mayorCambio;
    

    }
}
