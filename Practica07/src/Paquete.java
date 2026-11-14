/**
 * Clase que modela un paquete para una empresa de envios postales y paqueteria.
 * Permite registrar sus dimensiones espaciales, peso fisico y valor declarado,
 * asi como calcular su peso volumetrico y determinar el peso cobrable final.
 * 
 * @author Diego Emiliano Sánchez Chávez
 * @version 1.0
 */
public class Paquete {


    // *** ATRIBUTOS ***
   /**
    * Representa el código de rastreo del paquete.
    * 
    */
    private String codigoRastreo;
    /**
     * Representa el peso en kilogramos del paquete.
     * 
     */
    private double pesoEnKilos;
    /**
     * Representa la altura del paquete.
     * 
     */
    private double alto;
    /**
     * Representa el ancho del paquete.
     */
    private double ancho;
    /**
     * Representa el largo del paquete.
     * 
     */
    private double largo;
    /**
     *Representa el valor monetario declarado del paquete.
     * 
     */
    private double valorMonetario;

    // *** CONSTRUCTORES ***
    /**
     * Constructor por defecto de un paquete. No recibe parametros.
     * Inicializa el código en: "Sin Código."
     * Incizializa el peso en: 0.0
     * Inicizliza el alto en: 0.0
     * Inicializa el alto en: 0.0
     * Inicializa el ancho en: 0.0
     * Inicializa el valor delcararado en: 0.0
     */
    public Paquete(){

    this.codigoRastreo = "Sin Código.";

    this.pesoEnKilos = 0.0;

    this.alto = 0.0;

    this.ancho = 0.0;

    this.largo = 0.0;

    this.valorMonetario = 0.0;
    }

    /** Constructor con parámetros de un paquete.
     * Crea un paquete con los datos introducidos por el usuario. Deben ser datos válidos (mayores que 0), de lo contrario, se asignan valor por defecto.
     * 
     * @param codigoRastreo El código de rastreo del paquete.
     * @param pesoEnKilos El peso que tenga el paquete.
     * @param alto La altura del paquete
     * @param ancho El ancho del paquete.
     * @param largo El largo del paquete.
     * @param valorMonetario El valor declarado del paquete.
     */ 

    public Paquete(String codigoRastreo, double pesoEnKilos, double alto, double ancho, double largo, double valorMonetario){
    //Verificar que el código no este vació.
    if (codigoRastreo.length() > 0){
            this.codigoRastreo = codigoRastreo;
        }                                                                                 
        else {
            this.codigoRastreo = "Sin Código.";
        }
    //Verificar que el peso no sea negativo.
    if (pesoEnKilos > 0){
            this.pesoEnKilos = pesoEnKilos;
        }                                                                                 
        else {
            this.pesoEnKilos = 0.1;
        }
    //Verificar que la altura no sea negativa
    if (alto > 0){
            this.alto = alto;
        }                                                                                 
        else {
            this.alto = 0.1;
        }
    //Verificar que el ancho no sea negativo
    if (ancho > 0){
            this.ancho = ancho;
        }                                                                                 
        else {
            this.ancho = 0.1;
        }
    //Verificar que el largo no sea negativo
     if (largo > 0){
            this.largo = largo;
        }                                                                                 
        else {
            this.largo = 0.1;
        }
    //Verificar que el valor monetario no sea negativo
     if (valorMonetario >= 0){
            this.valorMonetario = valorMonetario;
        }                                                                                 
        else {
            this.valorMonetario = 0;
    }
}
    // *** METODOS DE ACCESO Y ASIGNACION ***
    
