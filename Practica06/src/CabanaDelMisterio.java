import java.util.Scanner;

public class CabanaDelMisterio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        String nombre = " ";
        char clasificacion = ' ';
        String tipoCliente = " ";
        double capital = 0;
        double tasaBase = 0;
        double tasaAnual = -1;
        double tasaMensual = -1;
        int plazo = 0;

        int opcion = -1;
        int operaciones = 0;
        int errores = 0;
        boolean salir = false;
        boolean datoValido = false;
        String acabarPrograma = " ";


        //Recibir los datos del usuario.

        System.out.println("===== CABAÑA DEL MISTERIO =====");

        System.out.print("Ingresa el nombre del cliente: ");
        nombre = entrada.nextLine();

        // Validar los datos de clasficación.
        do {
            System.out.print("Tipo de cliente (P, E o R): ");

            clasificacion = entrada.next().charAt(0);

            if (clasificacion != 'P' && clasificacion != 'E' && clasificacion != 'R') {

                System.out.println("Clasificacion invalida. Tiene que ser tipo P, E o R.");
            }

        } while (clasificacion != 'P' && clasificacion != 'E' && clasificacion != 'R');

        // Asignar nombre de clasificacion
        if (clasificacion == 'P') {
            tipoCliente = "Preferente";
        } 
        else if (clasificacion == 'E') {
            tipoCliente = "Estandar";
        } 
        else {
            tipoCliente = "Riesgoso";
        }

        // Verficar los datos de capital
        datoValido = false;

        while (!datoValido) {

            System.out.print("Ingresa el capital del prestamo: ");

            if (entrada.hasNextDouble()) {

                capital = entrada.nextDouble();

                if (capital > 0) {
                    datoValido = true;
                } 
                else {
                    System.out.println("El capital debe ser mayor que cero.");
                }

            } 
            else {
                System.out.println("Debes ingresar un numero valido.");
                entrada.next();
            }
        }

        // Verificar los datos de tasa anual.
        datoValido = false;

        while (!datoValido) {

            System.out.print("Ingresa la tasa anual base: ");

            if (entrada.hasNextDouble()) {

                tasaBase = entrada.nextDouble();

                if (tasaBase >= 0) {
                    datoValido = true;
                } 
                else {
                    System.out.println("La tasa no puede ser negativa.");
                }

            } 
            else {
                System.out.println("Debes ingresar un numero valido.");
                entrada.next();
            }
        }

       // Verificar los datos del plazo.
        datoValido = false;

        while (!datoValido) {

            System.out.print("Ingresa el plazo en meses: ");

            if (entrada.hasNextInt()) {

                plazo = entrada.nextInt();

                if (plazo > 0) {
                    datoValido = true;
                } 
                else {
                    System.out.println("El plazo debe ser mayor que cero.");
                }

            } 
            else {
                System.out.println("El plazo debe ser un entero positivo.");
                entrada.next();
            }
        }

       //AJUSTAR LA TASA ANUAL DEPENDIENDO DE LA CLASIFICACIÓN.

        tasaAnual = tasaBase;

        if (clasificacion == 'P') {
            tasaAnual -= 0.02;

        } 
        else if (clasificacion == 'R') {
            tasaAnual += 0.03;
        }

        tasaMensual = tasaAnual / 12.0;

        //BLOQUE DEL MENÚ.

         while (!salir && operaciones < 5 && errores < 3) {

            System.out.println("\n //// Sistema de Prestamos de la Cabaña del Misterio ////");
            System.out.println("\n > Las operaciones disponibles son:");
            System.out.println("\n 1) Cotizar con interés simple.");
            System.out.println("\n 2) Cotizar con interés compuesto.");
            System.out.println("\n 3) Comparar interés simple con interés compuesto.");
            System.out.println("\n 4) Cambiar el capital de prestamo.");
            System.out.println("\n 0) Salir.");
            System.out.println("\n <Por favor, elija una opción.");

             if (entrada.hasNextInt()) {

                opcion = entrada.nextInt();

                if (opcion >= 0 && opcion <= 4) {

                if (opcion == 0){
                    salir = true;
                    acabarPrograma = "Ha salido del programa.";
                }

                else if (opcion == 1){
                     double interesSimple = capital * tasaAnual * (plazo / 12.0);

                        double totalSimple = capital + interesSimple;

                        System.out.println("\n===== COTIZACION DE INTERES SIMPLE =====");

                        System.out.println("Nombre: " + nombre);

                        System.out.println("Tipo de cliente: " + tipoCliente);

                        System.out.printf("Capital del prestamo: $%.2f\n", capital);

                        System.out.printf("Tasa anual: %.2f %%\n", tasaAnual * 100);

                        System.out.println("Plazo en meses: " + plazo);

                        System.out.printf("Interes simple = $%.2f\n",interesSimple);

                        System.out.printf("Total a pagar = $%.2f\n", totalSimple);

                        operaciones++;
                    }
                else if (opcion == 2){
                        double saldo = capital;

                        System.out.println("\n===== COTIZACION DE INTERES COMPUESTO =====");

                        System.out.println("Nombre: " + nombre);
                        System.out.println("Tipo de cliente: " + tipoCliente);

                        System.out.printf("Capital del prestamo: $%.2f\n",
                                          capital);

                        System.out.printf("Tasa anual: %.2f %%\n",
                                          tasaAnual * 100);

                        System.out.println("Plazo en meses: " + plazo);

                        for(int i=1;i<=plazo;i++){
                            saldo = saldo*(1+tasaMensual);
                            System.out.println("En el mes " + i + " se tiene un saldo de: " + saldo);
                        }

                        double interesCompuesto = saldo - capital;
                        System.out.printf("Interes compuesto = $%.2f\n", interesCompuesto);

                        System.out.printf("Total a pagar = $%.2f\n", saldo);

                        operaciones++;
                    }
                else if (opcion == 3){
                    double interesSimple = capital * tasaAnual * (plazo / 12.0);

                    double formula = (1 + tasaMensual);

                    double saldoFinal = capital * Math.pow(formula, plazo);

                    double interesCompuesto = saldoFinal - capital;

                    double diferenciaIntereses = Math.abs(interesSimple - interesCompuesto);

                    System.out.printf("El interés simple es de: $%.2f%n", interesSimple);

                    System.out.printf("El interés compuesto es de: $%.2f%n", interesCompuesto);

                    System.out.printf("La diferencia entre ellos es de: $%.2f%n", diferenciaIntereses);

                    if(interesSimple>interesCompuesto){
                        System.out.println("El interés simple es mayor.");
                    }
                    else if(interesSimple<interesCompuesto){
                        System.out.println("El interés compuesto es mayor.");
                    }
                    else {
                        System.out.println("Ambos intereses son iguales.");
                    }

                    operaciones++;
                }
                else if (opcion == 4){
                    datoValido = false;

                    while(!datoValido){

                            System.out.print("Ingresa el nuevo capital: ");

                            if (entrada.hasNextDouble()) {
                                double nuevoCapital = entrada.nextDouble();

                                if (nuevoCapital > 0) {
                                    capital = nuevoCapital;
                                    datoValido = true;

                                    System.out.println("Capital actualizado correctamente.");

                                } 
                                else {
                                    
                                    System.out.println("El capital debe ser mayor que cero.");
                                    
                                }

                            } 
                            else {
                                
                                System.out.println("Debes ingresar un numero.");

                                entrada.next();
                            }
                        }

                        operaciones++;
                    }
                }
                else {
                    errores++;
                    System.out.println("Esa no es una opción válida. Por favor, ingresa un número de los indicados en el menú.");
                }
            }
            else {
                errores++;
                System.out.println("Tienes que ingresar ser un número entero.");
                entrada.next();
            }
        }

        // Buscar porque se finalizó el programa.

        if (operaciones == 5) {

            acabarPrograma = "Alcanzaste el límite de operaciones (5)";

        } 
        else if (errores == 3) {

            acabarPrograma = "Alcanzaste el máximo de errores (3)";
        }

        // Imprimir el resumen final.

        System.out.println("\n========== RESUMEN FINAL ==========");

        System.out.println("Cliente: " + nombre);

        System.out.println("Operaciones realizadas: " + operaciones);

        System.out.println("Errores del menu: " + errores);

        System.out.printf("Capital final: $%.2f\n", capital);

        System.out.println("Motivo de finalizacion: " + acabarPrograma);

        System.out.println("\nGracias por utilizar el programa de la Cabaña del Misterio.");

    }
}