    /**
     * Método para obtener el código de rastreo.
     * @return El código de rastreo del paquete.
     * 
     */
    public String getCodigoRastreo(){
        return codigoRastreo;
    }
    /**
     * Método para cambiar el código de rastreo de un paquete. El código no debe estar vacío, si no, regresara un error.
     * @param nuevoCodigoRastreo El código de rastreo que reemplazara al anterior.
     * 
     */
    public void setCodigoRastreo(String nuevoCodigoRastreo){
        if (nuevoCodigoRastreo.length() > 0) {
            this.codigoRastreo = nuevoCodigoRastreo;
        } 
        else {
            System.out.println("Error: Código inválido.");
        }
    }
    /**
     * Método para obtener el peso en kilos.
     * @return El peso en kilos del paquete.
     * 
     */
    public double getPesoEnKilos(){
        return pesoEnKilos;
    }
    /**
     * Método para cambiar el peso del paquete. El peso no debe ser menor que 0, de lo contrario mandará un error.
     * @param nuevoPesoEnKilos El peso en kilos del paquete que reemplazará al anterior.
     * 
     */
    public void setPesoEnKilos(double nuevoPesoEnKilos){
    if (nuevoPesoEnKilos > 0) {
            this.pesoEnKilos = nuevoPesoEnKilos;
        } else {
            System.out.println("Error: Peso inválido.");
        }
    }
    /**
     * Método para obtener la altura del paquete.
     * @return La altura del paquete.
     * 
     */
    public double getAlto(){
        return alto;
    }
     /**
     * Método para cambiar la altura del paquete. La altura no debe ser menor que 0, de lo contrario mandará un error.
     * @param nuevoAlto La altura del paquete que reemplazará al anterior.
     * 
     */
    public void setAlto(double nuevoAlto){
    if (nuevoAlto > 0) {
            this.alto = nuevoAlto;
        } else {
            System.out.println("Error: Altura inválida.");
        }
    }
    /**
     * Método para obtener el ancho del paquete.
     * @return El ancho del paquete.
     * 
     */
    public double getAncho(){
        return ancho;
    }
    /**
     * Método para cambiar el ancho del paquete. El ancho no debe ser menor que 0, de lo contrario mandará un error.
     * @param nuevoAncho El ancho del paquete que reemplazará al anterior.
     * 
     */
    public void setAncho(double nuevoAncho){
        if (nuevoAncho > 0) {
            this.ancho = nuevoAncho;
        } else {
            System.out.println("Error: Ancho inválido.");
        }
    }
    /**
     * Método para obtener el largo del paquete.
     * @return El largo del paquete.
     * 
     */
    public double getLargo(){
        return largo;
    }
    /**
     * Método para cambiar el largo del paquete. El largo no debe ser menor que 0, de lo contrario mandará un error.
     * @param nuevoLargo El largo del paquete que reemplazará al anterior.
     * 
     */
    public void setLargo(double nuevoLargo){
        if (nuevoLargo > 0) {
            this.largo = nuevoLargo;
        } else {
            System.out.println("Error: Largo inválido.");
        }
    }
    /**
     * Método para obtener el valor monetario del paquete.
     * @return El valor montario del paquete.
     * 
     */
    public double getValorMonetario(){
        return valorMonetario;
    }
    /**
     * Método para cambiar el valor monetario del paquete. El valor monetario no debe ser menor que 0, de lo contrario mandará un error.
     * @param nuevoValorMonetario El valor monetario del paquete que reemplazará al anterior.
     * 
     */
    public void setValorMonetario(double nuevoValorMonetario){
        if (nuevoValorMonetario >= 0) {
            this.valorMonetario = nuevoValorMonetario;
        } else {
            System.out.println("Error: Precio inválido.");
        }
    }

    // *** METODOS CALCULADORES BASE ***

    /**
     * Calcula el peso volumetrico del paquete segun el estandar comercial (IATA):
     * (largo * ancho * alto) / 5000.
     * 
     * @return El peso volumetrico equivalente en kilogramos.
     */
    public double calculaPesoVolumetrico() {
        return (this.largo * this.ancho * this.alto) / 5000.0;
    }

    /**
     * Determina el peso cobrable final para efectos de tarificacion postal,
     * el cual corresponde al valor maximo entre el peso fisico y el volumetrico.
     * 
     * @return El mayor entre el peso real y el peso volumetrico.
     */
    public double obtenerPesoCobrable() {
        if(pesoEnKilos > calculaPesoVolumetrico()){
            return this.pesoEnKilos;
        } 
        else{
            return calculaPesoVolumetrico();
        }
    }

    // *** PROPUESTA PERSONAL ***
    // POR HACER: Agrega aqui al menos un nuevo metodo calculador util para la empresa
    // (ejemplo: recargo por envio express, costo por material fragil, descuento local, etc.)
    // Incluye sus comentarios Javadoc y los atributos necesarios.
    /**
     *Determina el 30% que se le agraga al precio del paquete si es un envió express.
     * Multiplica por 0.30 el valor del paquete, y luego le suma el resultado al valor del paquete original.
     * 
     * @return El 30% extra sumado al precio del paquete.
     */
    public double calcularPrecioExpress(){
        return this.valorMonetario + (valorMonetario * 0.30);
    }
}
